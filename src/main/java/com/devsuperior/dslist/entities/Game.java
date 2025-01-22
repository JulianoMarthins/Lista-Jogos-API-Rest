package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity // Associa a classe ao banco de dados fazendo com que seja criado uma tabela para os atributos da classe
@Table(name = "tb_game") // A tabela criada será com o nome passado no argumento.
public class Game {

    // Atributos de Classe
    @Id() // Faz com que o próximo atributos seja uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automáticamente.
    private Long id;
    private String title;

    @Column(name = "game_year") // O nome passado como argumento será o nome da coluna do próximo atributo
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Lob // Esta anotação faz com que o próximo atributo aceite mais de 255 character no banco de dados.
    private String shortDescription;

    @Lob // Esta anotação faz com que o próximo atributo aceite mais de 255 character no banco de dados.
    private String longDescription;


    // Construtores
    public Game() {

    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score,
                String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


    // region Equals & HashCode
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    // endregion


    // region Getters & Setters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    // endregion

}
