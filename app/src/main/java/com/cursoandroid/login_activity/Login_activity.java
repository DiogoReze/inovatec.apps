package com.cursoandroid.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void tela_welcome(View view) {
        Intent in = new Intent(Login_activity.this, Welcome_activity.class);
        startActivity(in);
    }

    public void tela_main(View view) {
        Intent in = new Intent(Login_activity.this, MainActivity.class);
        startActivity(in);
    }

}