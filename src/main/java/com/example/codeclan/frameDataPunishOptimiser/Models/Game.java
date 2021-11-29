package com.example.codeclan.frameDataPunishOptimiser.Models;

import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Char> characters;

    public Game(String name) {
        this.name = name;
        this.characters = new ArrayList<Char>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Char> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Char> characters) {
        this.characters = characters;
    }

    public void addCharacters(Char character){
        this.characters.add(character);
    }
}