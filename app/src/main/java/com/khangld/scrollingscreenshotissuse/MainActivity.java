package com.khangld.scrollingscreenshotissuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.khangld.scrollingscreenshotissuse.adapter.HomeAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUpdate;
    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private ArrayList<ItemUtil.ItemType> mData = ItemUtil.getData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnUpdate = findViewById(R.id.btnUpdate);
        mRecyclerView = findViewById(R.id.recycler_view);
        mAdapter = new HomeAdapter(this, mData);

        mRecyclerView.setAdapter(mAdapter);

        mBtnUpdate.setOnClickListener(v -> {
            mAdapter.setData(ItemUtil.getData());
            Toast.makeText(this, "Updated", Toast.LENGTH_SHORT).show();
        });
    }
}