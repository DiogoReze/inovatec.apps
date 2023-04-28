package com.cursoandroid.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void tela_cursos(View view) {
        Intent in = new Intent(MainActivity.this, categoria_cursos.class);
        startActivity(in);
    }

    public void tela_login_user(View view) {
        Intent in = new Intent(MainActivity.this, Login_activity.class);
        startActivity(in);
    }
}