package com.cursoandroid.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categoria_cursos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_cursos);
    }

    public void tela_main(View view) {
        Intent in = new Intent(categoria_cursos.this, MainActivity.class);
        startActivity(in);
    }
}