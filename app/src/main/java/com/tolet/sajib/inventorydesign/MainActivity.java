package com.tolet.sajib.inventorydesign;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.botombarid);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.framid,new ViewpagerFragment()).commit();
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                if(menuItem.getItemId()==R.id.homeid){
                    fragment=new ViewpagerFragment();
                }
                if(menuItem.getItemId()==R.id.moreid){
                    fragment=new More();
                }
                if(menuItem.getItemId()==R.id.personid){
                    fragment=new Supplyfragment();
                }
                if(menuItem.getItemId()==R.id.productid){
                    fragment=new Productfragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framid,fragment).commit();
                return false;
            }
        });



    }
}
