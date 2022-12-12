package com.khangld.scrollingscreenshotissuse.vh;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.R;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class RecyclerViewVH extends RecyclerView.ViewHolder {

    public RecyclerView mRecyclerView;

    public RecyclerViewVH(@NonNull View itemView) {
        super(itemView);
        mRecyclerView = itemView.findViewById(R.id.recycler_view);
    }
}
