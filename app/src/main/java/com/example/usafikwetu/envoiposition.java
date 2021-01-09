package com.example.usafikwetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class envoiposition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envoiposition);

    }

    public void Sorti(View view) {
        this.finish();
    }

    public void envoiposition(View view) {
        Intent intent= new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}