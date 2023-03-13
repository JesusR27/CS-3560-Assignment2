//CS 3560 Assignment 2 Problem 5C
//Name: Jesus Regino

import java.util.ArrayList;

public class Team {
	
	//attributes
	//this class can have one or more "Player" objects in it, so it has a list for them
	private int code;
	private ArrayList<Player> team = new ArrayList<Player>();
	
	//no-arg constructor, so any "Team" object can be made without a code
	public Team() {
		
	}
	
	//method to add "Player" objects to the list
	public void addPlayer(Player player) {
		team.add(player);
	}
}
