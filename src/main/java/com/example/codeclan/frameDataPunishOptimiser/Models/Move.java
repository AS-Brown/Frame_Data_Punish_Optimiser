package com.example.codeclan.frameDataPunishOptimiser.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "moves")
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "input")
    private String input;
    @Column(name = "startup")
    private int startup;
    @Column(name = "active")
    private String active;
    @Column(name = "recovery")
    private int recovery;
    @Column(name = "frameAdvantage")
    private int frameAdvantage;
    @ManyToOne
    @JoinColumn(name = "individual_id", nullable = false)
    @JsonIgnoreProperties({"moves"})
    private Individual individual;

    public Move(String input, int startup, String active, int recovery, int frameAdvantage, Individual individual) {
        this.input = input;
        this.startup = startup;
        this.active = active;
        this.recovery = recovery;
        this.frameAdvantage = frameAdvantage;
        this.individual = individual;
    }


    public Move(){

    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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