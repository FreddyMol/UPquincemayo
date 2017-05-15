package com.example.freddymolano.up;

import android.graphics.ColorFilter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.freddymolano.up.fragments.ColorFragment;

public class FragmentsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_main);
        putFragment(R.id.container1, ColorFragment.instance(ColorFragment.AZUL));
        putFragment(R.id.container2, ColorFragment.instance(ColorFragment.NARANJA));

    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}
