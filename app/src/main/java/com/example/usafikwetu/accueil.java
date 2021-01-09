package com.example.usafikwetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class accueil extends AppCompatActivity {

    private Button Change;
    private LinearLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Change=(Button)findViewById(R.id.buttonCol);
        Back=(LinearLayout)findViewById(R.id.fond);

        Change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Back.setBackgroundColor(Color.BLACK);
            }
        });

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