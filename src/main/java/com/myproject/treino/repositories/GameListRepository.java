package com.myproject.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.treino.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
