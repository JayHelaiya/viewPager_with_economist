package com.example.android_7.viewpagerexample;

import java.util.ArrayList;

/**
 * Created by android-7 on 9/6/16.
 */
public class Economist {

    private ArrayList<Country> countryList;

    public ArrayList<Country> giveListOfCountry()
    {
        Economist_sacarty sacarty=new Economist_sacarty();
       countryList = sacarty.giveCountryList();
        return countryList;

    }


}
