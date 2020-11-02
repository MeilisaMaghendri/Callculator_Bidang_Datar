package com.example.kalkulator_bd;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_persegi extends AppCompatActivity {

    private EditText stxt;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_persegi);
        stxt = (EditText) findViewById(R.id.stxt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void luas4(View view) {
        try {

            int s = Integer.parseInt(stxt.getText().toString());
            double luas =  s * s;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling4(View view) {
        try {

            int s = Integer.parseInt(stxt.getText().toString());
            double keliling =  4 * s;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void kembali4(View view){
        finish();
    }
}