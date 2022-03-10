package com.app.gamers.GamersRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.gamers.GamersRegistration.dto.Gamer;
import com.app.gamers.GamersRegistration.service.GamerRegistrationService;


@RestController
public class GamersRegistrationController {

	@Autowired
	GamerRegistrationService servicel;


	@PostMapping("/creategamer")
	public String createGamer(@RequestBody Gamer gamer) {
		return servicel.createGamer( gamer);
	}


	@GetMapping("/searchAllgamers")
	public List<Gamer> getGamers() {
		return servicel.searchGamer();
	}
	
	@GetMapping("/findgamer/{id}")
	public Gamer getGamer(@PathVariable("id") Integer no) {
		return servicel.findGamer(no);
	}

	
	@GetMapping("/lookup/games")
	public List<String> getGames() {
		return servicel.lookupGames();
	}



	@PutMapping("/update")
	public String updateGamer(@RequestBody Gamer gamer) {
		servicel.createGamer( gamer);
		return null;
	}


}
