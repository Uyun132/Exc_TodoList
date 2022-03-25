package com.example.exc_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView txRegister;
    Button btSign;
    EditText edNama, edPass;
    String nama, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSign = findViewById(R.id.btnSignin);
        edNama = findViewById(R.id.layNama);
        edPass = findViewById(R.id.layPass);
        txRegister = findViewById(R.id.layRegis);

        // Registrasi
        txRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "OKEEE", Toast.LENGTH_LONG);
                t.show();

                Intent i = new Intent(getApplicationContext(), HalamanRegistrasi.class);
                startActivity(i);
            }
        });
        
        // Sign In
        btSign.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                nama = edNama.getText().toString();
                password = edPass.getText().toString();

                String logUser = "Pascal";
                String logPass = "iniPascal";

                if(nama.isEmpty() || password.isEmpty()){
                    edNama.setError("Nama Diperlukan");
                }else {
                    if (nama.equals(logUser) && password.equals(logPass)) {
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses!", Toast.LENGTH_LONG);
                        t.show();
//                        Intent i = new Intent(MainActivity.this,ActivityKedua.class);
//
//                        Bundle b = new Bundle();
//                        b.putString("a", nama.trim());
//                        b.putString("b", password.trim());
//                        i.putExtras(b);
//                        startActivity(i);

                        //LOL
                    } else{
                        if (!logUser.equals(nama) && password.equals(logPass)) {
                            Toast b = Toast.makeText(getApplicationContext(), "Nama Salah!", Toast.LENGTH_LONG);
                            b.show();
                        }else{
                            if (nama.equals(logUser) && !logPass.equals(password)) {
                                Toast b = Toast.makeText(getApplicationContext(), "Password Salah!", Toast.LENGTH_LONG);
                                b.show();
                            } else {
                                Toast t = Toast.makeText(getApplicationContext(), "Username dan Password salah!", Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
            }
        });
    }
}