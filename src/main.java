import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Jedi[] caballeros = new Jedi[5];
		Padawan[] jovenes = new Padawan[5];
		String nombre, planetaProcedencia, color_laser;
		int edad, fuerza, potencial;
		for(int i=0; i<caballeros.length; i++) {
			System.out.println("Introduzca nombre del jedi: ");
			nombre=sc.nextLine();
			System.out.println("Introduzca edad del jedi :");
			edad=sn.nextInt();
			System.out.println("Introduzca nivel de fuerza: ");
			fuerza=sn.nextInt();
			System.out.println("Introduzca planeta de procedencia: ");
			planetaProcedencia=sc.nextLine();
			System.out.println("Introduzca color de sable de luz: ");
			color_laser=sc.nextLine();
			caballeros[i]=new Jedi(nombre, edad, fuerza, planetaProcedencia, color_laser);
		}
		
		for(int i=0; i<caballeros.length; i++) {
			System.out.println("Introduzca nombre del jedi: ");
			nombre=sc.nextLine();
			System.out.println("Introduzca edad del jedi :");
			edad=sn.nextInt();
			System.out.println("Introduzca nivel de fuerza: ");
			fuerza=sn.nextInt();
			System.out.println("Introduzca potencial: ");
			potencial=sn.nextInt();
			System.out.println("Introduzca planeta de procedencia: ");
			planetaProcedencia=sc.nextLine();
			jovenes[i]=new Padawan(nombre, edad, fuerza, potencial, planetaProcedencia);
		}
		
		int opc;
		System.out.println("Elija una opcicon: ");
		System.out.println("1. Datos de todos los Jedis.");
		System.out.println("2. Datos de todos los Padawans.");
		System.out.println("3. Datos de un Jedi.");
		System.out.println("4. Datos de un Padawan.");
		System.out.println("5. Lista Padawan con potencial superior a valor proporcionado.");
		System.out.println("6. Datos de los dos Jedi con mas nivel de fuerza.");
		System.out.println("7. Datos Padawan con menor potencial.");
		System.out.println("8. Datos de todos los Padawan que su nombre empiece o termine en letra proporcionda.");
		System.out.println("9. Nombre de los Jedi en mayusculas.");
		System.out.println("10. Nombre de los Padawan en minusculas.");
		System.out.println("11. Salir.");
		opc=sn.nextInt();
		switch(opc) {
			case 1:
				for(int i=0; i<caballeros.length; i++) {
					caballeros[i].mostrarDatos();
				}
				break;
			case 2:
				for(int i=0; i<jovenes.length; i++) {
					jovenes[i].mostrarDatos();
				}
				break;
			case 3:
				System.out.println("Introduzca nombre de Jedi: ");
				String nombreBusca1=sc.nextLine();
				for(int i=0; i<caballeros.length; i++) {
					if(caballeros[i].getNombre().equalsIgnoreCase(nombreBusca1)) {
						caballeros[i].mostrarDatos();
					}else {
						System.out.println("Este Jedi no se encuentra.");
					}
				}
				break;
			case 4:
				System.out.println("Introduzca nombre de Padawan: ");
				String nombreBusca2=sc.nextLine();
				for(int i=0; i<jovenes.length; i++) {
					if(jovenes[i].getNombre().equalsIgnoreCase(nombreBusca2)) {
						jovenes[i].mostrarDatos();
					}else {
						System.out.println("Este Jedi no se encuentra.");
					}
				}
				break;
			case 5:
				System.out.println("Introduzca potencial: ");
				int potencialBusca=sc.nextInt();
				for(int i=0; i<jovenes.length; i++) {
					if(jovenes[i].getFuerza()>potencialBusca) {
						System.out.println(jovenes[i].getNombre());
					}
				}
				break;
			case 6:
				for(int i=0; i<caballeros.length; i++) {
					for(int j=0; j<caballeros.length-1; j++) {
						if(caballeros[j].getFuerza()>caballeros[j+1].getFuerza()) {
							Jedi aux=caballeros[i+1];
							caballeros[i+1]=caballeros[i];
							caballeros[i]=aux;
						}
					}
				}
				caballeros[0].mostrarDatos();
				caballeros[1].mostrarDatos();
				break;
			case 7:
				for(int i=0; i<jovenes.length; i++) {
					for(int j=0; j<jovenes.length; j++) {
						if(jovenes[j].getPotencial()<jovenes[j+1].getPotencial()) {
							Padawan aux=jovenes[i+1];
							jovenes[i+1]=jovenes[i];
							jovenes[i]=aux;
						}
					}
				}
				jovenes[0].mostrarDatos();
				break;
			case 8:
				System.out.println("Introduzca letra: ");
				String letraBusca=sc.nextLine();
				for(int i=0; i<jovenes.length; i++) {
					if(jovenes[i].getNombre().startsWith(letraBusca) || jovenes[i].getNombre().endsWith(letraBusca)) {
						jovenes[i].mostrarDatos();
					}
				}
				break;
			case 9:
				for(int i=0; i<caballeros.length; i++) {
					caballeros[i].setNombre(caballeros[i].getNombre().toUpperCase());
				}
				break;
			case 10:
				for(int i=0; i<jovenes.length; i++) {
					jovenes[i].setNombre(jovenes[i].getNombre().toLowerCase());
				}
				break;
			case 11:
				System.out.println("Hasta luego!");
				break;
		}
	}

}
