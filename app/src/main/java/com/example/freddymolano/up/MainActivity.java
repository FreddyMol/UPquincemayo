package com.example.freddymolano.up;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.freddymolano.up.adapters.UsuarioAdapter;
import com.example.freddymolano.up.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView list;
    UsuarioAdapter adapter;
    List<Usuario> data;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        data = new ArrayList<>();
        adapter = new UsuarioAdapter(this, data);


        list.setAdapter(adapter);
        loadUsuarios();




    }

    //region LoadData
    public void loadUsuarios(){
        Usuario p1 = new Usuario("Freddy", 313f, "davidmolano@unicauca.edu.co");
        Usuario p2 = new Usuario("Lorena", 314f, "lorena@unicauca.edu");
        Usuario p3 = new Usuario("Laura", 315f, "laura@unicauca.edu");

        data.add(p1);
        data.add(p2);
        data.add(p3);

        adapter.notifyDataSetChanged();
    }
    //endregion

    @Override
    public void onClick(View v) {



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(this, "Un momento...", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
