package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView txtnamadata, txtnimdata, txtprodidata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtnamadata = findViewById(R.id.txtnamadata);
        txtnimdata = findViewById(R.id.txtnimdata);
        txtprodidata = findViewById(R.id.txtprodidata);

        Bundle bundle = getIntent()
    }
}