package com.example.plateformviewdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Map;
import io.flutter.plugin.platform.PlatformView;

class NativeView implements PlatformView {
    ///private final TextView textView;
    private RecyclerView recyclerView;

    NativeView(Context context, int id, Map<String, Object> creationParams) {
        recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new Adapter(context)); // set the Adapter to RecyclerView
        /*textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "this is native view", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public View getView() {
        return recyclerView;
    }

    @Override
    public void dispose() {}
}
