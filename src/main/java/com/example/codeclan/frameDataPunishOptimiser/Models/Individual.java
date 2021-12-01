package com.example.codeclan.frameDataPunishOptimiser.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "individuals")
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @JsonIgnoreProperties({"individual"})
    @OneToMany(mappedBy = "individual", fetch = FetchType.LAZY)
    private List<Move> moves;
    @JsonIgnoreProperties({"individuals"})
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    public Individual(String name, Game game) {
        this.name = name;
        this.game = game;
        this.moves = new ArrayList<Move>();
    }

    public Individual(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}