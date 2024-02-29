package prueba;
import java.util.Scanner;

public class PideEscribirNombreEdad {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		// Pongo la linea de arriba siempre que solicito datos de entrada al usuario y poder ller nextInt, nextLine, etc.

		System.out.println ("Escribe el nombre :");

		String nombre = sc.nextLine();

		System.out.println ("Escribe la edad :");

		int edad= sc.nextInt ();

		System.out.println("Tu nombre es "+ nombre+ " y tienes " + edad+ " años.");

	}


}


