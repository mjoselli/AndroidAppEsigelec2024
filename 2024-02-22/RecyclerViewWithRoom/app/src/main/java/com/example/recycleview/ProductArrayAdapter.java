package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductArrayAdapter
        extends RecyclerView.Adapter<ProductArrayAdapter.ViewHolder> {
    public interface ItemClickListener{
        void onItemClick(View view,int position);
        void onItemLongClick(View view,int position);
    }
    private ItemClickListener clickListener;
    public void setClickListener(ItemClickListener clickListener){
        this.clickListener = clickListener;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView1;
        TextView textView2;
        public ViewHolder(View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(view -> {
                if(clickListener != null){
                    clickListener.onItemClick(view,getAdapterPosition());
                }
            });
            itemView.setOnLongClickListener(view -> {
                if(clickListener != null){
                    clickListener.onItemLongClick(view,getAdapterPosition());
                    return true;
                }
                return false;
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_recyclerview,parent,false);
        return new ViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product p = Singleton.getInstance().getProducts().get(position);
        holder.textView1.setText(p.name);
        holder.textView2.setText(String.valueOf(p.quantity));
    }
    @Override
    public int getItemCount() {
        return Singleton.getInstance().getProducts().size();
    }
}
