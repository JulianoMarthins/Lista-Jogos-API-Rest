package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable // Encapsula dois atributos em uma só classe
public class BelongingPK {

    // Atributos de classe
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    // Construtores
    public BelongingPK(){

    }

    public BelongingPK(Game game, GameList gameList){
        this.game = game;
        this.gameList = gameList;
    }


    // Getters & Setters
    public Game getGame(){
        return this.game;
    }
    public void setGame(Game game){
        this.game = game;
    }
    public GameList getGameList(){
        return this.gameList;
    }
    public void setGameList(GameList gameList){
        this.gameList = gameList;
    }

    // Equals & HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }
}
