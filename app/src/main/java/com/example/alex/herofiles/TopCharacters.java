package com.example.alex.herofiles;

import java.util.ArrayList;

/**
 * Created by Alex on 07/11/2017.
 */

public class TopCharacters {
    private ArrayList<Character> characterList;

    public TopCharacters() {
        characterList = new ArrayList<Character>();
        characterList.add(new Character("Jim Howlett","Wolverine", "Mutant Healing Factor, Adamatium Skeleton, Adamantium Claws", 58));
        characterList.add(new Character("Charles Xavier", "Professor", "Mind Control", 90));
        characterList.add(new Character("Jean Gray", "Dark Phoenix","Telepathic, Telekinetic powers, access to the cosmic Phoenix Force", 95));
        characterList.add(new Character("Frank Castle", "The Punisher", "no powers, just guns and explosives", 40));
        characterList.add(new Character("Thor", "God of Thunder", "Controls Lightning and Hits things with Mjolnir", 80));
        characterList.add(new Character("Tony Stark", "IronMan", "Power Suit and Technology far superior to most, and he is a smart cookie.", 75));
        characterList.add(new Character("Max Eisenhardt", "Magneto", "Master of Magnetism", 85));
    }

    public ArrayList<Character> getList() {
        return new ArrayList<>(characterList);
    }

}
