package com.example.exc_todolist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HalamanTask extends AppCompatActivity {
    TextView txUser;
    EditText edTask, edJenisTask, edTimeTask;
    String task, jenisTask, timeTask;
    FloatingActionButton btn1;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        edTask = findViewById(R.id.layTask);
        edJenisTask = findViewById(R.id.layJenisTask);
        edTimeTask = findViewById(R.id.layWaktuTask);

        if(item.getItemId() == R.id.mlayLogout){
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }else if(item.getItemId() == R.id.mlaySub){
            //This is starting to get complicated
            task = edTask.getText().toString();
            jenisTask = edJenisTask.getText().toString();
            timeTask = edTimeTask.getText().toString();

            Intent i = new Intent(getApplicationContext(),HalamanHasilTask.class);
            Bundle b = new Bundle();
            b.putString("j", task.trim());
            b.putString("k", jenisTask.trim());
            b.putString("l", timeTask.trim());
            i.putExtras(b);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_task);

        txUser = findViewById(R.id.layNamatv);
        btn1 = findViewById(R.id.flSubmit);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("a");
        String password = bundle.getString("b");

        txUser.setText(user);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edTask = findViewById(R.id.layTask);
                edJenisTask = findViewById(R.id.layJenisTask);
                edTimeTask = findViewById(R.id.layWaktuTask);

                task = edTask.getText().toString();
                jenisTask = edJenisTask.getText().toString();
                timeTask = edTimeTask.getText().toString();

                Intent i = new Intent(getApplicationContext(),HalamanHasilTask.class);
                Bundle b = new Bundle();
                b.putString("j", task.trim());
                b.putString("k", jenisTask.trim());
                b.putString("l", timeTask.trim());
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}