package com.tolet.sajib.inventorydesign;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.botombarid);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                if(menuItem.getItemId()==R.id.homeid){
                    Intent intent=new Intent(Home.this,MainActivity.class);
                    startActivity(intent);
                }
                if(menuItem.getItemId()==R.id.productid){
                    Intent intent=new Intent(Home.this,ProductListCardView.class);
                    startActivity(intent);
                }
                if(menuItem.getItemId()==R.id.moreid){
                    //  fragment=new More();

                }
                if(menuItem.getItemId()==R.id.personid){
//                    Intent intent=new Intent(Home.this,ProductListCardView.class);
//                    startActivity(intent);
                    Toast.makeText(Home.this, "Not Implemented properly", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });

    }
}
