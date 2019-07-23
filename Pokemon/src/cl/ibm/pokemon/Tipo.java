package cl.ibm.pokemon;

public class Tipo {

	public String nombre;
	public String debilidad;
	public int FactorDaño;

	public Tipo() {
		super();

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
