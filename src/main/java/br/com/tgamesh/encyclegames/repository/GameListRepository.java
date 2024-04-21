package br.com.tgamesh.encyclegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tgamesh.encyclegames.entity.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
