package br.com.tgamesh.encyclegames.dto;

import br.com.tgamesh.encyclegames.entity.Game;
import br.com.tgamesh.encyclegames.projections.GameMinProjection;

public class GameShortDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	GameShortDto(){
		
	}

	public GameShortDto(Game entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameShortDto(GameMinProjection entity) {
		id = entity.getId();
		title= entity.getTitle();
		year= entity.getYear();
		imgUrl= entity.getImgUrl();
		shortDescription= entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
