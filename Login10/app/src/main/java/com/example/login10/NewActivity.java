package com.example.login10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class NewActivity extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select Level of Difficulty !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Physics.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select Level of Difficulty !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Maths.class);
                startActivity(intent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select Level of Difficulty !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Chem.class);
                startActivity(intent);

            }
        });
    }
}