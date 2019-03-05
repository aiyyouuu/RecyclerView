package com.example.user.projectrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class DisneyAdapter extends RecyclerView.Adapter<DisneyAdapter.ViewHolder> {


    private Context context;
    private ArrayList<DisneyModel> disneyModels;

    public DisneyAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<DisneyModel> getDisneyList() {
        return disneyModels;
    }

    public void setDisneyModels(ArrayList<DisneyModel> disneyModels) {
        this.disneyModels = disneyModels;
    }

    @NonNull
    @Override

    public DisneyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view,viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull DisneyAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getDisneyList().get(i).getFotoPrincess()).into(viewHolder.ivFoto);
        viewHolder.tvNama.setText(getDisneyList().get(i).getNamaPrincess());
    }

    @Override
    public int getItemCount() {

        return getDisneyList().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivFoto;
        private TextView tvNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.foto1);
            tvNama = itemView.findViewById(R.id.tv1);
        }
    }

}
