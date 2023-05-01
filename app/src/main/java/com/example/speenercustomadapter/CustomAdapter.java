package com.example.speenercustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private String[] countryName;
    private String[] population;
    private int[] flgs;
    Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context,int[] flgs,String[] countryName, String[] population) {
        this.countryName = countryName;
        this.population = population;
        this.flgs = flgs;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       convertView=layoutInflater.inflate(R.layout.sampleview,parent,false);
        }
        ImageView imageView=convertView.findViewById(R.id.imageView);
        imageView.setImageResource(flgs[position]);

        TextView textView=convertView.findViewById(R.id.textView2);
        textView.setText(countryName[position]);

            TextView population2=convertView.findViewById(R.id.textView);
        population2.setText(population[position]);
        return convertView;
    }
}
