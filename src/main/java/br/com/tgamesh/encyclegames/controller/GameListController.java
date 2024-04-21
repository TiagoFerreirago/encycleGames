package br.com.tgamesh.encyclegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tgamesh.encyclegames.dto.GameListDto;
import br.com.tgamesh.encyclegames.service.GameListService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {

	@Autowired
	private GameListService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GameListDto>findAll(){
		return service.findAll();
	}
}
