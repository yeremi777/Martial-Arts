package com.testing.martialarts;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMartialArtsAdapter extends RecyclerView.Adapter<ListMartialArtsAdapter.ListViewHolder> {
    private ArrayList<MartialArts> listMartialArts;

    public ListMartialArtsAdapter(ArrayList<MartialArts> list){
        this.listMartialArts = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onitemClickCallback){
        this.onItemClickCallback = onitemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_martial_arts, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        MartialArts martialArts = listMartialArts.get(position);
        Glide.with(holder.itemView.getContext())
                .load(martialArts.getLogoBelaDiri())
                .apply(new RequestOptions().override(70, 70))
                .into(holder.imgLogo);
        holder.tvName.setText(martialArts.getNamaBelaDiri());
        holder.tvDetail.setText(martialArts.getDetailBelaDiri());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMartialArts.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMartialArts.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(MartialArts data);
    }
}
