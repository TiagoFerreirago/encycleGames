package br.com.tgamesh.encyclegames.entity;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPK PK = new BelongingPK();
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList list, Integer position) {
		
		PK.setGame(game);
		PK.setList(list);
		this.position = position;
	}

	public BelongingPK getPK() {
		return PK;
	}

	public void setPK(BelongingPK pK) {
		PK = pK;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PK);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(PK, other.PK);
	}
	
	
	
	
}
