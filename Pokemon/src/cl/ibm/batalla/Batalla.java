package cl.ibm.batalla;

import cl.ibm.pokemon.Pokemon;

public class Batalla {

	int tiempo;
	int turnos;
	Pokemon[] pokemon;

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	public Pokemon[] getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon[] pokemon) {
		this.pokemon = pokemon;
	}
	


}
