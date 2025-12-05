package com.example.myadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class myCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCutomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        // Displays the data at a position in the data set.
        return null;
    }

    static class ViewHolder {
        // Holds references to the views within an item layout
        TextView textView;



    }
}
