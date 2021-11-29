package com.example.codeclan.frameDataPunishOptimiser.Models;

public class Move {
    private String input;
    private int startup;
    private String active;
    private int recovery;
    private int frameAdvantage;

    public Move(String input, int startup, String active, int recovery, int frameAdvantage) {
        this.input = input;
        this.startup = startup;
        this.active = active;
        this.recovery = recovery;
        this.frameAdvantage = frameAdvantage;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getStartup() {
        return startup;
    }

    public void setStartup(int startup) {
        this.startup = startup;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getFrameAdvantage() {
        return frameAdvantage;
    }

    public void setFrameAdvantage(int frameAdvantage) {
        this.frameAdvantage = frameAdvantage;
    }


}