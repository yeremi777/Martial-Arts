package com.testing.shoesmary.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testing.shoesmary.R;
import com.testing.shoesmary.model.HomeModel;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<HomeModel> rvData;
    private ItemAdapterCallback itemAdapterCallback;

    public HomeAdapter(List<HomeModel> listData, ItemAdapterCallback mItemAdapterCallback){
        rvData = listData;
        itemAdapterCallback = mItemAdapterCallback;
    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_discount, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.tvDiskon.setText(rvData.get(position).getDiskonproduct());
        holder.ivPoster.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                itemAdapterCallback.onClick(view);
            }
        });
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ivPoster;
        public TextView tvDiskon;

        public ViewHolder(View v){
            super(v);
            tvDiskon = v.findViewById(R.id.tv_diskon);
            ivPoster = v.findViewById(R.id.iv_poster);
        }
    }

    public interface ItemAdapterCallback {
        void onClick(View view);
    }
}
