package com.example.bodia.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bodia.R;
import com.example.bodia.model.Item;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ItemHolder> {

    List<Item> itemList;
    public RecAdapter (List<Item> itemList){
        this.itemList=itemList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row,viewGroup,false);
        ItemHolder holder= new ItemHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
        Item item = itemList.get(i);
            itemHolder.itemText.setText(item.desc);
            itemHolder.itemImg.setImageResource(item.img);
            itemHolder.itemText2.setText(item.desc2);
            itemHolder.itemImg2.setImageResource(item.img2);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        ImageView itemImg;
        TextView itemText;
        ImageView itemImg2;
        TextView itemText2;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            itemImg= itemView.findViewById(R.id.imgId);
            itemText= itemView.findViewById(R.id.textId);
            itemImg2= itemView.findViewById(R.id.imgId2);
            itemText2= itemView.findViewById(R.id.textId2);
        }
    }
}