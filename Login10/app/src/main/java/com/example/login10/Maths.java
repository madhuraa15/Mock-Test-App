package com.example.login10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Maths extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Let's Start !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MLevel1.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Let's Start !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MLevel2.class);
                startActivity(intent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Let's Start !!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MLevel3.class);
                startActivity(intent);

            }
        });
    }
}
