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
            Product p = Singleton.getInstance().getProducts().get(
                    Singleton.getInstance().itemSelected
            );
            nameEditText.setText(p.name);
            quantityEditText.setText(String.valueOf(p.quantity));
        }
        saveButton.setOnClickListener(view -> {

            if(Singleton.getInstance().itemSelected == -1){//Add
                Product p = new Product();
                p.name = nameEditText.getText().toString();
                p.quantity = Integer.parseInt(quantityEditText.getText().toString());
                Singleton.getInstance().addProduct(p);
            }else{//Edit
                Product p = Singleton.getInstance().getProducts().get(
                        Singleton.getInstance().itemSelected
                );
                p.name = nameEditText.getText().toString();
                p.quantity = Integer.parseInt(quantityEditText.getText().toString());
                Singleton.getInstance().updateProduct(p);
            }
            finish();
        });
    }
}