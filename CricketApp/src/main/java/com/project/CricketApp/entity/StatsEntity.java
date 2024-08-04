package com.project.CricketApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Stats")
public class StatsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long totalRuns;
	private long totalInnings;
	private long totalOvers;
	private long wicketsTaken;
	private long playerId;
	private long totalFifties;
	private long totalHundreds;
	private long maidenOvers;
	
	
	public StatsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StatsEntity(long totalRuns, long totalInnings, long totalOvers, long wicketsTaken, long playerId,
			long totalFifties, long totalHundreds, long maidenOvers) {
		super();
		this.totalRuns = totalRuns;
		this.totalInnings = totalInnings;
		this.totalOvers = totalOvers;
		this.wicketsTaken = wicketsTaken;
		this.playerId = playerId;
		this.totalFifties = totalFifties;
		this.totalHundreds = totalHundreds;
		this.maidenOvers = maidenOvers;
	}
	
	public long getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(long totalRuns) {
		this.totalRuns = totalRuns;
	}
	public long getTotalInnings() {
		return totalInnings;
	}
	public void setTotalInnings(long totalInnings) {
		this.totalInnings = totalInnings;
	}
	public long getTotalOvers() {
		return totalOvers;
	}
	public void setTotalOvers(long totalOvers) {
		this.totalOvers = totalOvers;
	}
	public long getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(long wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public long getTotalFifties() {
		return totalFifties;
	}
	public void setTotalFifties(long totalFifties) {
		this.totalFifties = totalFifties;
	}
	public long getTotalHundreds() {
		return totalHundreds;
	}
	public void setTotalHundreds(long totalHundreds) {
		this.totalHundreds = totalHundreds;
	}
	public long getMaidenOvers() {
		return maidenOvers;
	}
	public void setMaidenOvers(long maidenOvers) {
		this.maidenOvers = maidenOvers;
	}
	
	
}
