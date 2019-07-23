package cl.ibm.pokemon;

public class Habilidad {

	public String nombre_Habilidad;

	public int danno;
	
	

	public Habilidad(String nombre_Habilidad, int danno) {
		super();
		this.nombre_Habilidad = nombre_Habilidad;
		this.danno = danno;
	}

	public String getNombre_Habilidad() {
		return nombre_Habilidad;
	}

	public void setNombre_Habilidad(String nombre_Habilidad) {
		this.nombre_Habilidad = nombre_Habilidad;
	}

	public int getDanno() {
		return danno;
	}

	public void setDanno(int danno) {
		this.danno = danno;
	}

}
