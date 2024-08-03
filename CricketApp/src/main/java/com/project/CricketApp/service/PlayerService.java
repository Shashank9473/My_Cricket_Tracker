package com.project.CricketApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.CricketApp.entity.PlayerEntity;

@Service
public interface PlayerService {
	
	public PlayerEntity addPlayer(PlayerEntity player);
	
	public List<PlayerEntity> getPlayersList();

}
