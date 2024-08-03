package com.project.CricketApp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.CricketApp.entity.PlayerEntity;
import com.project.CricketApp.exceptions.PlayerNotFoundException;
import com.project.CricketApp.repository.PlayerRepo;
import com.project.CricketApp.service.PlayerService;

@Component
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	PlayerRepo repo;

	@Override
	public PlayerEntity addPlayer(PlayerEntity player) {
		// TODO Auto-generated method stub
		player.setPlayerName(player.getPlayerName().toLowerCase());
		repo.save(player);
		return player;
	}

	@Override
	public List<PlayerEntity> getPlayersList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<PlayerEntity> getPlayerByName(String playerName) {
		// TODO Auto-generated method stub
		List<PlayerEntity> player = repo.findByPlayerName(playerName.toLowerCase());
		if( player.isEmpty())
			throw new PlayerNotFoundException("Player Not Found");
		else
			return player;
	}

}
