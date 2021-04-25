
public class Padawan {
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planetaProcedencia;
	private String color_laser;
	private Jedi[] padres;
	
	//contructor
	
	public Padawan(String nombre, int edad, int fuerza, int potencial, String planetaProcedencia, Jedi[] padres, String color_laser) {
		this.nombre=nombre;
		this.edad=edad;
		if(fuerza>=0 && fuerza<=10) {
			this.fuerza=fuerza;
		}
		this.potencial=potencial;
		this.planetaProcedencia=planetaProcedencia;
		this.padres=padres;
		this.color_laser=color_laser;
	}
	
	public Padawan(String nombre, int edad, int fuerza, int potencial, String planetaProcedencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.potencial = potencial;
		this.planetaProcedencia = planetaProcedencia;
	}
	
	public Padawan() {
		
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getPotencial() {
		return potencial;
	}
	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}
	public String getPlanetaProcedencia() {
		return planetaProcedencia;
	}
	public void setPlanetaProcedencia(String planetaProcedencia) {
		this.planetaProcedencia = planetaProcedencia;
	}
	
	public String getColor_laser() {
		return color_laser;
	}

	public void setColor_laser(String color_laser) {
		this.color_laser = color_laser;
	}

	public Jedi[] getPadres() {
		return padres;
	}

	public void setPadres(Jedi[] padres) {
		this.padres = padres;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " edad: " + edad + " fuerza: " + fuerza + " potencial: " + potencial + " planeta de procedencia: " + planetaProcedencia);
	}
	
	public void madresPadawans() {
		for(int i=0; i<padres.length; i++) {
			System.out.println();
		}
	}
	
	
	public String nombresPadres() {
		String nombresPadres=this.getPadres()[0].getNombre() + " - " + this.getPadres()[1].getNombre();
		return nombresPadres;
	}

	
}
