package com.tolet.sajib.inventorydesign.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tolet.sajib.inventorydesign.R;
import com.tolet.sajib.inventorydesign.model.Listmodel;

import java.util.List;

public class ListmodelAdapter extends RecyclerView.Adapter<ListmodelAdapter.MyViewHolder> {
    private Context context;
    List<Listmodel> list;

    public ListmodelAdapter(Context context, List<Listmodel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ListmodelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListmodelAdapter.MyViewHolder myViewHolder, int i) {
   myViewHolder.tvname.setText(list.get(i).getName());
   myViewHolder.tvprice.setText(list.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvname;
        private TextView tvprice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.tv_company_name);
            tvprice=itemView.findViewById(R.id.tv_price);
        }
    }
}
