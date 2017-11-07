package com.example.alex.herofiles;

/**
 * Created by Alex on 07/11/2017.
 */

public class Character {
    private String name;
    private String alias;
    private String powerType;
    private int powerLevel;


    public Character(String name, String alias, String powerType, int powerLevel) {
        this.name = name;
        this.alias = alias;
        this.powerType = powerType;
        this.powerLevel = powerLevel;

    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getPowerType() {
        return powerType;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
