package br.com.tgamesh.encyclegames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tgamesh.encyclegames.dto.GameDto;
import br.com.tgamesh.encyclegames.dto.GameShortDto;
import br.com.tgamesh.encyclegames.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly=true)
	public List<GameShortDto>findAll(){
		var entity= repository.findAll();
		return entity.stream().map(x -> new GameShortDto(x)).toList();
		
	}
	@Transactional(readOnly=true)
	public GameDto findById(Long id) {
		var entity = repository.findById(id).get();
		GameDto dto = new GameDto(entity);
		return dto;
	}
}
