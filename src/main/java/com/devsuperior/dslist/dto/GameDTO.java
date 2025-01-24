package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameDTO {

    // Atributos da classe
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;


    // Construtores
    public GameDTO(){

    }

    public GameDTO(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.genre = entity.getGenre();
        this.platforms = entity.getGenre();
        this.score = entity.getScore();
        this.imgUrl = entity.getImgUrl();;
        this.shortDescription = entity.getShortDescription();
        this.longDescription = entity.getLongDescription();

        // BeanUtils.copyProperties(entity, this); Não utilizado por fins didáticos.
    }

    // Existe uma ferramenta do framework muito útil para casos onde precisamos passar todos os atributos da classe
    // Game para a classe GameDTO, ao invés de copiar todos os atributos um por um como eu fiz, poder acessado em
    // uma única linha de código, < BeanUtils.copyProperties(entity, this); >. Os parâmetros passados como argumento
    // a cópia de propriedades são, o entity que seria a variável da classe Game descrita como parâmetro do construtor,
    // e o this, este sendo a referência a própria classe. Neste caso a classe atual é obrigatória ter os métodos getters
    // e Setters, nos casos onde não utilizamos o copy.Properties, podemos utilizar somente os Setters.


    // region Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
