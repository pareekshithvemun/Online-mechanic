package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.Adapter.PagerAdapter;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

public class BikeFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    public BikeFragment() {

        //Required empty public container
    }

    public static BikeFragment getInstance()
    {
        return new BikeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_bike, container, false);

        viewPager = myFragment.findViewById(R.id.bikeviewpager);
        tabLayout = myFragment.findViewById(R.id.bikeservicestablayout);

        return myFragment;
    }

    // Call on activity create method


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        
    }

    private void setUpViewPager(ViewPager viewPager) {

        PagerAdapter adapter = new PagerAdapter(getChildFragmentManager());

        adapter.addFragment(new BikeQuick(), "Quick");
        adapter.addFragment(new BikeStandard(), "Standard");
        adapter.addFragment(new BikeScheduled(), "Scheduled");
        adapter.addFragment(new BikeSpecial(), "Special");
        viewPager.setAdapter(adapter);
    }
}
