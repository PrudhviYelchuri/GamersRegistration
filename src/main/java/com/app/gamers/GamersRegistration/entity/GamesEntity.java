package com.app.gamers.GamersRegistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class GamesEntity {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id")
	private int id;

	@Column(name="gamename")
	private String gamename;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "gamer", nullable = false)
	    private GamerEntity gamer;

	public GamerEntity getGamer() {
		return gamer;
	}

	public void setGamer(GamerEntity gamer) {
		this.gamer = gamer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

}
