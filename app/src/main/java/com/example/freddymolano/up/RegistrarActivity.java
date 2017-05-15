package com.example.freddymolano.up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistrarActivity extends AppCompatActivity implements View.OnClickListener{

    EditText Nombre, Correo, Telefono;
    CheckBox ChConductor, ChPasajero;
    Button Evaluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Nombre = (EditText)findViewById(R.id.editTextNombre);
        Correo = (EditText)findViewById(R.id.editTextCorreo);
       // Telefono = (EditText) findViewById(R.id.editTextTelefono);
        ChConductor = (CheckBox) findViewById(R.id.checkBoxConductor);
        ChPasajero = (CheckBox)findViewById(R.id.checkBoxPasajero);
        Evaluar = (Button)findViewById(R.id.buttonEvaluar);

        Evaluar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent Evaluar = new Intent(RegistrarActivity.this, TabsActivity.class);
        startActivity(Evaluar);

    }
}
