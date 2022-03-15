package com.app.gamers.GamersRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.gamers.GamersRegistration.entity.GamerEntity;

@Repository
public interface GamerRepository extends JpaRepository<GamerEntity, Integer>{
	
	@Query(value="select max(credit) from gamer g , credit c  where g.gamerid= c.gamerId and g.games.gamename=?1", nativeQuery=true)
	public Integer getMaxCreditForGame(String gameName);

}
