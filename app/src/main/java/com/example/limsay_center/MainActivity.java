package com.example.limsay_center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickHospital(View view) {
        Intent i = new Intent(this,Hospital.class);
        startActivity(i);
    }

    public void clickPolice(View view) {
        Intent i = new Intent(this,Police.class);
        startActivity(i);
    }

    public void clickSuperMarket(View view) {
        Intent i = new Intent(this,SuperMarket.class);
        startActivity(i);
    }

    public void clickSchool(View view) {
        Intent i = new Intent(this,School.class);
        startActivity(i);
    }
}