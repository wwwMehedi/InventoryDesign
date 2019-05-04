package com.tolet.sajib.inventorydesign;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Supplyfragment extends Fragment {


    public Supplyfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewhome=inflater.inflate(R.layout.fragment_supplyfragment,container,false);
        return viewhome;
    }

}
