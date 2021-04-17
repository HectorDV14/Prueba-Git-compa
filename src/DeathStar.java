import java.util.Arrays;

public class DeathStar {
	private String nombre;
	private String galaxia;
	private Sith[] siths;
	public DeathStar(String nombre, String galaxia, Sith[] sith) {
		this.nombre = nombre;
		this.galaxia = galaxia;
		this.siths = siths;
	}
	
	public DeathStar() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGalaxia() {
		return galaxia;
	}

	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}

	public Sith[] getSiths() {
		return siths;
	}

	public void setSiths(Sith[] sith) {
		this.siths = sith;
	}
	
	public String[] nombresSithsArray() {
		String[] nombresSiths=new String[this.siths.length];
		for(int i=0; i<this.siths.length; i++) {
			nombresSiths[i]=this.siths[i].getNombre();
		}
		return nombresSiths;
	}
	
	public String nombresSiths() {
		String nombresSiths="";
		for(int i=0; i<this.siths.length; i++) {
			nombresSiths=nombresSiths + " - " + this.siths[i].getNombre();
		}
		return nombresSiths;
	}
	
	public void nombresPlanetasSiths() {
		for(int i=0; i<this.siths.length; i++) {
			System.out.println(this.siths[i].getPlaneta_origen());
		}
	}
	
	public void nombresPlanetasSithsab() {
		for(int i=0; i<this.siths.length; i++) {
			if(this.siths[i].getNombre().startsWith("a") && this.siths[i].getNombre().startsWith("b")) {
				System.out.println(this.siths[i].getPlaneta_origen());
			}
		}
	}
	
	public void nombresSithsNmuertes(String letra1, String letra2) {
		for(int i=0; i<this.siths.length; i++) {
			if(this.siths[i].getN_muertes()<200 && this.siths[i].getNombre().startsWith(letra1) && String.valueOf(this.siths[i].getNombre().charAt(4)).equalsIgnoreCase(letra2)) {
				this.siths[i].mostrarDatos();
			}
		}
	}
	
	public void nombreFuerza() {
		for(int i=0; i<this.siths.length; i++) {
			for(int j=0; j<this.siths.length-1; j++) {
				if(this.siths[j].getFuerza()<this.siths[j+1].getFuerza()) {
					Sith aux=this.siths[j+1];
					this.siths[j+1]=this.siths[j];
					this.siths[j]=aux;
				}
			}
		}
		for(int i=0; i<4; i++) {
			System.out.println("Nombre: " + this.siths[i].getNombre() + "fuerza: " + this.siths[i].getFuerza());
		}
	}
	
	public Sith[] sithM() {
		int contPos=0, cont=0;
		for(int i=0; i<this.siths.length; i++) {
			if(this.siths[i].getN_muertes()>mediaMuertes() && !this.siths[i].getPlaneta_origen().equalsIgnoreCase("Planeta Rojo")) {
				contPos++;
			}
		}
		Sith[] sithM=new Sith[contPos];
		for(int i=0; i<this.siths.length; i++) {
			if(this.siths[i].getN_muertes()>mediaMuertes() && !this.siths[i].getPlaneta_origen().equalsIgnoreCase("Planeta Rojo")) {
				sithM[cont]=this.siths[i];
				cont++;
			}
		}
		return sithM;
	}
	
	public int mediaMuertes() {
		int muertes=0;
		for(int i=0; i<this.siths.length; i++) {
			muertes=muertes+this.siths[i].getN_muertes();
		}
		int mediaMuertes=muertes/this.siths.length;
		return mediaMuertes;
	}
	
	public int mediaFuerza() {
		int mediaFuerza=0;
		for(int i=0; i<siths.length; i++) {
			mediaFuerza=mediaFuerza+siths[i].getFuerza();
		}
		mediaFuerza=mediaFuerza/siths.length;
		return mediaFuerza;
	}
	
	public int sithsMenosmedia() {
		int cont=0;
		for(int i=0; i<siths.length; i++) {
			if(siths[i].getFuerza()<mediaFuerza()) {
				cont++;
			}
		}
		return cont;
	}
	
//Changes added toString method
	@Override
	public String toString() {
		return "DeathStar [nombre=" + nombre + ", galaxia=" + galaxia + ", siths=" + Arrays.toString(siths)
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
