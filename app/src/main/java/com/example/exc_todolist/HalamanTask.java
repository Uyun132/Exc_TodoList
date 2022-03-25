package com.example.exc_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HalamanTask extends AppCompatActivity {
    TextView txUser;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_task);

        txUser = findViewById(R.id.layNamatv);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("a");
        String password = bundle.getString("b");

        txUser.setText(user);

        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HalamanHasilTask.class);
                startActivity(i);
            }
        });
    }
}