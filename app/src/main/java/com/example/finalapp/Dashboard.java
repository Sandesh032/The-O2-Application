package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    String url, maths, coa, os, osLab, dsa, dsaLab, dtm, app, poe, vr, name, id, regNo, email;
    String totMaths, totCoa, totDsa, totDsaLab, totOs, totOsLab, totDtm, totPoe, totVr, totApp;
    TextView textName, textReg, textEmail, textStdId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Menu Hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        menuIcon = findViewById(R.id.menu_icon);

        navigationDrawer();

        //API Hooks
        url = getIntent().getStringExtra("photoUrl");

        maths = getIntent().getStringExtra("attMaths");
        coa = getIntent().getStringExtra("attCoa");
        os = getIntent().getStringExtra("attOs");
        osLab = getIntent().getStringExtra("attOsLab");
        dsa = getIntent().getStringExtra("attDsa");
        dsaLab = getIntent().getStringExtra("attDsaLab");
        dtm = getIntent().getStringExtra("attDtm");
        app = getIntent().getStringExtra("attApp");
        poe = getIntent().getStringExtra("attPoe");
        vr = getIntent().getStringExtra("attVr");

        totMaths = getIntent().getStringExtra("totMaths");
        totCoa = getIntent().getStringExtra("totCoa");
        totDsa = getIntent().getStringExtra("totDsa");
        totDsaLab = getIntent().getStringExtra("totDsaLab");
        totOs = getIntent().getStringExtra("totOs");
        totOsLab = getIntent().getStringExtra("totOsLab");
        totDtm = getIntent().getStringExtra("totDtm");
        totPoe = getIntent().getStringExtra("totPoe");
        totVr = getIntent().getStringExtra("totVr");
        totApp = getIntent().getStringExtra("totApp");

        name = getIntent().getStringExtra("stdName");
        if (name == null) name = "Student Name: Sandesh Pandey";
        else name = "Student Name: " + name;

        id = getIntent().getStringExtra("stdId");
        if (id == null) id = "Student ID:\t\t\t\t\t586645";
        else id = "Student ID:\t\t\t\t\t" + id;

        regNo = getIntent().getStringExtra("stdRegNo");
        if (regNo == null) regNo = "Register No.\t\t\t\tRA2211003012080";
        else regNo = "Register No.\t\t\t\t" + regNo;

        email=getIntent().getStringExtra("stdEmail");
        if(email==null) email="Email id:\t\t\t\t\t\t\t\t\tsandeshpandey2032@gmail.com";
        else email = "Email id:\t\t\t\t\t\t\t\t\t" + email;

        //Text Hooks
        textName = findViewById(R.id.stdName);
        textReg = findViewById(R.id.stdRegNo);
        textEmail = findViewById(R.id.stdEmail);
        textStdId = findViewById(R.id.stdId);

        textName.setText(name);
        textStdId.setText(id);
        textReg.setText(regNo);
        textEmail.setText(email);

        ImageView imageView = findViewById(R.id.profileImage);
        Glide.with(this)
                .load(R.drawable.error)
                .error("https://sp.srmist.edu.in/srmiststudentportal/resources/sphotos/98253978193b9c07472c3caadd28035d.jpg?rn=3067")
                .into(imageView);
    }

    //Navigation Drawer
    private void navigationDrawer() {

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(v -> {
            if (drawerLayout.isDrawerVisible(GravityCompat.START))
                drawerLayout.closeDrawer(GravityCompat.START);
            else drawerLayout.openDrawer(GravityCompat.START);
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        item.setChecked(true);

        if (id == R.id.nav_home) {
            Intent intent = new Intent(getApplicationContext(), Dashboard.class);
            startActivity(intent);
        } else if (id == R.id.nav_timetable) {
            loadFragment(new TimeTableFragment());
        } else if (id == R.id.nav_applyOd) {
            loadFragment(new mailFaFragment());
        } else if (id == R.id.nav_aboutUs) {
            loadFragment(new AboutUsFragment());
        } else if (id == R.id.nav_attendance) {
            AttendanceFragment fragment = AttendanceFragment.newInstance(
                    maths, coa, os, osLab, dsa, dsaLab, dtm, app, poe, vr,
                    totMaths, totCoa, totDsa, totDsaLab, totOs, totOsLab, totDtm, totPoe, totVr, totApp
            );
            loadFragment(fragment);
        }
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void loadFragment(Fragment fragment) {
        FrameLayout fl = findViewById(R.id.frameLayout);
        fl.removeAllViews();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frameLayout, fragment);
        ft.commit();
    }
}