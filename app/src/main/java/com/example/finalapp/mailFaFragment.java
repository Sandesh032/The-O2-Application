package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class mailFaFragment extends Fragment {
    EditText editTextMsg, editTextName;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mail_fa, container, false);
        button = view.findViewById(R.id.applyOdButton);

        editTextMsg = view.findViewById(R.id.msg);
        editTextName=view.findViewById(R.id.name_regno);
        button.setOnClickListener(v -> {
            String subject, msg, content, to_email, name;
            subject = "Application For OD";
            msg = editTextMsg.getText().toString();
            name = editTextName.getText().toString();
            to_email = "vidhyalm1@srmist.edu.in";
            content = "Hello ma'am,\n\n I am " + name + " from O2 section." + msg + "\n\nSincerely yours,\n" + name;

            sendEmail(subject, content, to_email);
        });

        TextInputLayout textInputLayoutName = view.findViewById(R.id.textInputLayoutName);
        TextInputLayout textInputLayoutMsg = view.findViewById(R.id.textInputLayoutMsg);
        TextInputEditText editText = view.findViewById(R.id.name_regno);

        editText.setOnClickListener(view1 -> {
            textInputLayoutName.setHint("");
            textInputLayoutMsg.setHint("");
        });
        return view;
    }

    public void sendEmail(String subject, String content, String to_email) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to_email});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, content);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Chose email client:"));
    }
}