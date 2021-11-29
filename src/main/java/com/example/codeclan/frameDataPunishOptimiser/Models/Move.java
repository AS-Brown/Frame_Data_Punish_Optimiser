package com.example.codeclan.frameDataPunishOptimiser.Models;

import java.util.ArrayList;

public class Move {
    private String input;
    private ArrayList<MoveDetails> moveDetails;

    public Move(String input) {
        this.input = input;
        this.moveDetails = new ArrayList<MoveDetails>();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ArrayList<MoveDetails> getMoveDetails() {
        return moveDetails;
    }

    public void setMoveDetails(ArrayList<MoveDetails> moveDetails) {
        this.moveDetails = moveDetails;
    }

    public void addMoveDetails(MoveDetails moveDetails){
        this.moveDetails.add(moveDetails);
    }
}