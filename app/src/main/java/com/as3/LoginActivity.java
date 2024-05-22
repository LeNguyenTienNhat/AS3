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
        Button signInBtn = findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(LoginActivity.this::onSignIn);
    }

    public void onSignIn(View v) {
        EditText usernameInputField = findViewById(R.id.user);
        String username = usernameInputField.getText().toString();
        EditText passwordInputField = findViewById(R.id.password);
        String password = passwordInputField.getText().toString();
        if (username.equals("admin") && password.equals("123456")) {
            Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            i.putExtra("user",username);
            startActivity(i);
            LoginActivity.this.finish();
        }
        else {
            Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText usernameInputField = findViewById(R.id.user);
        EditText passwordInputField = findViewById(R.id.password);
        usernameInputField.setText("");
        passwordInputField.setText("");
    }

}