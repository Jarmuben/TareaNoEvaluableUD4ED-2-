package prueba;
import java.util.Scanner;

public class PideEscribirNombreEdad {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		// Pongo la linea de arriba siempre que solicito datos de entrada al usuario y poder ller nextInt, nextLine, etc.

		System.out.println ("Escribe tu apellido :");

		String apellido = sc.nextLine();

		System.out.println ("Escribe la edad :");

		int edad= sc.nextInt ();

		System.out.println("Tu apellido es "+ apellido+ " y tienes " + edad+ " años.");



		saludar(apellido);
	}

	// Nuevo método para saludar al usuario
	public static void saludar(String nombre) {
		System.out.println("¡Hola, " + nombre + "! Bienvenido al programa.");
	}
}



