package org.cuatrovientos.larris.models;

public class Commander {
	private String name;
	private String race;
	
	public Commander(){
	}
	
	public Commander(String name, String race) {
		this.name = name;
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Commander [name=" + name + ", race=" + race + "]";
	}
	
}
