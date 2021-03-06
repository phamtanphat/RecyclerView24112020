package com.example.recyclerview24112020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvNowFoodVn;
    List<NowFoodVn> mArrNowFoodVns;
    NowFoodVnAdapter mNowFoodVnAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvNowFoodVn = findViewById(R.id.recycleNowVn);

        mArrNowFoodVns = NowFoodVn.getMock();
        // data mock : data giả
        mNowFoodVnAdapter = new NowFoodVnAdapter(mArrNowFoodVns);
        mRcvNowFoodVn.addItemDecoration(new DividerItemDecoration(this , DividerItemDecoration.VERTICAL));
        mRcvNowFoodVn.setAdapter(mNowFoodVnAdapter);

        mNowFoodVnAdapter.setOnItemClickListener(new OnClickListenerItem() {
            @Override
            public void onClick(Integer position) {
                mArrNowFoodVns.remove(Integer.parseInt(position + ""));
                mNowFoodVnAdapter.notifyItemRemoved(Integer.parseInt(position + ""));
            }
        });
    }
}