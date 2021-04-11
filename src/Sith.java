
public class Sith {
	private String nombre;
	private int fuerza;
	private String planeta_origen;
	private int n_muertes;
	
	public Sith(String nombre, int fuerza, String planeta_origen, int n_muertes) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.planeta_origen = planeta_origen;
		this.n_muertes = n_muertes;
	}
	
	public Sith() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public String getPlaneta_origen() {
		return planeta_origen;
	}

	public void setPlaneta_origen(String planeta_origen) {
		this.planeta_origen = planeta_origen;
	}

	public int getN_muertes() {
		return n_muertes;
	}

	public void setN_muertes(int n_muertes) {
		this.n_muertes = n_muertes;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre + " nivel de fuerza: " + this.fuerza + " planeta de procedencia: " + this.planeta_origen + " numero de muertes: " + this.n_muertes);
	}
	
	
}
