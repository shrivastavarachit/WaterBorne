package com.example.android.firebase;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    private EditText userName , userPassword , userEmail;
    private Button regButton;
    private TextView userLogin;
    com.google.firebase.auth.FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
            setupUIViews();
            firebaseAuth= com.google.firebase.auth.FirebaseAuth.getInstance();
            regButton.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
                @Override
                public void onClick(View view) {
                   if (validate())
                   {
                       // Upload data to database

                       String user_email = userEmail.getText().toString().trim();
                       String user_password = userPassword.getText().toString().trim();


                       firebaseAuth.createUserWithEmailAndPassword(user_email , user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                           @Override
                           public void onComplete(@NonNull Task<AuthResult> task) {

                               if (task.isSuccessful()) {
                                   Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(Register.this , login.class));

                               }else{
                                   Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_LONG).show();
                               }

                               }
                       });
                   }
                  }
            });

            userLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(Register.this , login.class));

                }
            });
    }

        private void setupUIViews()
        {
            userName = (EditText)findViewById(R.id.etUserName);
            userPassword = (EditText)findViewById(R.id.etUserPassword);
            userEmail = (EditText)findViewById(R.id.etUserEmail);
            regButton = (Button)findViewById(R.id.btnRegister);
            userLogin = (TextView)findViewById(R.id.tvUserLogin);


        }

            @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
            private Boolean validate()
            {
                Boolean result = false;

                String name = userName.getText().toString();
                String password = userPassword.getText().toString();
                String email = userEmail.getText().toString();

                if (name.isEmpty() || password.isEmpty() || email.isEmpty())
                {
                    Toast.makeText(this, "Please enter all details", Toast.LENGTH_LONG).show();
                }else
                {
                    result = true;
                }

                return result;
            }

    private class FirebaseAuth {
    }
}
