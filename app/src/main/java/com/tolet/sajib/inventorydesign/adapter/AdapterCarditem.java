package com.tolet.sajib.inventorydesign.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tolet.sajib.inventorydesign.ClinivaDialog;
import com.tolet.sajib.inventorydesign.R;
import com.tolet.sajib.inventorydesign.model.ModelCarditem;

import java.util.List;

public class AdapterCarditem extends RecyclerView.Adapter<AdapterCarditem.MyViewHolder> {
    private Context context;
    private List<ModelCarditem> mlist;

    ItemCLickListener itemCLickListener;

    public AdapterCarditem(Context context, List<ModelCarditem> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public AdapterCarditem.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclercard_item,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCarditem.MyViewHolder myViewHolder, final int i) {
         myViewHolder.cpname.setText(mlist.get(i).getCpname());
         myViewHolder.cpac.setText(mlist.get(i).getAc());
         myViewHolder.cpgsm.setText(mlist.get(i).getCpgsm());
       myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showAvailableProduct();

               //Toast.makeText(context, "Hellow Taohid Vai", Toast.LENGTH_SHORT).show();

           }
       });
    }
    private void showAvailableProduct() {

        View productView = LayoutInflater.from(context).inflate(R.layout.dialog_add_product, null, false);

        RelativeLayout addProductHeader = productView.findViewById(R.id.rl_header);

        RelativeLayout addProductContent = productView.findViewById(R.id.rl_content);

        ClinivaDialog clinivaDialog = new ClinivaDialog(context,productView);

        clinivaDialog.show();

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView cpname;
        private TextView cpac;
        private TextView cpgsm;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cpname=itemView.findViewById(R.id.cpname);
            cpac=itemView.findViewById(R.id.acid);
            cpgsm=itemView.findViewById(R.id.cpgsmid);
            cardView=itemView.findViewById(R.id.cardid);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(itemCLickListener!=null){
                itemCLickListener.OnItemCLick(view,getAdapterPosition());
            }
        }
    }
    public void setOnItemClickListener(ItemCLickListener itemClickListener){
        this.itemCLickListener=itemClickListener;
    }

    public interface ItemCLickListener {
        void OnItemCLick(View v, int positiion);
    }
}
