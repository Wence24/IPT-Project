package com.example.ipt_devera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LogInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
        Button b1 = (Button) findViewById(R.id.signupbut1);
        Button b2 = (Button) findViewById(R.id.loginbut);

        Button button=findViewById(R.id.loginbut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent intent = new Intent(LogInPage.this,SignUpPage.class);
                startActivity(intent);

                        EditText email = (EditText) findViewById(R.id.email);

                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                    }
                });
                 Button button1=findViewById(R.id.signupbut1);
                EditText email = (EditText) findViewById(R.id.email);
                 button1.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent intent2 = new Intent(LogInPage.this,HomePage.class);
                         startActivity(intent2);

                         String email1 = email.getText().toString();
                         Toast.makeText(LogInPage.this,"Successfully registered: " + email1,Toast.LENGTH_SHORT).show();
                         Intent intent3 = new Intent(LogInPage.this,HomePage.class);
                         startActivity(intent2);
                     }
                 });
            }


        }

