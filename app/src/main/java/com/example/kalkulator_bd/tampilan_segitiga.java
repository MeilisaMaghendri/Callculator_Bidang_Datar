package com.example.kalkulator_bd;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_segitiga extends AppCompatActivity {

    private EditText atxt;
    private EditText ttxt;
    private EditText btxt;
    private EditText ctxt;
    private EditText hasil;
    private Button Luas;
    private Button Keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_segitiga);
        atxt = (EditText) findViewById(R.id.atxt);
        ttxt = (EditText) findViewById(R.id.ttxt);
        btxt = (EditText)findViewById(R.id.btxt);
        ctxt = (EditText) findViewById(R.id.ctxt) ;
        hasil = (EditText) findViewById(R.id.hasil);
        Luas = (Button) findViewById(R.id.luas);
        Keliling = (Button) findViewById(R.id.keliling);

    }

    public void luas3(View view) {
        try {

            int a = Integer.parseInt(atxt.getText().toString());
            int t = Integer.parseInt(ttxt.getText().toString());
            int luas = (a * t) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling3(View view) {
        try {

            int a = Integer.parseInt(atxt.getText().toString());
            int b = Integer.parseInt(btxt.getText().toString());
            int c = Integer.parseInt(ctxt.getText().toString());
            int keliling = a+b+c;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali3(View view){
        finish();
    }
}