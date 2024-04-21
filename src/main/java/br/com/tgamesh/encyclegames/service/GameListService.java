package br.com.tgamesh.encyclegames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tgamesh.encyclegames.dto.GameListDto;
import br.com.tgamesh.encyclegames.repository.GameListRepository;
@Service
public class GameListService {

	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly=true)
	public List<GameListDto>findAll(){
		var entity= repository.findAll();
		return entity.stream().map(p -> new GameListDto(p)).toList();
	}
}
