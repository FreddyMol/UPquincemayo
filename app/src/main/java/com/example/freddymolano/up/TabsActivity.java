package com.example.freddymolano.up;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.freddymolano.up.adapters.ColorAdapter;
import com.example.freddymolano.up.databinding.ActivityTabsBinding;
import com.example.freddymolano.up.fragments.ColorFragment;

import java.util.ArrayList;
import java.util.List;

public class TabsActivity extends AppCompatActivity {

    ActivityTabsBinding binding;
    ColorAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_tabs);
        setSupportActionBar(binding.toolbar);


        List<Fragment> dataFragment = new ArrayList<>();
        dataFragment.add(ColorFragment.instance(ColorFragment.AZUL));
        dataFragment.add(ColorFragment.instance(ColorFragment.ROJO));
        dataFragment.add(ColorFragment.instance(ColorFragment.AMARILLO));
        dataFragment.add(ColorFragment.instance(ColorFragment.NARANJA));
        dataFragment.add(ColorFragment.instance(ColorFragment.VIOLETA));
        dataFragment.add(ColorFragment.instance(ColorFragment.VERDE));



        adapter = new ColorAdapter(getSupportFragmentManager(), dataFragment);
        binding.pager.setAdapter(adapter);
        binding.tabs.setupWithViewPager(binding.pager);




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
                Intent intent = new Intent(this, AddActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Agregando Viaje", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

  
}
