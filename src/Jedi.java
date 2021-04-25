
public class Jedi {
	private String nombre;
	private int edad;
	private int fuerza;
	private String planetaProcedencia;
	private String color_laser;
	private Padawan[] padawanes;
	
	public Jedi(String nombre, int edad, int fuerza, String planetaProcedencia, String color_laser) {
		this.nombre=nombre;
		this.edad=edad;
		if(fuerza>=0 && fuerza<=10) {
			this.fuerza=fuerza;
		}
		this.planetaProcedencia=planetaProcedencia;
		this.color_laser=color_laser;
		this.padawanes=padawanes;
	}
	
	public Jedi() {
		
	}
	
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
	
	public Padawan[] getPadawanes() {
		return padawanes;
	}

	public void setPadawanes(Padawan[] padawanes) {
		this.padawanes = padawanes;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " edad: " + edad + " fuerza: " + fuerza + " planeta de procedencia: " + planetaProcedencia + " color de sable de luz: " + color_laser);
	}
	
	public void datosPadawan() {
		for(int i=0; i<this.padawanes.length; i++) {
			this.padawanes[i].mostrarDatos();
		}
	}
	
	public String[] nombresPadawanes() {
		String[] nombresPadawanes=new String[this.padawanes.length];
		for(int i=0; i<this.padawanes.length; i++) {
			nombresPadawanes[i]=this.padawanes[i].getNombre();
		}
		return nombresPadawanes;
	}
	
	public int[] fuerzasPadawanes() {
		int[] fuerzasPadawanes=new int[this.padawanes.length];
		for(int i=0; i<this.padawanes.length; i++) {
			fuerzasPadawanes[i]=this.padawanes[i].getFuerza();
		}
		return fuerzasPadawanes;
	}
	
	public int padamayor50() {
		int padamayor50=0;
		for(int i=0; i<padawanes.length; i++) {
			if(padawanes[i].getPotencial()>50) {
				padamayor50++;
			}
		}
		return padamayor50;
	}
	
	public int edadMedia() {
		int edadMedia=0;
		for(int i=0; i<padawanes.length; i++) {
			if(padawanes[i].getEdad()>=18) {
				edadMedia=edadMedia+padawanes[i].getEdad();
			}
		}
		edadMedia=edadMedia/padawanes.length;
		return edadMedia;
	}
	
	public int padasMayores() {
		int cont=0;
		for(int i=0; i<padawanes.length; i++) {
			if(padawanes[i].getEdad()>=18) {
				cont++;
			}
		}
		return cont;
	}

}
