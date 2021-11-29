package com.example.codeclan.frameDataPunishOptimiser.Models;

import java.util.ArrayList;

public class Char {
    private String name;
    private ArrayList<Move> moves;

    public Char(String name) {
        this.name = name;
        this.moves = new ArrayList<Move>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public void addMoves(Move moves){
        this.moves.add(moves);
    }
}