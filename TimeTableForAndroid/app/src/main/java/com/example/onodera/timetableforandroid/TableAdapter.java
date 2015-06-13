package com.example.onodera.timetableforandroid;

/**
 * Created by Onodera on 2015/05/30.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TableAdapter extends BaseAdapter{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private String[] mTableArray = {
            "00", "月", "火", "水","木", "金",
            "1限",  "月1", "火1", "水1","木1", "金1",
            "2限",  "月2", "火2", "水2","木2", "金2",
            "3限",  "月3", "火3", "水3","木3", "金3",
            "4限",  "月4", "火4", "水4","木4", "金4",
            "5限",  "月5", "火5", "水5","木5", "金5",
    };
    private Integer[] mTableIdArray = {
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,
            R.drawable.table_ff4040,R.drawable.table_ffcf40,R.drawable.table_9fff40,R.drawable.table_40ff6f,R.drawable.table_40ffff,R.drawable.table_406fff,

    };
    private static class ViewHolder {
        public ImageView tableImageView;
        public TextView  tableTextView;
    }

    public TableAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return mTableArray.length;
    }

    public Object getItem(int position) {
        return mTableArray[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.grid_item_table, null);
            holder = new ViewHolder();
            holder.tableImageView = (ImageView)convertView.findViewById(R.id.table_imageview);
            holder.tableTextView = (TextView)convertView.findViewById(R.id.table_textview);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tableImageView.setImageResource(mTableIdArray[position]);
        holder.tableTextView.setText(mTableArray[position]);

        return convertView;
    }
}
