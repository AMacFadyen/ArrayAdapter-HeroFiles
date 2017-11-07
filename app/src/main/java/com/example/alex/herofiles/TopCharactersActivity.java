package com.example.alex.herofiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characters_list);
        TopCharacters topCharacters = new TopCharacters();
        ArrayList<Character> characterList = topCharacters.getList();

        TopCharactersAdapter characterAdapter = new TopCharactersAdapter(this,characterList);
        ListView characterLV = (ListView)findViewById(R.id.characterListView);
        characterLV.setAdapter(characterAdapter);
    }

    public void getCharacter(View listItem){
        Character character = (Character) listItem.getTag();
        Intent i = new Intent(this, CharacterActivity.class);
        i.putExtra("name", character.getName());
        i.putExtra("alias", character.getAlias());
        i.putExtra("power", character.getPowerLevel());

        startActivity(i);
    }
}
