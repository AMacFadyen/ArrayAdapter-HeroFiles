package com.example.alex.herofiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by Alex on 07/11/2017.
 */

public class TopCharactersAdapter extends ArrayAdapter<Character> {

    public TopCharactersAdapter(Context context, ArrayList<Character> characters){
        super(context, 0, characters);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.character_item,parent,false);
        }
        Character currentCharacter = getItem(position);
        TextView name = (TextView)listItemView.findViewById(R.id.nameTextView);
        name.setText(currentCharacter.getName().toString());
        TextView alias = (TextView)listItemView.findViewById(R.id.aliasTextView);
        alias.setText(currentCharacter.getAlias().toString());
        TextView power = (TextView)listItemView.findViewById(R.id.powerTextView);
        power.setText(currentCharacter.getPowerLevel().toString());

        listItemView.setTag(currentCharacter);
        return listItemView;
    }
}
