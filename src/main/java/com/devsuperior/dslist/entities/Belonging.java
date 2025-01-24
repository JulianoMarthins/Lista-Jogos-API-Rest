package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

// Classe que referência as classes de jogos e lista de jogos, esta classe que organiza os
// games por ordem definida pelo usuário. Nesta classe devemos observar que não pode ter
// duas referências a objetos contendo ID, logo, será necessário criar uma classe auxiliar
// e nesta classe, que denominaremos de BelongingPK, (pertencimento)

@Entity // Mapeia esta classe para uma tabela no banco de dados
@Table(name = "tb_belonging") // Nomeia a tabela mapeada conforme Strig passada como argumento.
public class Belonging {

    @EmbeddedId // encapsula os ID dos dois objetos em um só.
    private BelongingPK id = new BelongingPK(); // Instancia o objeto BelongingPK na chamada da classe

    private Integer position;

    // Construtores
    public Belonging() {

    }

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game); // Referencia o game recebido do argumento direto para o objeto game lá
        // classe game, que esta sendo referenciada pela classe BelongingPK

        this.id.setGameList(gameList); // Referencia o gameList recebido do argumento direto para o objeto
        // gameList lá da classe GameList, que esta sendo referenciada pela classe BelongingPK

        this.position = position;
    }


    // Equals & HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // Getters & Setters

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
