package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Fragments.BikeFragment;
import com.example.myapplication.Fragments.BusFragment;
import com.example.myapplication.Fragments.CarFragment;
import com.example.myapplication.Fragments.OtherFragment;
import com.example.myapplication.Fragments.TruckFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;


public class Homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;



    private BottomNavigationView.OnNavigationItemSelectedListener navListener  =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.bike:
                            selectedFragment = BikeFragment.getInstance();
                            break;
                        case R.id.car:
                            selectedFragment = new CarFragment();
                            break;
                        case R.id.truck:
                            selectedFragment = new TruckFragment();
                            break;

                        case R.id.bus:
                            selectedFragment = new BusFragment();
                            break;
                        case R.id.other:
                            selectedFragment = new OtherFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,
                            selectedFragment).commit();

                    return true;

                }

            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        /*Navigation Drawer code (Do not delete)*/

        drawerLayout = findViewById(R.id.main_drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        /*Navigation Drawer code (Do not delete)*/




        /*Do not delete*/
        bottomNavigationView = findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        /*navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);*/

        /*Do not delete*/

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingbutton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Write code here to get list of services selected by user and proceed to send request*/

                Toast.makeText(Homepage.this, "Proceed to request", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Homepage.this,OrderSummary.class);
                startActivity(i);

            }
        });


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.profile:
                Toast.makeText(Homepage.this, "Profile Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.vehicledetails:
                Toast.makeText(Homepage.this, "Vehicle details Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.myrequests:
                Toast.makeText(Homepage.this, "My requests us Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.transactions:
                Toast.makeText(Homepage.this, "Transactions Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contactus:
                Toast.makeText(Homepage.this, "Contact us Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(Homepage.this, "Logout Selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return false;
    }

}




