package com.example.usafikwetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

    }

    public void QuitterActivity(View view) {
        this.finish();
    }

    public void AllerVersPosition(View view) {
        Intent intent= new Intent(this, envoiposition.class);
        startActivity(intent);
    }

    public void AllerVersConctact(View view) {
        Intent intent= new Intent(this, contact.class);
        startActivity(intent);
    }

    public void Apropos(View view) {
        Intent intent= new Intent(this, aide.class);
        startActivity(intent);
    }
}