package com.tolet.sajib.inventorydesign;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.tolet.sajib.inventorydesign.fragment.DraftFragment;
import com.tolet.sajib.inventorydesign.viewpageradapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView bottomNavigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayoutid);
        viewPager=findViewById(R.id.viewpagerid);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //Add fragment
        adapter.AddFragment(new ViewpagerFragment(),"list");
        adapter.AddFragment(new DraftFragment(),"Draft");
        adapter.AddFragment(new DraftFragment(),"All");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



        bottomNavigationView=(BottomNavigationView) findViewById(R.id.botombarid);
//        if(savedInstanceState==null){
//            getSupportFragmentManager().beginTransaction().replace(R.id.forfragmnt,new ViewpagerFragment()).commit();
//        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                if(menuItem.getItemId()==R.id.homeid){
                    fragment=new ViewpagerFragment();
                }
                if(menuItem.getItemId()==R.id.moreid){
                    fragment=new More();
//                    Intent intent=new Intent(MainActivity.this,Home.class);
//                    startActivity(intent);
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
