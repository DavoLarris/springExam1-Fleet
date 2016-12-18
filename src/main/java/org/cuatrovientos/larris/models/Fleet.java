package org.cuatrovientos.larris.models;

import java.util.Vector;

public class Fleet {
	private String name;
	private Commander general;
	private Vector<Ship> starships;
	
	public Fleet() {
	}

	public Fleet(String name, Commander general, Vector<Ship> starships) {
		this.name = name;
		this.general = general;
		this.starships = starships;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Commander getGeneral() {
		return general;
	}

	public void setGeneral(Commander general) {
		this.general = general;
	}

	public Vector<Ship> getStarships() {
		return starships;
	}

	public void setStarships(Vector<Ship> starships) {
		this.starships = starships;
	}
	
	public String showAll(Vector<Ship> starships){
		String result = "";
		
		for (Ship ship: starships){
			result += ship.toString() + "\n";
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Fleet [name=" + name + ", general=" + general + ", starships= \n" + showAll(this.starships) + "]";
	}
}
