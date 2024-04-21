package br.com.tgamesh.encyclegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tgamesh.encyclegames.dto.GameDto;
import br.com.tgamesh.encyclegames.service.GameService;

public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GameDto>findAll(){
		return service.findAll();
	}
}
