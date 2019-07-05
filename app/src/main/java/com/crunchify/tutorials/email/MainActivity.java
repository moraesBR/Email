package com.crunchify.tutorials.email;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilEmail;
    private TextInputLayout tilPassword;
    private AppCompatEditText etEmail;
    private AppCompatEditText etPassword;
    private Button btnCreate;
    private AppCompatTextView tvEmail;
    private AppCompatTextView tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilEmail    = (TextInputLayout)   findViewById(R.id.tilEmail);
        etEmail     = (AppCompatEditText) findViewById(R.id.etEmail);

        tilPassword = (TextInputLayout)   findViewById(R.id.tilPassword);
        etPassword  = (AppCompatEditText) findViewById(R.id.etPassword);

        btnCreate = (Button) findViewById(R.id.btnCreate);

        tvEmail = (AppCompatTextView) findViewById(R.id.tvEmail);
        tvEmail.setVisibility(View.INVISIBLE);

        tvPassword = (AppCompatTextView) findViewById(R.id.tvPassword);
        tvPassword.setVisibility(View.INVISIBLE);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validForm();
            }
        });

    }

    private void validForm(){
        if(etEmail.getText().toString().isEmpty()){
            tilEmail.setErrorEnabled(true);
            tilEmail.setError("Enter your email");
        }
        else{
            tilEmail.setErrorEnabled(false);
            tvEmail.setText(etEmail.getText().toString());
            tvEmail.setVisibility(View.VISIBLE);
        }

        if(etPassword.getText().toString().isEmpty()){
            tilPassword.setErrorEnabled(true);
            tilPassword.setError("Enter your password");
        }
        else{
            tilPassword.setErrorEnabled(false);
            tvPassword.setText(etPassword.getText().toString());
            tvPassword.setVisibility(View.VISIBLE);
        }
    }


}
