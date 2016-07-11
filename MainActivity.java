package com.example.android_7.viewpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DataDiplayerAdepter adepter;
    ArrayList<Country> countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Economist economist=new Economist();
         countryList =economist.giveListOfCountry();

        ViewPager viewPager=(ViewPager)findViewById(R.id.pager);
        adepter=new DataDiplayerAdepter(MainActivity.this,countryList);
        viewPager.setAdapter(adepter);

    }
}
