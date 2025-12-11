  package unidad01;

import java.util.Scanner;

public class BUCLE11 {

	public static void main(String[] args) {
//Escribe un programa que pida precios al usuario
//hasta que introduza un número negativo, y muestre la suma total.
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int precio = 0;

		System.out.println("Introduce precios (número negativo para terminar):");

		while (precio >= 0) {
			precio = sc.nextInt();
			if (precio >= 0) {
				suma = suma + precio;
			}
		}

		System.out.println("La suma total es: " + suma);
		sc.close();
	}

}
