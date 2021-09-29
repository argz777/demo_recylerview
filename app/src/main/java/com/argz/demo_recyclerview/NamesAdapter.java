package com.argz.demo_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.MyViewHolder> {

    private LayoutInflater mInflater;
    ArrayList<String> listOfNames;

    public NamesAdapter(Context context, ArrayList<String> names){
        listOfNames = names;
        mInflater = LayoutInflater.from(context);
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_name, parent, false);
        return new MyViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name = listOfNames.get(position);
        holder.tv_name.setText(name);
    }

    @Override
    public int getItemCount() {
        return listOfNames.size();
    }









    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public final TextView tv_name;
        final NamesAdapter mAdapter;

        public MyViewHolder(View itemView, NamesAdapter adapter){
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            this.mAdapter = adapter;
        }
    }
}
