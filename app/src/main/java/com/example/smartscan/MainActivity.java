package com.example.smartscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public abstract class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     // Pour lancer une autre activité / Ecran
//        Intent i= new Intent(this,Camera.class);
//        startActivity(i);
    }
}