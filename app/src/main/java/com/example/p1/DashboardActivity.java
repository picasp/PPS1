package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView txtusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtusername = findViewById(R.id.txtusername);

        Bundle bundle = getIntent().getExtras();
        txtusername.setText(bundle.getString("username"));
    }
}