package com.khangld.scrollingscreenshotissuse.vh;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.R;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class HorizontalVH extends RecyclerView.ViewHolder {

    public TextView mText;

    public HorizontalVH(@NonNull View itemView) {
        super(itemView);
        mText = itemView.findViewById(R.id.text);
    }
}
