package com.bridgechan.learningtab.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bridgechan.learningtab.R;

public class CustomPagerAdapter extends PagerAdapter {
    private Context c;
    public CustomPagerAdapter(Context c){
        this.c = c;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View layout = null;
        switch(position){
            case 0:
                layout = inflater.inflate(R.layout.tab_1,container, false);
                break;
            case 1:
                layout = inflater.inflate(R.layout.tab_2,container,false);
                break;
            case 2:
                layout = inflater.inflate(R.layout.tab_3,container,false);
                break;
        }
        container.addView(layout);
        return layout;
    }

    @Override
    public int getCount() {
        return 3;
    }

    //must
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (o == view);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
