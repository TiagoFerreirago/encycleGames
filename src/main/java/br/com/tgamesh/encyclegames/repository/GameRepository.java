package br.com.tgamesh.encyclegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tgamesh.encyclegames.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
