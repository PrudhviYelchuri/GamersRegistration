package com.app.gamers.GamersRegistration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="credit")
@Entity
public class CreditEntity {
	
	@Id
	private int creditId;
	
	@OneToOne
	private GamerEntity gamerEntity;
	
	private int credit;
	

	public int getCreditId() {
		return creditId;
	}

	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public GamerEntity getGamerEntity() {
		return gamerEntity;
	}

	public void setGamerEntity(GamerEntity gamerEntity) {
		this.gamerEntity = gamerEntity;
	}
	
	
}
