package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// A classe Repository, serve para realizar todas as operações básicas do banco de dados,
// incluíndo a classe game e o Long, parametros genéricos para a herança da JpaRepository.
    public interface GameRepository extends JpaRepository<Game, Long> {

}
