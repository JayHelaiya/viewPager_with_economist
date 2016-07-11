package com.example.android_7.viewpagerexample;

import java.math.BigInteger;

/**
 * Created by android-7 on 9/6/16.
 */
public class Country {

    private String country_name;
    private int flag;
    private int rank;
    private BigInteger population;


    public Country(String country_name, int flag, int rank, BigInteger population) {
        this.country_name = country_name;
        this.flag = flag;
        this.rank = rank;
        this.population = population;
    }



    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public BigInteger getPopulation() {
        return population;
    }

    public void setPopulation(BigInteger population) {
        this.population = population;
    }
}
