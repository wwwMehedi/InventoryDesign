package com.tolet.sajib.inventorydesign;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tolet.sajib.inventorydesign.adapter.ListmodelAdapter;
import com.tolet.sajib.inventorydesign.model.Listmodel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewpagerFragment extends Fragment {
private RecyclerView recyclerView;
private List<Listmodel> mylist;

    public ViewpagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewhome=inflater.inflate(R.layout.fragment_viewpager,container,false);
        recyclerView=viewhome.findViewById(R.id.recyclerid);
        ListmodelAdapter adapter=new ListmodelAdapter(getContext(),mylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mylist=new ArrayList<>();
        mylist.add(new Listmodel("Cliniva It","20050"));
        mylist.add(new Listmodel("Systec Press","30500"));
        mylist.add(new Listmodel("Liverpool press","50060"));
        mylist.add(new Listmodel("Systec Press","30500"));
        mylist.add(new Listmodel("Liverpool press","50060"));


    }
}
