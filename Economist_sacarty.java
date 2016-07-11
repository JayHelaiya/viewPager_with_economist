package com.example.android_7.viewpagerexample;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by android-7 on 9/6/16.
 */
public class Economist_sacarty {

    private ArrayList<Country> countryList =new ArrayList<Country>();

    public ArrayList<Country> giveCountryList()
    {
        countryList=prepareCountryList();
        return countryList;
    }
    public ArrayList<Country> prepareCountryList()
    {
        countryList.add(new Country("Usa",R.drawable.usa,1,new BigInteger("2333444555555")));
        countryList.add(new Country("india",R.drawable.india,2,new BigInteger("1233444555555")));
        countryList.add(new Country("china",R.drawable.c,3,new BigInteger("123344455555000005")));

        return countryList;
    }


}
