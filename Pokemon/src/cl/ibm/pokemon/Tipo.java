package cl.ibm.pokemon;

public class Tipo {

	public String nombre;
	public String debilidad;
	public int FactorDa�o;

	public Tipo(String nombre, String debilidad, int factorDa�o) {
		super();
		this.nombre = nombre;
		this.debilidad = debilidad;
		FactorDa�o = factorDa�o;
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

	public int getFactorDa�o() {
		return FactorDa�o;
	}

	public void setFactorDa�o(int factorDa�o) {
		FactorDa�o = factorDa�o;
	}

}
