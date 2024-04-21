package br.com.tgamesh.encyclegames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tgamesh.encyclegames.dto.GameDto;
import br.com.tgamesh.encyclegames.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameDto>findAll(){
		var entity= repository.findAll();
		return entity.stream().map(x -> new GameDto(x)).toList();
		
	}
}
