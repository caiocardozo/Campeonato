package com.example.caiocardozo.campeonatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textBrasileiro = findViewById(R.id.textBrasileiro);
        textBrasileiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BrasileiroActivity.class);
                startActivity(intent);

            }
        });

        TextView textAlemao = findViewById(R.id.textAlemao);
        textAlemao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlemaoActivity.class);
                startActivity(intent);
            }
        });


        TextView textEspanhol = findViewById(R.id.textEspanhol);
        textEspanhol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlemaoActivity.class);
                startActivity(intent);
            }
        });

        TextView textItaliano = findViewById(R.id.textItaliano);
        textItaliano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlemaoActivity.class);
                startActivity(intent);
            }
        });

        TextView textIngles = findViewById(R.id.textIngles);
        textIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlemaoActivity.class);
                startActivity(intent);
            }
        });
    }
}
