package com.example.onodera.timetableforandroid.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created on 15/06/20.
 */
public class EditPageAdapter extends BaseAdapter {
    public Context context;

    private static class ViewHolder {
        public ImageView tableImageView;
        public TextView tableTextView;
    }

    public EditPageAdapter(Context context){
        this.context = context;
    }


    public int getCount() {
        return 0;
    }

    public Object getItem(int position) {
        return 0;
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
