package com.example.kalkulator_bd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Lingkaran = (Button) findViewById(R.id.lingkaran);

        Lingkaran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent tampilan_lingkaran = new Intent(MainActivity.this, tampilan_lingkaran.class);
                startActivity(tampilan_lingkaran);
            }
        });
        Button persegipanjang = (Button) findViewById(R.id.persegipanjang);

        persegipanjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent tampilan_persegi_panjang = new Intent(MainActivity.this, tampilan_persegi_panjang.class);
                startActivity(tampilan_persegi_panjang);
            }
        });
        Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent tampilan_segitiga = new Intent(MainActivity.this, tampilan_segitiga.class);
                startActivity(tampilan_segitiga);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent tampilan_persegi = new Intent(MainActivity.this, tampilan_persegi.class);
                startActivity(tampilan_persegi);
            }
        });
    }
    public void keluar(View view){
        System.exit(0);
    }
}