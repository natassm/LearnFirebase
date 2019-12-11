package com.example.learnfirebase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityInsertData extends AppCompatActivity {

    EditText nama,deskripsi;
    DatabaseReference reference;

    Requests req = new Requests();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_insert_data);

        nama = findViewById(R.id.nama);
        deskripsi = findViewById(R.id.deskripsi);
        final Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sName = nama.getText().toString();
                String sDeskripsi = deskripsi.getText().toString();

                reference = FirebaseDatabase.getInstance().getReference().child("Request");

                getValue();

                if (sName.equals("") || sDeskripsi.equals(""))
                {
                    Toast.makeText(ActivityInsertData.this, "Data Tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else
                {
                    reference.child("RequestData").push().setValue(req);
                    nama.setText("");
                    deskripsi.setText("");
                    Toast.makeText(ActivityInsertData.this,"Data Tersimpan",Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private void getValue()
    {
        req.setName(nama.getText().toString());
        req.setDeskripsi(deskripsi.getText().toString());
    }

}
