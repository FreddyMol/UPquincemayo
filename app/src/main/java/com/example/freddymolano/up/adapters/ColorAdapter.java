package com.example.freddymolano.up.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Freddy Molano on 10/05/2017.
 */

public class ColorAdapter extends FragmentStatePagerAdapter {

    List<Fragment> dataFragment;

    public ColorAdapter(FragmentManager fm, List<Fragment> dataFragment) {
        super(fm);
        this.dataFragment = dataFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return dataFragment.get(position);
    }

    @Override
    public int getCount() {
        return dataFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab"+position;
    }
}
