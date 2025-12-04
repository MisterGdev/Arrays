package arrays001;

import java.lang.reflect.Array;
import java.util.Scanner;

public abstract class Ejemplos {

	public static boolean DEPURACION = true;
	/**
	 * Genera un numero aleatorio entre le minimo y el maximo
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		/*
		 * int resultadoFinal;
		 * double resultadoDouble = Math.random();
		 * double resultadoDoubleIntervalo = resultadoDouble * (maximo - minimo);
		 * int resultadoEntero = (int) resultadoDoubleIntervalo;
		 * resultadoFinal = resultadoEntero + minimo; 
		 * System.out.println(resultadoFinal); 
		 * return resultadoFinal;
		 */
		return (int)(Math.random()*(maximo-minimo)+minimo);
	}

	/**
	 * Imprime un array de 4 posiciones.
	 */
	public static void imprimirArrayEnterosPredefinido() {
		int arrayEnteros[] = {4,7,8,2};
		//System.out.println(arrayEnteros[0]);//4
		//System.out.println(arrayEnteros[3]);//2
		//System.out.println(arrayEnteros[5]);//Dará error.
		//arrayEnteros[0]=99;
		//System.out.println(arrayEnteros[0]);//99
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);
	}
	
	public static void imprimirArrayEnterosAleatorios(int longitud) {
		int arrayEnteros[]=new int[longitud]; //Esto va a ser 10
		//Crear un array de 10 posiciones y llenarlo con números del 0 al 9
		//e imprimirlo
		for(int i=0;i<longitud;i++)
			arrayEnteros[i]=Ejemplos.generarNumeroAleatorio(0, 10);
		imprimirArrayEnteros(arrayEnteros);
	}
	
	public static void imprimirArrayPersonasIndeterminadas(int longitud) {
		//Pida por teclado tantos nombres como longitud tiene el array
		//y los muestra por pantalla ("La persona 1 es Pepe", por ejemplo).
		String nombres[]=new String[longitud];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Introduce un nombre:");
			nombres[i]=s.next();
		}
		for(int i=0;i<nombres.length;i++) {
			System.out.println("La persona "+(i+1)+" se llama "+nombres[i]);
		}
		Ejemplos.imprimirArrayStringInverso(nombres);
	}
	
	public static void imprimirArrayStringInverso(String arrayStrings[]) {
		String cadenaImprimir="{";
		for(int i=arrayStrings.length-1;i>=0;i--) {
			cadenaImprimir+=arrayStrings[i];
			if(i>0)
				cadenaImprimir+=",";			
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);
	}
		
	public static void imprimirArrayEnteros(int arrayEnteros[]) {
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);	
	}
	
	public static void imprimirArrayCuatroPersonas() {
		String arrayPersonas[]= {"María","Luis","Manolo","Lola"};
		for(int i=0;i<arrayPersonas.length;i++)
			System.out.println("La persona "+(i+1)+" se llama "+arrayPersonas[i]);
	}
	
	/**
	 * Imprimir seis números aleatorios entre el 1 y el 49 no repetidos.
	 */
	
	public static void imprimirApuestaLoteria() {
		int apuestas[] = new int [6];
		for (int i = 0; i < apuestas.length; i++) {
			int numeroAleatorio = Ejemplos.generarNumeroAleatorio(1,50);
			while(Ejemplos.existeNumero(numeroAleatorio, apuestas)) {
				//System.out.println("Numero repetido " + numeroAleatorio);
				imprimirTraza("Numero repetido: " + numeroAleatorio);
				numeroAleatorio = Ejemplos.generarNumeroAleatorio(1,50);
			}
			apuestas[i] = numeroAleatorio;
		}
		Ejemplos.imprimirArrayEnteros(apuestas);
		
		//for(int i = 0;i < 6; i++) {
		//System.out.println(generarNumeroAleatorio(1,50));
		//}
	}
	
	public static boolean existeNumero(int n, int array[]) {
		boolean existe = false;
		for (int i = 0; i < array.length ; i++) {
			if(array[i] == n) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	public static int[] ordenarArrayEnteros(int arrayEnteros[]) {
		int arrayOrdenado[]=new int[arrayEnteros.length];
		return arrayOrdenado;
	}
	
	public static void imprimirTraza(String mensaje) {
		if(DEPURACION == true) {
			System.out.println("[TRAZA] " + mensaje);
		}
	}

}
