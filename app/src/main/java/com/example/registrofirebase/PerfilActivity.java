package com.example.registrofirebase;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        //ActionBar agregar el titulo
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Perfil");

    }
}
