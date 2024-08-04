package com.project.CricketApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.CricketApp.models.CurrentMatch;
import com.project.CricketApp.service.StatsService;

@RestController
@RequestMapping("/api/stats")
public class StatsController {
	
	@Autowired
	StatsService statsService;
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public String updatePlayerStats(@RequestBody CurrentMatch currentMatch ) {
		return statsService.updateStats(currentMatch);
	}

}
