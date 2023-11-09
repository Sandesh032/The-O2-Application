package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalapp.api.ApiService;
import com.example.finalapp.model.LoginRequest;
import com.example.finalapp.model.LoginResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class loginScreen extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
//    private Button btn_temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        editTextEmail = findViewById(R.id.login_email);
        editTextPassword = findViewById(R.id.login_password);

        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(v -> handleLogin());
    }

    private void handleLogin() {
        Gson gson = new GsonBuilder().setLenient().create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.5.228.54:8080/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        LoginRequest loginRequest = new LoginRequest(email, password);

        // Start the loadingScreen activity
        Intent loadingIntent = new Intent(loginScreen.this, loadingScreen.class);
        startActivity(loadingIntent);

        Call<LoginResponse> call = apiService.loginUser(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call, @NonNull Response<LoginResponse> response) {
                finish();
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    assert loginResponse != null;
                    String message = loginResponse.getMessage();
                    if (message.equals("Login successful")) {
                        // Create intent for Dashboard

                        Intent dashboardIntent = new Intent(loginScreen.this, Dashboard.class);
                        dashboardIntent.putExtra("photoUrl", loginResponse.getPhotoUrl());
                        dashboardIntent.putExtra("attMaths", loginResponse.getAtt_maths());
                        dashboardIntent.putExtra("attCoa", loginResponse.getAtt_coa());
                        dashboardIntent.putExtra("attOs", loginResponse.getAtt_os());
                        dashboardIntent.putExtra("attOsLab", loginResponse.getAtt_os_lab());
                        dashboardIntent.putExtra("attDsa", loginResponse.getAtt_dsa());
                        dashboardIntent.putExtra("attDsaLab", loginResponse.getAtt_dsa_lab());
                        dashboardIntent.putExtra("attDtm", loginResponse.getAtt_dtm());
                        dashboardIntent.putExtra("attApp", loginResponse.getAtt_App());
                        dashboardIntent.putExtra("attPoe", loginResponse.getAtt_poe());
                        dashboardIntent.putExtra("attVr", loginResponse.getAtt_vr());
                        dashboardIntent.putExtra("stdName", loginResponse.getName());
                        dashboardIntent.putExtra("stdId", loginResponse.getStdId());
                        dashboardIntent.putExtra("stdRegNo", loginResponse.getRegNo());
                        dashboardIntent.putExtra("stdEmail", loginResponse.getEmail());
                        dashboardIntent.putExtra("totMaths", loginResponse.getTot_maths());
                        dashboardIntent.putExtra("totCoa", loginResponse.getTot_coa());
                        dashboardIntent.putExtra("totDsa", loginResponse.getTot_dsa());
                        dashboardIntent.putExtra("totDsaLab", loginResponse.getTot_dsa_lab());
                        dashboardIntent.putExtra("totOs", loginResponse.getTot_os());
                        dashboardIntent.putExtra("totOsLab", loginResponse.getTot_os_lab());
                        dashboardIntent.putExtra("totDtm", loginResponse.getTot_dtm());
                        dashboardIntent.putExtra("totPoe", loginResponse.getTot_poe());
                        dashboardIntent.putExtra("totVr", loginResponse.getTot_vr());
                        dashboardIntent.putExtra("totApp", loginResponse.getTot_app());

                        startActivity(dashboardIntent);
                        finish(); // Finish this activity to prevent going back to login screen
                    } else {
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "API Call Failed", Toast.LENGTH_SHORT).show();
                    finish();
                }
                // Finish the loadingScreen activity
                finish();
            }
            @Override
            public void onFailure(@NonNull Call<LoginResponse> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(), "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                // Finish the loadingScreen activity
                finish();
            }
        });
    }
}