package br.com.tgamesh.encyclegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tgamesh.encyclegames.dto.GameListDto;
import br.com.tgamesh.encyclegames.dto.GameShortDto;
import br.com.tgamesh.encyclegames.service.GameListService;
import br.com.tgamesh.encyclegames.service.GameService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {

	@Autowired
	private GameListService service;
	@Autowired
	private GameService listService;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GameListDto>findAll(){
		return service.findAll();
	}
	
	@GetMapping(value="/{id}/games",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GameShortDto>listFindAll(@PathVariable Long id){
		return listService.listFindAll(id);
	}
}
