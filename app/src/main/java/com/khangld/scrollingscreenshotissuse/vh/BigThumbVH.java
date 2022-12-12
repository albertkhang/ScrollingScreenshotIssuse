package com.khangld.scrollingscreenshotissuse.vh;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.R;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class BigThumbVH extends RecyclerView.ViewHolder {

    public TextView mImg;

    public BigThumbVH(@NonNull View itemView) {
        super(itemView);
        mImg = itemView.findViewById(R.id.img);
    }
}
