package cl.ibm.pokemon;

public class Tipo {

	public String nombre;
	public String debilidad;
	public int FactorDano;

	public Tipo(String nombre, String debilidad, int factorDano) {
		super();
		this.nombre = nombre;
		this.debilidad = debilidad;
		FactorDano = factorDano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}

	public int getFactorDano() {
		return FactorDano;
	}

	public void setFactorDano(int factorDano) {
		FactorDano = factorDano;
	}

}
