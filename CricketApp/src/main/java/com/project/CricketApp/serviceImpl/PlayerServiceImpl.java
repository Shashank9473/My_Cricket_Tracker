package com.project.CricketApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.CricketApp.entity.PlayerEntity;
import com.project.CricketApp.repository.PlayerRepo;
import com.project.CricketApp.service.PlayerService;

@Component
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	PlayerRepo repo;

	@Override
	public PlayerEntity addPlayer(PlayerEntity player) {
		// TODO Auto-generated method stub
			repo.save(player);
		return player;
	}

	@Override
	public List<PlayerEntity> getPlayersList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
