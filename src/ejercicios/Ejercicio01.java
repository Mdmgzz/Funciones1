package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	static void eco(int numVeces) {
		for (int i=1;i<=numVeces;i++) {
			System.out.println("ECO");
		}
	}

	public static void main(String[] args) {
		// bloque de variables
		int numVeces;
		
		// creamos Scanner y preguntamos al usuario
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Numero de Veces que quieres que se escriba ECO: ");
		numVeces=sc.nextInt();

		// llamamos a la funcion para que se ejecute
		
		eco(numVeces);
		// cerramos scanner
		sc.close();
	}

}
