package cl.ibm.pokemon;

public class Pokemon {

	int energia;
	String nombre;
	Tipo tipo;
	Habilidad [] habilidades;


	public Pokemon(int energia, String nombre, Tipo tipo, Habilidad[] habilidades) {
		super();
		this.energia = energia;
		this.nombre = nombre;
		this.tipo = tipo;
		this.habilidades = habilidades;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Habilidad[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades) {
		this.habilidades = habilidades;
	}

	public static void atacar() {

	}

	public static void da�orecivido() {

	}

}
