package com.example.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class AboutUsFragment extends Fragment {
    ImageView twitter, insta, gmail, facebook;

    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        twitter = view.findViewById(R.id.twitter_logo);
        insta = view.findViewById(R.id.instagram_logo);
        facebook = view.findViewById(R.id.facebook_logo);
        gmail = view.findViewById(R.id.gmail_logo);

        insta.setOnClickListener(v -> gotoUrl("https://www.instagram.com/sandeshpandey.101/"));
        twitter.setOnClickListener(v -> gotoUrl("https://twitter.com/sandesh_61"));
        facebook.setOnClickListener(v -> gotoUrl("https://www.facebook.com/p.sandesh61"));
        gmail.setOnClickListener(v -> {
            String to_email;
            to_email="sandeshpandey2032@gmail.com";
            sendEmail(to_email);
        });

        return view;
    }

    private void sendEmail(String to_email) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"contact.istacoat@gmail.com"});
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Chose email client:"));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}