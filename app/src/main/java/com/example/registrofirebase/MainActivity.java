package com.example.registrofirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registro_btn , iniciar_sesion_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inicializar();

    }

    private void Inicializar() {
        iniciar_sesion_btn = findViewById(R.id.iniciar_sesion_btn);
        registro_btn       = findViewById(R.id.registro_btn);

        registro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, RegistroActivity.class));
            }
        });
    }
}
