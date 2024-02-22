package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    RecyclerView mainRecyclerView;
    Button addButton;
    ProductArrayAdapter adapter = new ProductArrayAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Singleton.getInstance().createDatabase(MainActivity.this);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        addButton = findViewById(R.id.addButton);
        mainRecyclerView.setAdapter(adapter);
        mainRecyclerView.setLayoutManager(
                new LinearLayoutManager(MainActivity.this));

        addButton.setOnClickListener(view -> {
            Singleton.getInstance().itemSelected = -1;
            Intent intent = new Intent(MainActivity.this,
                    ProductDetailActivity.class);
            startActivity(intent);
        });

        adapter.setClickListener(new ProductArrayAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Singleton.getInstance().itemSelected = position;
                Intent intent = new Intent(MainActivity.this,
                        ProductDetailActivity.class);
                startActivity(intent);
            }
            @Override
            public void onItemLongClick(View view, int position) {
                Singleton.getInstance().deleteProduct(position);
                adapter.notifyItemRemoved(position);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}