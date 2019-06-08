package com.example.programshub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;

public class C_list_Activity extends Activity {
    private List <C_list_Activity> c_list;
    codes Codes;
    Bundle bundle=new Bundle();
    int posi=bundle.getInt("pos");;

    // MyRecyclerAdapter myRecyclerAdapter= new MyRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.topic_recycler);


        // this is data fro recycler view
        item_data[] C_items = {
                new item_data("1. Write A Program to print Hello World."),
                new item_data("2. Write a program to print your details"),
                new item_data("3. W.A.P to print a variable"),
                new item_data("4. W.A.P to sum of two number"),
                new item_data("5. W.A.P to subctraction of two number"),
                new item_data("6. W.A.P to multiplecation of two number"),
                new item_data("7. W.A.P to division of two number"),
                new item_data("8. W.A.P to find average of three number." +
                        "")};

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        MyRecyclerAdapter mAdapter = new MyRecyclerAdapter(C_items);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new MyRecyclerAdapter.ClickListener() {
            Intent intent=new Intent();
            Intent i = new Intent(C_list_Activity.this, display_code.class);
            @Override
            public void onClick(View view, final int position) {
                if (position == 0) {


                  //bundle.putInt("pos",0);
                intent.putExtra("pos","1");
                    startActivity(i);


                }
               else if (position == 1) {

                  // bundle.putInt("pos",1);
                    intent.putExtra("pos","2");
                    startActivity(i);
                }
                else if (position == 2) {

                    //bundle.putInt("pos",2);
                    intent.putExtra("pos","3");
                    startActivity(i);
                }
                else if (position == 3) {

                    //bundle.putInt("pos",3);
                    intent.putExtra("pos","4");
                    startActivity(i);
                }
                if (position == 4) {

                    //bundle.putInt("pos",4);
                    intent.putExtra("pos","5");
                    startActivity(i);
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }




}
