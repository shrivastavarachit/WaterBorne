package com.example.android.firebase;

import android.app.ProgressDialog;
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
import com.google.firebase.auth.FirebaseUser;


public class login extends AppCompatActivity {

    public EditText Name;
    public EditText Password;
    private Button Login;
    public TextView userRegistration;
    public FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        userRegistration = (TextView)findViewById(R.id.tvRegister);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

        FirebaseUser user = firebaseAuth.getCurrentUser();




        if (user != null)
        {
            finish();
            startActivity(new Intent(login.this , SecondActivity.class));
        }

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (Name.getText().toString().isEmpty() || Password.getText().toString().isEmpty()){

                    Toast.makeText(login.this , "Fill all Details" , Toast.LENGTH_LONG).show();
                }else {

                    validate(Name.getText().toString(), Password.getText().toString());
                }
                }
        });

        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this , Register.class));
            }
        });


    }

    private void validate(String userName , String userPassword)
    {

        progressDialog.setMessage("Please Wait");
        progressDialog.show();

            firebaseAuth.signInWithEmailAndPassword(userName , userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {


                    if (task.isSuccessful()){
                        progressDialog.dismiss();
                        Toast.makeText(login.this , "Login Sucessfull" , Toast.LENGTH_LONG).show();
                        startActivity(new Intent(login.this , SecondActivity.class));
                    }else {

                        progressDialog.dismiss();

                        Toast.makeText(login.this , "Login Failed" , Toast.LENGTH_LONG).show();
                    }
                }
            });
    }



    private Boolean validate()
    {
        Boolean result = false;

        String name = Name.getText().toString();
        String password = Password.getText().toString();


        if (name.isEmpty() && password.isEmpty())
        {
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_LONG).show();
        }else
        {
            result = true;
        }

        return result;
    }



}
