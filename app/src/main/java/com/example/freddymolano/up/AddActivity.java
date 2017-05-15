package com.example.freddymolano.up;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.freddymolano.up.models.Usuario;
import com.example.freddymolano.up.models.Viaje;

public class AddActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Spinner spsalida, spdestino;
    EditText precio, fecha;
    Button ListarViaje;

    String CiudadesData[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        precio = (EditText) findViewById(R.id.editTextPrecio);
        fecha = (EditText) findViewById(R.id.editTextFecha);
        ListarViaje = (Button) findViewById(R.id.ButtonListarViaje);
        spsalida = (Spinner) findViewById(R.id.SpSalida);
        spdestino = (Spinner) findViewById(R.id.SpDestino);

        spsalida.setOnItemSelectedListener(this);
        spdestino.setOnItemSelectedListener(this);

        ListarViaje.setOnClickListener(this);

        CiudadesData = getResources().getStringArray(R.array.Ciudades);



    }

    @Override
    public void onClick(View v) {
        String p = precio.getText().toString();
        String f = fecha.getText().toString();
       // String s, String d
      //  Viaje viaje = new Viaje();


    }

    //region SpinnerEventos
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this, "Ciudad salida: "+CiudadesData[position], Toast.LENGTH_SHORT).show();
       //Toast.makeText(this, "Ciudad Destino: "+CiudadesData[position], Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    //endregion
}
