package com.as3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Intent i = getIntent();

        String user = i.getStringExtra("user");
        String pass = i.getStringExtra("pass");

        TextView userView = findViewById(R.id.user);
        TextView passView = findViewById(R.id.pass);

        userView.setText(user);
        passView.setText(pass);
    }
}
