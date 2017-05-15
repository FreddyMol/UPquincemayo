package com.example.freddymolano.up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.freddymolano.up.models.Usuario;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginActivity extends AppCompatActivity{
    private TextView lblGotoRegister;
    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputPassword;
    private TextView loginErrorMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inputEmail = (EditText)findViewById(R.id.txtEmail);
        inputPassword = (EditText)findViewById(R.id.txtPass);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        lblGotoRegister = (TextView) findViewById(R.id.link_to_register);
        loginErrorMsg = (TextView) findViewById(R.id.login_error);




    }


    public void BtnEntrar(View view){
        Intent intent = new Intent(this, TabsActivity.class);
        startActivity(intent);
    }

    public void BtnRegistrar(View view){
        Intent intent = new Intent(this, RegistrarActivity.class);
        startActivity(intent);
    }


}
