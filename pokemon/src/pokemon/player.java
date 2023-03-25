package pokemon;

import java.util.ArrayList;

public class player {
	
	private static final int CAPACİTY = 2;
private String name;
private int health=100;
private final  ArrayList<pokemon> pokemons =new ArrayList<pokemon>();
private int index =0;
public player(String name){
	this.name=name;
}

public void add(pokemon pokemon ) {
	if(this.pokemons.size()>=CAPACİTY) {
		System.out.println("Kapasite Dolu");
		return;
	}
	this.pokemons.add(pokemon);
}
public pokemon getNextPokemon() {
	if(index==0) {
		this.index=1;
		return pokemons.get(index);
	}else {
		this.index=0;
		return pokemons.get(1);
	}
}

@Override
public String toString() {
	return "player [" + name +  "-"  + health + "]";
}

public boolean isAlive() {
	return this.health>0;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public ArrayList<pokemon> getPokemons() {
	return pokemons;
}
}
