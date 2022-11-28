package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	static void operacion(int num1 , int num2) {
		
		for (int i=num1+1;i<num2;i++) {
			System.out.print(" "+i+" ");
		}
	}

	public static void main(String[] args) {
		// bloqque de variables
		int num1,num2;				// se guardan los numeros que introducirá el usuario
		
		//creamos scanner
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario por los numeros
		System.out.println("Introduzca un número: ");
		num1=sc.nextInt();
		System.out.println("Introduzca otro número: ");
		num2=sc.nextInt();
		
		System.out.println("Entre el numero "+num1 + " Y " + num2 +" hay los siguientes numeros: ");
		
		// llamamos a la funcion
		if (num1>num2) {
			operacion(num2,num1);
		}else {
			operacion(num1,num2);
		}
		
		//cerramos scanner
		sc.close();
	}

}
