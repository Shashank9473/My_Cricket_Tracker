package com.project.CricketApp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.CricketApp.entity.PlayerEntity;
import com.project.CricketApp.entity.StatsEntity;
import com.project.CricketApp.exceptions.PlayerNotFoundException;
import com.project.CricketApp.models.CurrentMatch;
import com.project.CricketApp.repository.PlayerRepo;
import com.project.CricketApp.repository.StatsRepo;
import com.project.CricketApp.service.StatsService;

@Component
public class StatsServiceImpl implements StatsService{
	
	@Autowired
	PlayerRepo playerRepo;
	
	@Autowired
	StatsRepo statsRepo;

	@Override
	public String updateStats(CurrentMatch currentMatch) {
		// TODO Auto-generated method stub
		StatsEntity stats;
		PlayerEntity playerDetails = playerRepo.findByPlayerName(currentMatch.getPlayerName()).get(0);
		if(playerDetails == null)
			throw new PlayerNotFoundException("Player Not in the DB");
		
		stats = statsRepo.findByPlayerId(playerDetails.getId());
		if( stats == null) {
			stats = new StatsEntity();
			stats.setPlayerId(playerDetails.getId());
		}
		stats.setTotalRuns(stats.getTotalRuns()+currentMatch.getRuns());
		stats.setTotalInnings(stats.getTotalInnings()+1);
//		stats.setMaidenOvers(0);
		stats.setTotalOvers(currentMatch.getOvers());
		stats.setWicketsTaken(currentMatch.getWickets());
		if( currentMatch.getRuns() >= 50 && currentMatch.getRuns() < 100)
			stats.setTotalFifties(stats.getTotalFifties()+1);
		if( currentMatch.getRuns() >= 100)
			stats.setTotalHundreds(stats.getTotalHundreds()+1);
		statsRepo.save(stats);
			
		return "Stats have been updated";
	}

}
