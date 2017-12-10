package com.example.fadil.rumusbangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button segitiga,persegip,persegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        segitiga = (Button) findViewById(R.id.segitiga);
        persegip = (Button) findViewById(R.id.persegipanjang);
        persegi = (Button) findViewById(R.id.persegi);

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, segitiga.class);
                startActivity(i);
            }
        });

        persegip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, persegipanjang.class);
                startActivity(i);
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,persegi.class);
                startActivity(i);
            }
        });

    }
}
