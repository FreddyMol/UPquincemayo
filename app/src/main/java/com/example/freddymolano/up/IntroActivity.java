package com.example.freddymolano.up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IntroActivity extends AppCompatActivity {

    ImageButton conductor, pasajero;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ImageButton orderButton = (ImageButton)findViewById(R.id.button_car);
        ImageButton orderButton2 = (ImageButton)findViewById(R.id.button_pasajero);
        conductor = (ImageButton) findViewById(R.id.button_car);
        pasajero = (ImageButton) findViewById(R.id.button_pasajero);

        orderButton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent button_car = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(button_car);


            }
        });

        orderButton2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {


                Intent button_pass = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(button_pass);
            }
        });



    }


}