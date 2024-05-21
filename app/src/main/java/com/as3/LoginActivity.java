package com.as3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button signInBtn = (Button) findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.this.onSignIn(v);
            }
        });
    }

    public void onSignIn(View v) {
        EditText usernameInputField = (EditText) findViewById(R.id.user);
        String username = (String) usernameInputField.getText().toString();
        EditText passwordInputField = (EditText) findViewById(R.id.password);
        String password = (String) passwordInputField.getText().toString();
        if (username.equals("admin") && password.equals("123456")) {
            Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            i.putExtra("user",username);
            i.putExtra("pass",password);
            startActivity(i);
        }
        else {
            Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }

}