package com.example.kalkulator_bd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_persegi_panjang extends AppCompatActivity {

    private EditText ptxt;
    private EditText ltxt;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_persegi_panjang);
        ptxt = (EditText) findViewById(R.id.ptxt);
        ltxt = (EditText) findViewById(R.id.ltxt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);

    }

    public void luas2(View view) {
        try {

            int p = Integer.parseInt(ptxt.getText().toString());
            int l = Integer.parseInt(ltxt.getText().toString());
            int luas = p * l ;
            hasil.setText(String.valueOf(luas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling2(View view) {
        try {

            int p = Integer.parseInt(ptxt.getText().toString());
            int l = Integer.parseInt(ltxt.getText().toString());
            int keliling = (p+l)*2 ;
            hasil.setText(String.valueOf(keliling));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali2(View view){

        finish();
    }
}