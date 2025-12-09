package com.example.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class myCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public myCustomAdapter(Context context, String[] items) {
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
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if ( convertView == null ){
            // ConvertView: is a recycled view that you can reuse to improve the performance
            //              of the list view
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.my_list_item, parent, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.text1);
            convertView.setTag(holder);

        } else {
            // Reusing the view (that's recycled)
            holder = (ViewHolder) convertView.getTag();
        }

        // Set the data for the view
        holder.textView.setText(items[i]);

        return convertView;   // Displays the data at a position in the data set.
    }

    static class ViewHolder {
        // Holds references to the views within an item layout
        TextView textView;



    }
}