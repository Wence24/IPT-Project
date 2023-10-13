package com.example.ipt_devera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        Button button =findViewById(R.id.logebut);
        EditText emad = (EditText) findViewById(R.id.emad);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SignUpPage.this,HomePage.class);
                startActivity(intent2);

                String email1 = emad.getText().toString();
                Toast.makeText(SignUpPage.this,"Successfully logged in: " + email1,Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(SignUpPage.this,HomePage.class);
                startActivity(intent2);
            }
        });
    }
}