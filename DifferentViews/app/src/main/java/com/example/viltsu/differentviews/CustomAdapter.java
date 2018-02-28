package com.example.viltsu.differentviews;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ville-pekkapalmgren on 26/02/18.
 */

public class CustomAdapter extends ArrayAdapter<DataObject> {

        public CustomAdapter(Activity context, ArrayList<DataObject> say){
            super(context, 0, say);
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listItem = convertView;

            if(listItem == null){
                listItem = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item_view, parent, false
                );
            }

        DataObject currentMessage = getItem(position);

        TextView first = listItem.findViewById(R.id.first);

        first.setText(currentMessage.getName());

        ImageView bird = listItem.findViewById(R.id.list_pic);

        bird.setImageResource(currentMessage.getPictureId());

        return listItem;

    }

}
