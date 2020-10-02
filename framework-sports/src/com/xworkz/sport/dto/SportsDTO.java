package com.xworkz.sport.dto;

import java.io.Serializable; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sports_table1")

public class SportsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name="SPORTS_NAME")
	private String name;
	@Column(name="GAME_TYPE")
	private String gameType;
	@Column(name="DURATION")
	private int duration;
	@Column(name="NO_OF_PLAYERS")
	private int noOfPlayers;
	@Id
	@Column(name="S_ID")
	@GenericGenerator(name = "vinayak", strategy = "auto")
	@GeneratedValue(generator="vinayak")
	private int sid;
	
	public SportsDTO()
	{
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "SportsDTO [name=" + name + ", gameType=" + gameType + ", duration=" + duration + ", noOfPlayers="
				+ noOfPlayers + ", sid=" + sid + "]";
	}
	
}
