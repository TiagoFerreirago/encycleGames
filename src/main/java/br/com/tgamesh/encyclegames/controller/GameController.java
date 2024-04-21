package br.com.tgamesh.encyclegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tgamesh.encyclegames.dto.GameDto;
import br.com.tgamesh.encyclegames.dto.GameShortDto;
import br.com.tgamesh.encyclegames.service.GameService;

public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GameShortDto>findAll(){
		return service.findAll();
	}
	
	@GetMapping(value="/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	public GameDto findById(@PathVariable(value="id")Long id) {
		return service.findById(id);
	}
}
