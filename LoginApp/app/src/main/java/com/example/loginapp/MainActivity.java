package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton login;
    EditText username,password;
    TextView val_user,val_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        String user,pass;
        user = username.getText().toString();
        pass = password.getText().toString();
        val_user = findViewById(R.id.val_name);
        val_pass = findViewById(R.id.val_pass);

        if(user.equals("jaffar") && pass.equals("1")){
            Intent new_screen = new Intent(MainActivity.this,welcome.class);
            startActivity(new_screen);
            Toast.makeText(MainActivity.this,"Succesfully LogIn\nUser name : " +user+"\nPassword : "+pass,Toast.LENGTH_LONG).show();
        }
        else if(user.equals("") && pass.equals("")){
            val_user.setText("Enter Username");
            val_pass.setText("Enter Password");
        }else if(user.equals("jaffar")){
            val_user.setText("Correct Username");
            val_user.setTextColor(Color.parseColor("#228B22"));
            if(pass != "1"){
                val_pass.setText("Wrong Password");
                val_pass.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(user != "jaffar"){
            val_user.setText("Wrong Username");
            if(pass != "1"){
                val_pass.setText("Wrong Password");
            }
        }
    }
}