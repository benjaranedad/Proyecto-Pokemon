package cl.ibm.pokemon;

public class Tipo {

	public String nombre;
	public String debilidad;
	public int FactorDaño;

	public Tipo(String nombre, String debilidad, int factorDaño) {
		super();
		this.nombre = nombre;
		this.debilidad = debilidad;
		FactorDaño = factorDaño;
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

	public int getFactorDaño() {
		return FactorDaño;
	}

	public void setFactorDaño(int factorDaño) {
		FactorDaño = factorDaño;
	}

}
