package com.example.android.miwok.Adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;

import java.util.ArrayList;

/**
 * Created by fire_ on 2/19/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackgroudColorID;

    public WordAdapter (Activity context , ArrayList<Word> words , int backgroudColorID){
        super(context,0,words);
        mbackgroudColorID =backgroudColorID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemListView = convertView ;
        if (itemListView == null){
            itemListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item ,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miwokNum = (TextView) itemListView.findViewById(R.id.miwokNumber);
        miwokNum.setText(currentWord.getMiwokTranslation());

        TextView defultNum = (TextView) itemListView.findViewById(R.id.enNumber);
        defultNum.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) itemListView.findViewById(R.id.imageView);
        if (currentWord.hasImageResourceID()) {
            imageView.setImageResource(currentWord.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View container = itemListView.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(),mbackgroudColorID);
        container.setBackgroundColor(color);

        return itemListView;
    }
}
