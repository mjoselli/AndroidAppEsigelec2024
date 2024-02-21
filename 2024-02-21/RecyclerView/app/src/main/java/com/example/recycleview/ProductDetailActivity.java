package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProductDetailActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText quantityEditText;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        nameEditText = findViewById(R.id.nameEditText);
        quantityEditText = findViewById(R.id.quantityEditText);
        saveButton = findViewById(R.id.saveButton);
        if(Singleton.getInstance().itemSelected >= 0){
            Product p = Singleton.getInstance().products.get(
                    Singleton.getInstance().itemSelected
            );
            nameEditText.setText(p.name);
            quantityEditText.setText(String.valueOf(p.quantity));
        }
        saveButton.setOnClickListener(view -> {
            Product p = new Product(
                    nameEditText.getText().toString(),
                    Integer.parseInt(quantityEditText.getText().toString())
            );
            if(Singleton.getInstance().itemSelected == -1){//Add
                Singleton.getInstance().products.add(p);
            }else{//Edit
                Singleton.getInstance().products.set(
                        Singleton.getInstance().itemSelected,
                        p
                );
            }
            finish();
        });
    }
}