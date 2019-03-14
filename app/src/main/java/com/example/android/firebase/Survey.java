package com.example.android.firebase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Survey extends AppCompatActivity {
    public  Button SubmitButton;
    private APIService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        final EditText e1=(EditText)findViewById(R.id.editText);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        final EditText e4=(EditText)findViewById(R.id.editText4);
        apiService=ApiUtils.getAPIService();
        SubmitButton = (Button)findViewById(R.id.submitBtn);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String q1=e1.getText().toString().trim();
                String q2=e2.getText().toString().trim();
                String q3=e3.getText().toString().trim();
                String q4=e4.getText().toString().trim();
                if(!TextUtils.isEmpty(q1) && !TextUtils.isEmpty(q2) && !TextUtils.isEmpty(q3) && !TextUtils.isEmpty(q4)){
                    sendPost(q1,q2,q3,q4);
                }
               // Toast.makeText(Survey.this , "Successful",Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Survey.this , mapsg.class));

            }
        });

    }

    private void sendPost(String q1, String q2, String q3, String q4) {
        apiService.savePost(q1,q2,q3,q4).enqueue(new Callback<Post>() {

            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(response.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {

            }
        });
    }

}


