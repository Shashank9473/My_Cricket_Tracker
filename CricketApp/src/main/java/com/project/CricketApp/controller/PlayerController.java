package com.project.CricketApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.CricketApp.entity.PlayerEntity;
import com.project.CricketApp.service.PlayerService;

@RestController
@RequestMapping("/api/player")
public class PlayerController {
	
	@Autowired
	PlayerService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PlayerEntity createPlayer(@RequestBody PlayerEntity player) {
		return service.addPlayer(player);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<PlayerEntity> getAllPlayers(){
		return service.getPlayersList();
	}

}
