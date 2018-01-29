package com.example.administrator.multisnaprecyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by takusemba on 2017/08/03.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private String[] tvShowNames;
    private int[] tvShowImages;

    public HorizontalAdapter(String[] tvShowNames, int[] tvShowImages) {
        this.tvShowNames = tvShowNames;
        this.tvShowImages = tvShowImages;
    }

    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_horizontal, viewGroup, false);
        return new HorizontalAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.ViewHolder holder, int position) {
        String title = tvShowNames[position];
        holder.title.setText(title);

        int image = tvShowImages[position];
        holder.image.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return tvShowNames.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView image;

        ViewHolder(final View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}