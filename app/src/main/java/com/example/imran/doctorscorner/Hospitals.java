package com.example.imran.doctorscorner;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import android.widget.ListView;

import java.util.ArrayList;


public class Hospitals extends AppCompatActivity {
    public DrawerLayout mdrawerlayput;
    public ActionBarDrawerToggle mtoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);


        // use mtoogle in select section
        Chittagong chi=new Chittagong();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentcontainer,chi);
        fragmentTransaction.commit();




        //for the drawer layout
        mdrawerlayput = (DrawerLayout) findViewById(R.id.DrawerLayout);

        mtoogle = new ActionBarDrawerToggle(this, mdrawerlayput, R.string.open, R.string.close);
        mdrawerlayput.addDrawerListener(mtoogle);
        mtoogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView mNavigationView=(NavigationView) findViewById(R.id.nev);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                int id=item.getItemId();
                switch (id){
                    case  R.id.CHittagong:
                        Chittagong chi=new Chittagong();
                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragmentcontainer,chi);
                        fragmentTransaction.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.Dhhaka:
                        Dhaka dha=new Dhaka();
                        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.fragmentcontainer,dha);
                        fragmentTransaction1.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Rajshahi:
                        Rajshahi raj=new Rajshahi();
                        FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.fragmentcontainer,raj);
                        fragmentTransaction2.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Sylett:
                        Sylet sy=new Sylet();
                        FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.fragmentcontainer,sy);
                        fragmentTransaction3.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;

                    case  R.id.Comilla:
                        Comilla com=new Comilla();
                        FragmentTransaction fragmentTransaction4=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.fragmentcontainer,com);
                        fragmentTransaction4.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Kulna:
                        Kulna kul=new Kulna();
                        FragmentTransaction fragmentTransaction5=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.fragmentcontainer,kul);
                        fragmentTransaction5.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                }


                return true;

            }

        });

    }

//make the menu icon clickable
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mtoogle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //do transaction on click


}
