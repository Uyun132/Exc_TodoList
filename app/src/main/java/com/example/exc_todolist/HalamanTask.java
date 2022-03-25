package com.example.exc_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HalamanTask extends AppCompatActivity {
    TextView txUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_task);

        txUser = findViewById(R.id.layNamatv);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("a");
        String password = bundle.getString("b");

        txUser.setText(user);
    }
}