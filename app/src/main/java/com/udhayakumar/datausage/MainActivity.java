package com.udhayakumar.datausage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getApplicationContext().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA_FRONT)) {
            Toast.makeText(this,"irruku",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"no",Toast.LENGTH_LONG).show();
        }
    }
}