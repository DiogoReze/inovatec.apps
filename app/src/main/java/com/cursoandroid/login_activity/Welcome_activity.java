package com.cursoandroid.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void tela_login_usuario(View view) {
        Intent in = new Intent(Welcome_activity.this, Login_activity.class);
        startActivity(in);
    }

    public void tela_main(View view) {
        Intent in = new Intent(Welcome_activity.this, MainActivity.class);
        startActivity(in);
    }

    public void tela_processo(View view) {
        Intent in = new Intent(Welcome_activity.this, Process_activity.class);
        startActivity(in);
    }
}