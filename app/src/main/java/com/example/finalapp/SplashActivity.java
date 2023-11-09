package com.example.finalapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    private static final int splashTimer=3000;
    ImageView backgroundImage;
    Animation sideAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        backgroundImage=findViewById(R.id.splash_icon);

        sideAnim= AnimationUtils.loadAnimation(this,R.anim.side_anim);

        backgroundImage.setAnimation(sideAnim);

        new Handler().postDelayed(() -> {
            Intent intent=new Intent(getApplicationContext(), loginScreen.class);
            startActivity(intent);
            finish();
        },splashTimer);
    }
}