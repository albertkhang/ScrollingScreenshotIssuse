package com.khangld.scrollingscreenshotissuse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khangld.scrollingscreenshotissuse.ItemUtil;
import com.khangld.scrollingscreenshotissuse.R;
import com.khangld.scrollingscreenshotissuse.vh.BigThumbVH;
import com.khangld.scrollingscreenshotissuse.vh.ListVH;
import com.khangld.scrollingscreenshotissuse.vh.RecyclerViewVH;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<ItemUtil.ItemType> mData = new ArrayList<>();
    private LayoutInflater mInflater;

    private static final int ITEM_HORIZONTAL = 0;
    private static final int ITEM_BIG_THUMB = 1;
    private static final int ITEM_LIST = 2;

    public HomeAdapter(Context context, List<ItemUtil.ItemType> data) {
        mInflater = LayoutInflater.from(context);
        setData(data);
    }

    public void setData(List<ItemUtil.ItemType> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case ITEM_HORIZONTAL:
                return new RecyclerViewVH(mInflater.inflate(R.layout.recycler_view_horizontal, parent, false));
            case ITEM_BIG_THUMB:
                return new BigThumbVH(mInflater.inflate(R.layout.item_big_thumb, parent, false));
            case ITEM_LIST:
                return new RecyclerViewVH(mInflater.inflate(R.layout.recycler_view_vertical, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case ITEM_HORIZONTAL:
                RecyclerViewVH vh = (RecyclerViewVH) holder;
                vh.mRecyclerView.setAdapter(new HorizontalAdapter(holder.itemView.getContext()));
                break;
            case ITEM_BIG_THUMB:
                BigThumbVH bigThumbVH = (BigThumbVH) holder;
                bigThumbVH.mImg.setText(String.valueOf(position));
                break;
            case ITEM_LIST:
                RecyclerViewVH listVH = (RecyclerViewVH) holder;
                listVH.mRecyclerView.setAdapter(new ListAdapter(holder.itemView.getContext()));
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (mData.get(position)) {
            case ItemHorizontal:
                return ITEM_HORIZONTAL;
            case ItemBigThumb:
                return ITEM_BIG_THUMB;
            case ItemList:
                return ITEM_LIST;
            default:
                return -1;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
