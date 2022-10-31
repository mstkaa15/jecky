package com.example.tgsrecycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {

    private ArrayList<Makanan> dataList;
    private Context ctx;
    private int pilihan;

    public MakananAdapter(ArrayList<Makanan> dataList, Context ctx, int pil) {

        this.dataList = dataList;
        this.ctx = ctx;
        this.pilihan = pil;
    }

    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.MakananViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtPenjelasan.setText(dataList.get(position).getPenjelasan());
        holder.img.setImageResource(dataList.get(position).getImg());

        holder.containerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pilihan == 1){
                    Intent i = new Intent(ctx,GridActivity.class);
                    ctx.startActivity(i);
                }
                else if (pilihan == 2){
                    Intent i = new Intent(ctx,Stagger.class);
                    ctx.startActivity(i);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtPenjelasan;
        private ImageView img;
        private LinearLayout containerBtn;

        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.txt_nama);
            txtPenjelasan = itemView.findViewById(R.id.txt_penjelasan);
            img = itemView.findViewById(R.id.image1);
            containerBtn = itemView.findViewById(R.id.containerBtn);

        }
    }
}

