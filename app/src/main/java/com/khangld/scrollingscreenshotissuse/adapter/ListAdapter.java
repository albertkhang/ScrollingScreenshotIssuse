package com.khangld.scrollingscreenshotissuse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.R;
import com.khangld.scrollingscreenshotissuse.vh.ListVH;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class ListAdapter extends RecyclerView.Adapter<ListVH> {

    private LayoutInflater mInflate;

    public ListAdapter(Context context) {
        mInflate = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListVH(mInflate.inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListVH holder, int position) {
        holder.mText.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
