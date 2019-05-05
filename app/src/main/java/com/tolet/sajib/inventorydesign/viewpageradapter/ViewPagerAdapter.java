package com.tolet.sajib.inventorydesign.viewpageradapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> lstfragment=new ArrayList<>();
    private List<String> lsttitle=new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return lstfragment.get(i);
    }

    @Override
    public int getCount() {
        return lsttitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitle.get(position);
    }

    public void AddFragment(Fragment fragment,String title){
        lstfragment.add(fragment);
        lsttitle.add(title);
    }
}
