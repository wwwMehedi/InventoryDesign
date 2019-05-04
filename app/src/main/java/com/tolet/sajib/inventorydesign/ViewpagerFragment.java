package com.tolet.sajib.inventorydesign;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewpagerFragment extends Fragment {


    public ViewpagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewhome=inflater.inflate(R.layout.fragment_viewpager,container,false);
        FloatingActionButton fab = (FloatingActionButton) viewhome.findViewById(R.id.btn_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AvailableProducts.class);
                startActivity(in);
            }
        });
        return viewhome;


    }

}
