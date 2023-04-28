package com.cursoandroid.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Process_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_processo);
    }

    public void tela_welcome(View view) {
        Intent in = new Intent(Process_activity.this, Welcome_activity.class);
        startActivity(in);
    }

    public void tela_main(View view) {
        Intent in = new Intent(Process_activity.this, MainActivity.class);
        startActivity(in);
    }
}