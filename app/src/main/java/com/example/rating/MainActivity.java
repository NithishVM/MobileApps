package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {
    RatingBar rate;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rate = findViewById(R.id.ratingBar);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String init= ""+ rate.getNumStars();
                String fin= ""+ rate.getRating();
                Toast.makeText(getApplicationContext(), "Total Number of Points"+init, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "\n Rating is "+fin, Toast.LENGTH_SHORT).show();
            }
        });
    }
}