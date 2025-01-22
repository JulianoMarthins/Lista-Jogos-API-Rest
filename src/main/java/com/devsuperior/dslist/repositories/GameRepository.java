package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Tipo da entidade é o game, long é o tipo de dados do ID primário.
public interface GameRepository extends JpaRepository<Game, Long> {

}
