package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tesActivity2 extends AppCompatActivity {
    TextView txtnama, txtnim;
    EditText txtprodi;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes2);

        txtnama = findViewById(R.id.txtnama);
        txtnim = findViewById(R.id.txtnim);
        txtprodi = findViewById(R.id.txtprodi);
        btnsubmit = findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = txtnama.getText().toString();
                    String nim = txtnim.getText().toString();
                    String prodi = txtprodi.getText().toString();

                    if (prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Prodi harus diisi", Toast.LENGTH_SHORT).show();
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNim", nim);
                        bundle.putString("keyProdi", prodi);
                        Intent i = new Intent(tesActivity2.this, hasil.class);
                        i.putExtras(bundle);
                        startActivity(i);

//                        Intent i = new Intent(tesActivity2.this, hasil.class);
//                        i.putExtra("keyNama", nama);
//                        i.putExtra("keyNim", nim);
//                        i.putExtra("keyProdi", prodi);
//                        startActivity(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}