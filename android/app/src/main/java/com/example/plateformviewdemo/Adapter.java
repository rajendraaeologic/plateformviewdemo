package com.example.plateformviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<AdapterViewHolder> {

    Context context;
    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.test, parent, false);
        AdapterViewHolder vh = new AdapterViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.textView.setText("Recycler View Item "+position);
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(view -> {
            // display a toast with person name on item click
            Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return 50;
    }
}

class AdapterViewHolder extends RecyclerView.ViewHolder {
    TextView textView;// init the item view's
    public AdapterViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }
}

