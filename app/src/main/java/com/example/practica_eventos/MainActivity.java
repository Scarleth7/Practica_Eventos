package com.example.practica_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button4);
        btn3.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "evento utilizando clase anonima", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //usando implements
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "evento utilizando onClick de implements", Toast.LENGTH_SHORT).show();
    }

    //usando un metodo
    public void eventoBoton (View view){
        Toast.makeText(MainActivity.this, "evento utilizando onClink de metodo", Toast.LENGTH_SHORT).show();
    }
}