package com.project.CricketApp.service;

import org.springframework.stereotype.Service;

import com.project.CricketApp.models.CurrentMatch;

@Service
public interface StatsService {
	
	public String updateStats(CurrentMatch currentMatch);

}
