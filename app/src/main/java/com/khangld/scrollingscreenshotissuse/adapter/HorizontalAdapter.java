package com.khangld.scrollingscreenshotissuse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.R;
import com.khangld.scrollingscreenshotissuse.vh.HorizontalVH;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalVH> {

    private LayoutInflater mInflater;

    public HorizontalAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HorizontalVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalVH(mInflater.inflate(R.layout.item_horizontal, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalVH holder, int position) {
        holder.mText.setText(String.valueOf(Math.round(Math.random() * 10)));
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
