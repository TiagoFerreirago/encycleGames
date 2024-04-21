package br.com.tgamesh.encyclegames.dto;

import org.springframework.beans.BeanUtils;

import br.com.tgamesh.encyclegames.entity.GameList;

public class GameListDto {

	private Long id;
	private String name;
	
	
	public GameListDto() {
		
	}
	
	public GameListDto(GameList entity) {
		BeanUtils.copyProperties(entity,this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
