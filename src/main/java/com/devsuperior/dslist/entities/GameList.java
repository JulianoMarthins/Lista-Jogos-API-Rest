package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity // Criação de tabela para esta classe no banco de dados
@Table(name = "tb_game_list") // Esta tabela criada será chamada conforme string passada no argumento
public class GameList {

    // Atributos de Classe
    @jakarta.persistence.Id // ID primary key criada
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O id será autoincrimentado conforme sua indentação
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
