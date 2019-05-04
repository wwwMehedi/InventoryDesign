package com.tolet.sajib.inventorydesign;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class More extends Fragment {


    public More() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewhome=inflater.inflate(R.layout.fragment_more,container,false);
        return viewhome;

    }

}
