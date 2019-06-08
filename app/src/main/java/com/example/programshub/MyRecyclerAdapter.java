package com.example.programshub;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.support.constraint.Constraints.TAG;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>  {
    private item_data[] itemsData;


    private String mitem;
    MyRecyclerAdapter(item_data[] itemsData)
    {
        this.itemsData = itemsData;
    }
  // Create new views (invoked by the layout manager)

    @NonNull

    @Override
    public MyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        final String TAG = "RecyclerViewAdapter";
        @SuppressLint("InflateParams") View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topic_list, null);


        // create ViewHolder

        return new ViewHolder(itemLayoutView);
    }



    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtViewTitle;
        RelativeLayout parentLayout;

        ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
              txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
              parentLayout=itemLayoutView.findViewById(R.id.parent_layout_topiclist);

       }
    }


    public void onBindViewHolder(@NonNull MyRecyclerAdapter.ViewHolder viewHolder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
    }

    // inner class to hold a reference to each item of RecyclerView

    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount()
    {
        return itemsData.length;

    }
    public static interface ClickListener{
        public void onClick(View view,int position);
        public void onLongClick(View view,int position);
    }
}
