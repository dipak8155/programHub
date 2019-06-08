package com.example.programshub;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class JAVA_list_Activity  extends Activity {
    String[] topiclist;
    private Context context;
    RecyclerView recyclerView;

    private AdapterView.OnItemClickListener itemClickListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        recyclerView = findViewById(R.id.topic_recycler);
        AssetManager assetManager = this.getAssets();
        try {
            String string2;
            BufferedReader bufferedReader = new BufferedReader((Reader) new InputStreamReader(assetManager.open("topic.txt")));
            int n = 0;
            while ((string2 = bufferedReader.readLine()) != null) {
                if (string2.trim() == "") continue;
                String[] arrstring = this.topiclist;
                int n2 = n + 1;
                arrstring[n] = string2;
                n = n2;

                item_data[] C_items = {
                        new item_data("1. Write A Program to print Hello World."),
                        new item_data("2. Write a program to print your details"),
                        new item_data("3. W.A.P to ptint a variable"),
                        new item_data("4. W.A.P to sum of two number"),
                        new item_data("5. W.A.P to subctraction of two number"),
                        new item_data("6. W.A.P to multiplecation of two number"),
                        new item_data("7. W.A.P to division of two number"),
                        new item_data("8. W.A.P to find average of three number." +
                                "")};
                MyRecyclerAdapter mAdapter = new MyRecyclerAdapter(C_items);
                // 4. set adapter
                recyclerView.setAdapter(mAdapter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




                 }
    }

