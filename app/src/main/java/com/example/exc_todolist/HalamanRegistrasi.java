package com.example.exc_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HalamanRegistrasi extends AppCompatActivity {
    Button btn1;
    EditText regNama, regEmail, regPass, regRepass;
    String nama, pass, email, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_registrasi);

        btn1 = findViewById(R.id.buttonRegis);
        regNama = findViewById(R.id.layRegNama);
        regEmail = findViewById(R.id.layRegEmail);
        regPass  = findViewById(R.id.layRegPass);
        regRepass = findViewById(R.id.layRegRepass);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = regNama.getText().toString();
                pass = regPass.getText().toString();
                repass = regRepass.getText().toString();
                email = regEmail.getText().toString();

                if (nama.isEmpty() &&
                        pass.isEmpty() &&
                        repass.isEmpty() &&
                        email.isEmpty())
                {
                    regNama.setError("Masukan Nama");
                    regEmail.setError("Masukan Email");
                    regPass.setError("Masukan Password");

                }else {
                    if(!repass.equals(pass)){
                        regRepass.setError("Password Harus Sama");
                    }else {

                        Toast t = Toast.makeText(getApplicationContext(), "Registrasi Sukses!", Toast.LENGTH_LONG);
                        t.show();
                        Intent i = new Intent(HalamanRegistrasi.this,HalamanTask.class);

                        Bundle b = new Bundle();
                        b.putString("a", nama.trim());
                        b.putString("b", pass.trim());
                        i.putExtras(b);
                        startActivity(i);
                    }
                }
            }
        });








    }
}