package com.phanit.postfreeapp.app;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity{

    protected void showMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
    }
}
