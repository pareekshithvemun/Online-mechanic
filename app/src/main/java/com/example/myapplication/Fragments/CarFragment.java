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

public class CarFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    public CarFragment() {

        //Required empty public container
    }

    public static CarFragment getInstance()
    {
        return new CarFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_car, container, false);

        viewPager = myFragment.findViewById(R.id.carviewpager);
        tabLayout = myFragment.findViewById(R.id.carservicestablayout);

        return myFragment;
    }

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

        adapter.addFragment(new CarQuick(), "Quick");
        adapter.addFragment(new CarStandard(), "Standard");
        adapter.addFragment(new CarScheduled(), "Scheduled");
        adapter.addFragment(new CarSpecial(), "Special");
        viewPager.setAdapter(adapter);
    }

}
