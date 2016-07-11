package com.example.android_7.viewpagerexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android-7 on 9/6/16.
 */
public class DataDiplayerAdepter  extends PagerAdapter{

    Context context;
    ArrayList<Country> countryList;
    LayoutInflater inflater;

    public DataDiplayerAdepter(Context context, ArrayList<Country> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        TextView txtrank;
        TextView txtcountry;
        TextView txtpopulation;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_main, container,
                false);

        txtrank = (TextView) itemView.findViewById(R.id.tv_rank_value);
        txtcountry = (TextView) itemView.findViewById(R.id.tv_country_value);
        txtpopulation = (TextView) itemView.findViewById(R.id.tv_population_value);
        imgflag = (ImageView) itemView.findViewById(R.id.flagOfCountry);

        txtrank.setText(countryList.get(position).getRank()+"");
        txtcountry.setText(countryList.get(position).getCountry_name());
        txtpopulation.setText(countryList.get(position).getPopulation().toString());

        imgflag.setImageResource(countryList.get(position).getFlag());

        ((ViewPager) container).addView(itemView);
        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}
