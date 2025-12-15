package arrays001;

import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion {
	

	public Aplicacion() {
		String[] arrayS = {"D","", null, "C", "B", "A"};
		Ejemplos.comprimirArray(arrayS);
		//int [] array = {1,2,3,4,3,3,5,7,6,33,4,4,5,7,6};
		//System.out.println(Ejemplos.voltearArray(arrayS));
		//Ejemplos.imprimirArrayStringInverso(arrayS);
		//System.out.println(Ejemplos.eliminarDuplicados(array));
		//Ejemplos.devolverCambioArray(30.23 , 51);
		//Ejemplos.devolverCambio(750.45, 1000);
		//Ejemplos.invertirArray(array);
		//Ejemplos.ordenarArrayBurbuja(null);
		/*int opcion = -1;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Escoge una opción:");
			System.out.println("1) Generar cien números aleatorios.");
			System.out.println("2) Imprimir array predefinido.");
			System.out.println("3) Imprimir lista de personas.");
			System.out.println("4) Imprimir array de enteros aleatorios.");
			System.out.println("5) Imprimir array de personas indeterminadas.");
			System.out.println("0) Salir.");
			opcion = s.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 1:
				for(int i=0;i<100;i++)
					System.out.println(Ejemplos.generarNumeroAleatorio(3, 9));
				break;
			case 2:
				Ejemplos.imprimirArrayEnterosPredefinido();
				break;
			case 3:
				Ejemplos.imprimirArrayCuatroPersonas();
				break;
			case 4:
				Ejemplos.imprimirArrayEnterosAleatorios(10);
				break;
			case 5:
				Ejemplos.imprimirArrayPersonasIndeterminadas(3);
				break;
			default:
				System.out.println("Opción incorrecta.");
			}
			
		} while (opcion != 0);
*/
	}
	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();

	}

}
