package com.tolet.sajib.inventorydesign;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Productfragment extends Fragment {


    public Productfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewhome=inflater.inflate(R.layout.fragment_productfragment,container,false);
        return viewhome;
    }

}
