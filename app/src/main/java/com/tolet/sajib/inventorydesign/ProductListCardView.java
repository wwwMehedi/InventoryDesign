package com.tolet.sajib.inventorydesign;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.tolet.sajib.inventorydesign.adapter.AdapterCarditem;
import com.tolet.sajib.inventorydesign.adapter.ListmodelAdapter;
import com.tolet.sajib.inventorydesign.model.Listmodel;
import com.tolet.sajib.inventorydesign.model.ModelCarditem;

import java.util.ArrayList;
import java.util.List;

public class ProductListCardView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ModelCarditem> mylist;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list_card_view);

        recyclerView=findViewById(R.id.recyclercardid);
        mylist=new ArrayList<>();
        mylist.add(new ModelCarditem("Sun","A/C","300gsm"));
        mylist.add(new ModelCarditem("Horse","A/C","500gsm"));
        mylist.add(new ModelCarditem("Panda","A/C","600gsm"));
        AdapterCarditem adapter=new AdapterCarditem(this,mylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

     adapter.setOnItemClickListener(new AdapterCarditem.ItemCLickListener() {
         @Override
         public void OnItemCLick(View v, int positiion) {
//           if(positiion==2)
//           {
//               Toast.makeText(ProductListCardView.this, "hi hellow", Toast.LENGTH_SHORT).show();
//           }
         }
     });

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.botombarid);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                if(menuItem.getItemId()==R.id.homeid){
                    Intent intent=new Intent(ProductListCardView.this,MainActivity.class);
                    startActivity(intent);
                }
                if(menuItem.getItemId()==R.id.personid){
                    Intent intent=new Intent(ProductListCardView.this,ProductListCardView.class);
                    startActivity(intent);
                    Toast.makeText(ProductListCardView.this, "Not Implemented properly", Toast.LENGTH_SHORT).show();
                }
                if(menuItem.getItemId()==R.id.moreid){
                    Intent intent=new Intent(ProductListCardView.this,Home.class);
                    startActivity(intent);

                }

                return false;
            }
        });



    }
}
