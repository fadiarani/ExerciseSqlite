package com.example.exsqlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton=findViewById(R.id.fab1);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Floating Action Button Berhasil dibuat", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void SIMPAN(View view) {
        Intent intent = new Intent(MainActivity.this, tampilandua.class);
        startActivity(intent);
    }
}