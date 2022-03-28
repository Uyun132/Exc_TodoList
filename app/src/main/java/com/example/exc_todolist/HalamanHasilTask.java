package com.example.exc_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HalamanHasilTask extends AppCompatActivity {
    TextView tveTask, tveJenisTask, tveTimeTask;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_hasil_task);

        tveTask = findViewById(R.id.tvTask);
        tveJenisTask = findViewById(R.id.tvJenisTask);
        tveTimeTask = findViewById(R.id.tvWaktuTask);

        Bundle bundle = getIntent().getExtras();
        String task = bundle.getString("j");
        String jenisTask = bundle.getString("k");
        String timeTask = bundle.getString("l");

        tveTask.setText(task);
        tveJenisTask.setText(jenisTask);;
        tveTimeTask.setText(timeTask);;

    }
}