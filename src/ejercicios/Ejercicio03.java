package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	static void areaVolumen(int opcion, int radio, int altura) {
		switch(opcion) {
		case 1:
			double calculoArea;
			calculoArea= 2*Math.PI*radio*(altura+radio);
			System.out.printf("El Área del cilindro es de: %.2f",calculoArea);
		break;
		
		case 2:
			double calculoVolumen;
			calculoVolumen=Math.PI*(radio*radio)*altura;
			System.out.printf("El Volumen del cilindro es de: %.2f" , calculoVolumen );
	}	
	}
	

	public static void main(String[] args) {
		// bloque de variables
		int opcion;			// se guarda la opcion que elija el usuario
		int radio,altura;	// se guarda los datos del cilindro
		
		// cramos scanner
		Scanner sc=new Scanner(System.in);
		
		//preguntamos por el radio y la altura
		System.out.println("Introduzca el radio:");
		radio=sc.nextInt();
		System.out.println("Introduzca la altura: ");
		altura=sc.nextInt();
		
		// preguntamos al usuario que quiere calcular
		System.out.println("¿Que quiere calcular?");
		System.out.println("1- Area");
		System.out.println("2- Volumen");
		opcion=sc.nextInt();
		
		// llamamos a la funcion
		areaVolumen(opcion,radio,altura);
		
		//cerramos scanner
		sc.close();
		}

	}
