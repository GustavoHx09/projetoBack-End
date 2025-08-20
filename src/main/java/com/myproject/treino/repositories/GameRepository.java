package com.myproject.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.treino.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
