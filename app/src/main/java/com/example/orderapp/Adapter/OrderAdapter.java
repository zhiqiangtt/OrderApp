package com.example.orderapp.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.orderapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class OrderAdapter extends SimpleAdapter {
    ArrayList<Map<String,Object>> data;
    public OrderAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.data= (ArrayList<Map<String, Object>>) data;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        int[] orderedLtvIds=new int[]{
                R.id.noTxv,R.id.nameTxv,R.id.descriptionTxv,R.id.nameTxv,R.id.priceTxv
        };
        TextView noTxv=view.findViewById(R.id.noTxv);
        TextView nameTxv=view.findViewById(R.id.nameTxv);
        TextView descriptionTxv=view.findViewById(R.id.descriptionTxv);
        TextView numTxv=view.findViewById(R.id.nameTxv);
        final TextView priceTxv=view.findViewById(R.id.priceTxv);
        priceTxv.setTag(position);
        CheckBox checkBox=view.findViewById(R.id.checkCkb);
        checkBox.setTag(position);
        return view;
    }
}