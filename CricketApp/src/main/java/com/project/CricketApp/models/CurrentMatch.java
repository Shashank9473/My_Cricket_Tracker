package com.project.CricketApp.models;

public class CurrentMatch {
	
	private long runs;
	private long balls;
	private long overs;
	private long wickets;
	private String playerName;
	
	public CurrentMatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentMatch(long runs, long balls, long overs, long wickets, String playerName) {
		super();
		this.runs = runs;
		this.balls = balls;
		this.overs = overs;
		this.wickets = wickets;
		this.playerName = playerName;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public long getBalls() {
		return balls;
	}
	public void setBalls(long balls) {
		this.balls = balls;
	}
	public long getOvers() {
		return overs;
	}
	public void setOvers(long overs) {
		this.overs = overs;
	}
	public long getWickets() {
		return wickets;
	}
	public void setWickets(long wickets) {
		this.wickets = wickets;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	

}
