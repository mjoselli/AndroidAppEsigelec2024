package com.example.recycleview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
    public int itemSelected = -1;
    ProductDAO productDAO;
    public void createDatabase(Context context){
        productDAO = AppDatabase.getInstance(context).productDAO();
    }
    public List<Product> getProducts(){
        return productDAO.getAll();
    }
    public void addProduct(Product p){
        productDAO.insertAll(p);
    }
    public void updateProduct(Product p){
        productDAO.updateAll(p);
    }
    public void deleteProduct(int index){
        Product p = getProducts().get(index);
        productDAO.delete(p);
    }
}
