package com.project.CricketApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CricketApp.entity.StatsEntity;

@Repository
public interface StatsRepo extends JpaRepository<StatsEntity, Long>{
	
	public StatsEntity findByPlayerId(long playerId);

}
