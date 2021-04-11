import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc=0;
		String nombre="", planetaProcedencia="", color_laser="";
		int edad=0, fuerza=0, potencial;
		Padawan[] padawanes= new Padawan[5];
		Jedi[] jedis= new Jedi[3];
		DeathStar[] estrellas=new DeathStar[5];
		main2.llenarDatosJedi(jedis, nombre, edad, fuerza, planetaProcedencia, color_laser);
		do {
			//LLamo al método estático que muestra en pantalla el menú de opciones
			main2.mostrarMenu();
			//Leo por teclado la opción que seleccione el usuario. 
			opc=sn.nextInt();

			switch (opc) {
			case 1:
				//Llamo al método que muestra en pantalla todos los datos de los Jedis.
				main2.datosJedi(jedis);
				break;
			case 2:
				//Llamo al metodo que muestra en pantalla todos los datos de los Padawans
				main2.datosPadawan(padawanes);
				break;
			case 3:
				jedis[2].datosPadawan();
				break;
			case 4:
				main2.fuerzaJedi(jedis);
				break;
			case 5:
				main2.coloresEspadas(jedis);
				break;
			case 6:
				main2.aumentoEdad(jedis);
				break;
			case 7:
				main2.salir();
				break;
			case 8:
				main2.madresPadawans(padawanes);
				break;
			case 9:
				main2.nombresPadres2(padawanes);
				break;
			case 10:
				main2.datosEspadaverde(padawanes);
				break;
			case 11:
				estrellas[0].nombresPlanetasSiths();
				break;
			case 12:
				estrellas[0].nombresPlanetasSithsab();
				break;
			default:
				
				break;
			}
		}while(opc!=7);

	}
	
	public static void llenarDatosJedi(Jedi[] jedis, String nombre, int edad, int fuerza, String planetaProcedencia, String color_laser) {
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<jedis.length; i++) {
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
			jedis[i]=new Jedi(nombre, edad, fuerza, planetaProcedencia, color_laser);
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("1. Mostrar en pantalla los datos de todos los Jedis del array de Jedis que hay en el main.");
		System.out.println("2. Mostrar en pantalla los datos de todos los padawans del array de Padawans que hay en el main.");
		System.out.println("3. Mostrar en pantalla los datos de todos los padawans que entrena el Jedi de la posición 2 en el array de jedis que hay en el main.");
		System.out.println("4. Muestra en pantalla todas las fuerzas de todos los Jedis del array de Jedis que hay en el main.");
		System.out.println("5. Muestra en pantalla los colores de las espadas laser de todos los padawans del array de padawans que hay en el main");
		System.out.println("6. Aumenta en 1 unidad la edad de todos los Jedis del array de Jedis que hay en el main");
		System.out.println("7. Salir.");
	}
	public static void datosJedi(Jedi[] jedis) {
		System.out.println("Los datos de los Jedis son:");
		for (int i = 0; i < jedis.length; i++) {
			jedis[i].mostrarDatos();
		}
	}
	
	public static void datosPadawan(Padawan[] padawanes) {
		System.out.println("Los datos de los Padawans son:");
		for(int i=0; i<padawanes.length; i++) {
			padawanes[i].mostrarDatos();
		}
	}
	
	public static void fuerzaJedi(Jedi[] jedis) {
		for(int i=0; i<jedis.length; i++) {
			System.out.println(jedis[i].getFuerza());
		}
	}
	
	public static void coloresEspadas(Jedi[] jedis) {
		for(int i=0; i<jedis.length; i++) {
			System.out.println(jedis[i].getColor_laser());
		}
	}
	
	public static void aumentoEdad(Jedi[] jedis) {
		for(int i=0; i<jedis.length; i++) {
			jedis[i].setEdad(jedis[i].getEdad()+1);
		}
	}
	
	public static void salir() {
		System.out.println("Hasta luego!");
	}
	
	public static void madresPadawans(Padawan[] padawanes) {
		for(int i=0; i<padawanes.length; i++) {
			System.out.println(padawanes[i].getPadres()[0].getNombre());
		}
	}
	
	public static void nombresPadres2(Padawan[] padawanes) {
		for(int i=0; i<padawanes.length; i++) {
			if((padawanes[i].getFuerza()<=9 && padawanes[i].getFuerza()>=5)  && !padawanes[i].getPadres()[0].getNombre().equalsIgnoreCase("Carmen")){
					System.out.println(padawanes[i].nombresPadres());
			}
		}
	}
	
	public static void datosEspadaverde(Padawan[] padawanes) {
		for(int i=0; i<padawanes.length; i++) {
			if(padawanes[i].getColor_laser().equalsIgnoreCase("verde") && (padawanes[i].getPadres()[0].getNombre().concat(padawanes[i].getPadres()[1].getNombre()).length()>14)) {
				padawanes[i].mostrarDatos();
			}
		}
	}
	
	public static String[] nombresNmuertes(Sith[] sith, int fuerza2) {
		int contPos=0;
		for(int i=0; i<sith.length; i++) {
			if(sith[i].getPlaneta_origen().equalsIgnoreCase("Planeta Azúl") || sith[i].getFuerza()>fuerza2) {
				contPos++;
			}
		}
		int contS=0;
		String[] nombresNmuertes=new String[contPos];
		for(int i=0; i<nombresNmuertes.length; i++) {
			nombresNmuertes[contS]="Nombre: " + sith[i].getNombre() + "numero de muertes: " + sith[i].getN_muertes();
			contS++;
		}
		
		return nombresNmuertes;
	}
	
	public static boolean padaPotencial(Padawan[] padawanes, int potencial) {
		boolean padaPotencial=false;
		int cont=0;
		for(int i=0; i<padawanes.length; i++) {
			if(padawanes[i].getPotencial()>potencial) {
				cont++;
			}
		}
		if(cont>=2) {
			padaPotencial=true;
		}
		return padaPotencial;
	}
	
	public static boolean padaJediPotencial(Jedi[] jedi, int potencial) {
		boolean padaJediPotencial=false;
		int cont=0;	
		for(int i=0; i<jedi.length; i++) {
			for(int j=0; j<jedi[i].getPadawanes().length; i++) {
				if(jedi[i].getPadawanes()[j].getPotencial()>potencial) {
					cont++;
				}
			}
		}
		if(cont>=2) {
			padaJediPotencial=true;
		}
		return padaJediPotencial;
	}
	
	public static void aumentoJedi(Jedi[] jedi) {
		for(int i=0; i<jedi.length; i++) {
			if(jedi[i].padamayor50()>=12) {
				jedi[i].setFuerza(jedi[i].getFuerza()+1);
			}
		}
	}
	
	public static String padawanJoven(Padawan[] padawan) {
		Padawan padawanJoven=padawan[0];
		for(int i=0; i<padawan.length; i++) {
			if(padawan[i].getEdad()<padawanJoven.getEdad()) {
				padawanJoven=padawan[i];
			}
		}
		return padawanJoven.getNombre();
	}
	
	public static void jediPadawanmayores(Jedi[] jedis) {
		Jedi jediPadawanmayor=jedis[0];
		for(int i=0; i<jedis.length; i++) {
			if(jedis[i].padasMayores()>jediPadawanmayor.padasMayores()) {
				jediPadawanmayor=jedis[i];
			}
		}
		System.out.println(jediPadawanmayor.getNombre());
	}
	
	public static int mediaFuerzasith(Sith[] sith) {
		int mediaFuerzasith=0;
		for(int i=0; i<sith.length; i++) {
			mediaFuerzasith=mediaFuerzasith+sith[i].getFuerza();
		}
		return mediaFuerzasith;
	}
	
	public static void sithSuperior(Sith[] sith) {
		for(int i=0; i<sith.length; i++) {
			if(sith[i].getFuerza()>main2.mediaFuerzasith(sith)) {
				System.out.println(sith[i].getNombre());
			}
		}
	}
	
	public static void padaJedisuperior(Jedi[] jedis) {
		for(int i=0; i<jedis.length; i++) {
			for(int j=0; j<jedis[i].getPadawanes().length; i++) {
				if(jedis[i].getPadawanes()[j].getEdad()<18 && jedis[i].getFuerza()>main2.mediaFuerzajedi(jedis)) {
					System.out.println(jedis[i].getPadawanes()[j].getNombre());
				}
			}
		}
	}
	
	public static int mediaFuerzajedi(Jedi[] jedis) {
		int mediaFuerzajedi=0;
		for(int i=0; i<jedis.length; i++) {
			mediaFuerzajedi=mediaFuerzajedi+jedis[i].getFuerza();
		}
		mediaFuerzajedi=mediaFuerzajedi/jedis.length;
		return mediaFuerzajedi;
	}
	
	
}
