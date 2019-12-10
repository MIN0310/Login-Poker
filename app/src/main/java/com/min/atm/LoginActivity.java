package com.min.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {
        EditText edUsername = findViewById(R.id.username);
        EditText edPassword = findViewById(R.id.password);
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        if ("Jasmine".equals(username) && "0000".equals(password)) {
            finish();
        }else {
            new AlertDialog.Builder(this)
                    .setTitle("錯誤!!!")
                    .setMessage("帳號密碼錯誤")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
        }

    }
}
