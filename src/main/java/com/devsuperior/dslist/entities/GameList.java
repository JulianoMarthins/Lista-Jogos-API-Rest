package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    // Atributos de Classe
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;


    // Construtores
    public GameList() {

    }

    public GameList(Long Id, String name) {
        this.Id = Id;
        this.name = name;
    }


    // Equals & Hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(Id, gameList.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }


    // Getters & Setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
