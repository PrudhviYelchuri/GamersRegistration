package com.app.gamers.GamersRegistration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gamers.GamersRegistration.dto.Gamer;
import com.app.gamers.GamersRegistration.entity.GamerEntity;
import com.app.gamers.GamersRegistration.repository.GamerRepository;

@Service
public class GamerRegistrationService {

	@Autowired
	GamerRepository gamerRepository;

	public String createGamer(Gamer gamer){
		GamerEntity entity=convertEntity( gamer);
		gamerRepository.save(entity);
		return "successfully saved the gamer :"+entity.getId();
	}

	public Gamer findGamer(int id) {
		Optional<GamerEntity> entity= gamerRepository.findById(id);
		if(entity.isPresent()) {
			return convertFromEntity(entity.get());
		}else {
			return null;
		}

	}


	public List<String> lookupGames(){
		List<String> list=new ArrayList<>();
		list.add("fortnite");
		list.add("call of duty");
		list.add("dota");
		list.add("volhalla");
		list.add("amongus");
		

		return list;


	}



	public List<Gamer> searchGamer() {


		List<GamerEntity> listOfEntities= gamerRepository.findAll();
		List<Gamer> listOfGamers=new ArrayList<>();
		for(GamerEntity entity:listOfEntities ) {

			listOfGamers.add(convertFromEntity(entity)); 
		}		  
		return listOfGamers;
	}

	public GamerEntity convertEntity( Gamer gamer) {
		GamerEntity entity=new GamerEntity();
		entity.setName(gamer.getName());
		entity.setGender(gamer.getGender());
		entity.setGeography(gamer.getGeography());
		entity.setNickname(gamer.getNickname());

		return entity;

	}

	public Gamer convertFromEntity(GamerEntity entity) {

		Gamer dto=new Gamer();
		dto.setGender(entity.getGender());
		dto.setGeography(entity.getGeography());
		dto.setName(entity.getName());
		dto.setNickname(entity.getNickname());

		return dto;
	}

}
