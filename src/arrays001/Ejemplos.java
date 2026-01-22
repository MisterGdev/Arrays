package arrays001;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Ejemplos {

	public static boolean DEPURACION = true; //Me sirve para probar codigo si esta en true.
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
	
	public static boolean esMenor(int a, int b) {
		if(a<b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esMayor(int a, int b) {
		if(a>b) {
			return true;
		} else {
				return false;
		}
	}
	
	public static void imprimirTraza(String mensaje) {
		if(DEPURACION == true) {
			System.out.println("[TRAZA] " + mensaje);
		}
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
	
	public static String arrayEnterosToString(int arrayEnteros[]) {
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		return cadenaImprimir;
	}
	
	/*
	HECHO EN CLASE:
	public static int[] ordenarArrayEnteros(int arrayEnteros[]) {
		int arrayOrdenado[]=new int[arrayEnteros.length];
		return arrayOrdenado;
	}
	
	public static boolean estaOrdenadoAscendentemente(int array[]) {
		//Arrays.sort(array); Esto lo ordenaría directamente.
		boolean estaOrdenado = true;
		for(int i = 0; i<array.length-1; i++) {
			imprimirTraza("Comparando array["+ i + "] con array[" + (i + 1) + "]");
			if(esMayor(array[i], array[i+1])) {
				imprimirTraza(array[i] + " es mayor que " + array[i+1]);
				estaOrdenado = false;
				break;
			}
			if(estaOrdenado == false) {
				int aux = array[i+1];
				array[i+1] = array[i];
				array[i] = aux;
			}
		}
		return estaOrdenado;
	}
	*/
	
	public static int[] ordenarArrayBurbuja(int[] array) {
	    boolean intercambiado; //Variable de comprobacion para seguir el bucle.
	    // Bucle del proceso
	    do {
	        intercambiado = false;
	        // Recorremos el array
	        for (int i = 0; i < array.length - 1; i++) {
	            // Si el número actual es mayor que el siguiente, los intercambiamos
	            if (array[i] > array[i + 1]) {
	                //Ponemos el aux para hacer "swap"
	                int aux = array[i];     // Guardamos el grande en aux
	                array[i] = array[i+1];  // Movemos el pequeño a la izquierda
	                array[i+1] = aux;       // Ponemos el aux (grande) a la derecha	                
	                
	                intercambiado = true;  
	            }
	        }
	    } while (intercambiado == false);

	    return array;
	}

	public static boolean estaOrdenadoDescendentemente(int array[]) {
		boolean estaOrdenado = true;
		for(int i = 0; i<array.length-1; i++) {
			imprimirTraza("Comparando array["+ i + "] con array[" + (i + 1) + "]");
			if(esMenor(array[i], array[i+1])) {
				imprimirTraza(array[i] + " es menor que " + array[i+1]);
				estaOrdenado = false;
				break;
			}
		}
		return estaOrdenado;
	}
	
	//MI INTENTO DE INSERTAR UN NUMERO Y QUE SE ORDENE:
	public static int[] insertarNumeroArray(int insertado, int[] array) { 
		boolean intercambiado = false;
		int[] arrayFinal = array; 
		int x = 0;
		int y = 0;
		x =  array.length;
		y = array.length + 1;
		//arrayFinal.length = y;
		Ejemplos.ordenarArrayBurbuja(array);
		do {
			for(int i = 0; i < array.length - 1; i++) {
				if ( insertado < array[i]) {
					int aux = array[i];
					array [i] = insertado;
					array [i+1] = aux;
					
					intercambiado = true;
				} else {
					intercambiado = false;
				}
			}
			
		} while (/*arrayFinal == array  ||*/ intercambiado = false);
		
		return arrayFinal;		
	}
	
	/*
	 * Por hacer:
	Devolver la suma de todos los elementos de un array.
	Devolver la media aritmética de todos los elementos de un array.
	Devolver la moda (el valor más repetido) de todos los elementos de un array.
	Invertir un array (1,2,3 pasa a ser 3,2,1).
	Devolver la varianza de los elementos de un array.
	Eliminar todos los elementos repetidos de un array (1,2,2,3,4,4 pasa a ser 1,2,3,4.
	Eliminar el elemento "i" de un array y "comprimirlo". Si al array 1,4,5,7 le quitamos el elemento 2, nos devolvería un array de 3 posiciones con el contenido 1,4,7.
	El array "nombres" contiene una serie de nombres, y el array "edades", las edades correspondientes a esos nombres. Ordenar los dos arrays en función de la edad.
	 */
	public static int sumarElementos(int[] array) { //Devolver la suma de todos los elementos de un array.
		int x = 0;
		for (int i = 0; i < array.length; i++) {
		x = array[i] + array[i+1];	
		}
		return x; 
	}
	
	public static int mediaAritmetica(int[] array) { //Devolver la media aritmética de todos los elementos de un array.
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			x = array[i] + array[i + 1];
		}
		int y = x / array.length;
		return y;
		//return sumarElementos(array)/array.lenght.
	}
	
	public static int valorModa(int[] array) {
		int valorActual = 0;
		int numeroRepeticionesActual = 0;
		int numeroRepeticionesModa = 0;
		int valorModa = 0;
		for (int i = 0; i < array.length; i++) {
			valorActual = array[i];
			for (int j = 0; j < array.length; j++) {
				numeroRepeticionesActual++;
			}
			if(numeroRepeticionesActual < numeroRepeticionesModa) {
				numeroRepeticionesModa = numeroRepeticionesActual;
				valorModa = valorActual;
			}
		}
		return valorModa;
			/*Intento fallido:
			 * int x = array[i];
			 * 
			if (x == array[i + 1]) {	
			}
		}
		int x = 0;
		return x;*/
	}
	
	public static int[] invertirArray(int[] array) { //Invertir un array (1,2,3 pasa a ser 3,2,1).
		int[] original = array;
        int[] invertido = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            // Asignamos desde el final del original al principio del nuevo
            invertido[i] = original[original.length - 1 - i];
        } return invertido;
    }
	
	public static String[] voltearArray(String[] array) {		  
		        // Recorremos el array
		        for (int i = 0; i < array.length / 2; i++) {
		        	String aux = array[i];
		        	array[i] = array[array.length - 1 - i];
		        	array[array.length - 1 - i] = aux;			                             		             
		        }
		        return array;		        
		    }
	
	public static void devolverCambio(double precio, double importePagado) { //Imprecisión del double
		int BilleteQuinientos = 0;
		int BilleteDoscientos = 0;
		int BilleteCien = 0;
		int BilleteCincuenta = 0;
		int BilleteVeinte = 0;
		int BilleteDiez = 0;
		int BilleteCinco = 0;
		int MonedaDos = 0;
		int MonedaUno = 0;
		int MonedaCincuentaCentimos = 0;
		int MonedaVeinteCentimos = 0;
		int MonedaDiezCentimos = 0;
		int MonedaCincoCentimos = 0;
		int MonedaDosCentimos = 0;
		int MonedaUnCentimo = 0;
		double valorIntermedio = importePagado - precio;
		
		while(valorIntermedio > 0) {
			if(valorIntermedio >= 500) {
				valorIntermedio = valorIntermedio - 500;
				BilleteQuinientos++;
			} else if(valorIntermedio >= 200) {
				valorIntermedio = valorIntermedio - 200;
				BilleteDoscientos ++;
			} else if(valorIntermedio >= 100) {
				valorIntermedio = valorIntermedio - 100;
				BilleteCien++;
			} else if(valorIntermedio >= 50) {
				valorIntermedio = valorIntermedio - 50;
				BilleteCincuenta++;
			} else if(valorIntermedio >= 20) {
				valorIntermedio = valorIntermedio - 20;
				BilleteVeinte++;
			} else if(valorIntermedio >= 10) {
				valorIntermedio = valorIntermedio - 10;
				BilleteDiez++;
			} else if(valorIntermedio >= 5) {
				valorIntermedio = valorIntermedio - 5;
				BilleteCinco++;
			} else if(valorIntermedio >= 2) {
				valorIntermedio = valorIntermedio - 2;
				MonedaDos++;
			} else if(valorIntermedio >= 1) {
				valorIntermedio = valorIntermedio - 1;
				MonedaUno++;
			} else if(valorIntermedio >= 0.5) {
				valorIntermedio = valorIntermedio - 0.5;
				MonedaCincuentaCentimos++;
			} else if(valorIntermedio >= 0.2) {
				valorIntermedio = valorIntermedio - 0.2;
				MonedaVeinteCentimos++;
			} else if(valorIntermedio >= 0.1) {
				valorIntermedio = valorIntermedio - 0.1;
				MonedaDiezCentimos++;
			} else if(valorIntermedio >= 0.05) {
				valorIntermedio = valorIntermedio - 0.05;
				MonedaCincoCentimos++;
			} else if(valorIntermedio >= 0.02) {
				valorIntermedio = valorIntermedio - 0.02;
				MonedaDosCentimos++;
			} else if(valorIntermedio >= 0.01) {
				valorIntermedio = valorIntermedio - 0.01;
				MonedaUnCentimo++; 
			}else {
				System.out.println("El resultado es " + valorIntermedio);
				System.out.println("El cambio es de " + BilleteQuinientos + " Billetes de 500€.");
				System.out.println("El cambio es de " + BilleteDoscientos + " Billetes de 200€.");
				System.out.println("El cambio es de " + BilleteCien + " Billetes de 100€.");
				System.out.println("El cambio es de " + BilleteCincuenta + " Billetes de 50€.");
				System.out.println("El cambio es de " + BilleteVeinte + " Billetes de 20€.");
				System.out.println("El cambio es de " + BilleteDiez + " Billetes de 10€.");
				System.out.println("El cambio es de " + BilleteCinco + " Billetes de 5€.");
				System.out.println("El cambio es de " + MonedaDos + " Monedas de 2€.");
				System.out.println("El cambio es de " + MonedaUno + " Monedas de 1€.");
				System.out.println("El cambio es de " + MonedaCincuentaCentimos + " Monedas de 0.50€.");
				System.out.println("El cambio es de " + MonedaVeinteCentimos + " Monedas de 0.20€.");
				System.out.println("El cambio es de " + MonedaDiezCentimos + " Monedas de 0.10€.");
				System.out.println("El cambio es de " + MonedaCincoCentimos + " Monedas de 0.05€.");
				System.out.println("El cambio es de " + MonedaDosCentimos + " Monedas de 0.02€.");
				System.out.println("El cambio es de " + MonedaUnCentimo + " Monedas de 0.01€.");
				break;
			}
		}
	}
	
	public static void devolverCambioArray(double precio, double importePagado) {
	    // 1. Convertimos todo a céntimos (int) para evitar la imprecisión del double. 
	    int cambioEnCentimos = (int) Math.round((importePagado - precio) * 100);

	    // 2. Definimos los arrays
	    // Valores en céntimos: 500€ = 50000 céntimos
	    int[] valores = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
	    
	    // Nombres para mostrar por pantalla
	    String[] nombres = {
	        "Billetes de 500€", "Billetes de 200€", "Billetes de 100€", "Billetes de 50€",
	        "Billetes de 20€", "Billetes de 10€", "Billetes de 5€", "Monedas de 2€",
	        "Monedas de 1€", "Monedas de 0.50€", "Monedas de 0.20€", "Monedas de 0.10€",
	        "Monedas de 0.05€", "Monedas de 0.02€", "Monedas de 0.01€"
	    };

	    // 3. Imprimimos el cambio total inicial
	    System.out.println("El cambio total a devolver es: " + (cambioEnCentimos / 100.0) + "€");

	    // 4. El bucle:
	    for (int i = 0; i < valores.length; i++) {
	        if (cambioEnCentimos >= valores[i]) { // Si el cambio restante es mayor o igual al billete/moneda actual
	            int cantidad = cambioEnCentimos / valores[i]; // Calculamos cuántos billetes/monedas de este tipo necesitamos
	            cambioEnCentimos = cambioEnCentimos % valores[i]; // Restamos eso del cambio pendiente (usamos módulo para el resto)

	            if (cantidad > 0) { // Solo imprimimos si hay cantidad para devolver (si no ha pagado justo)
	                System.out.println("El cambio es de " + cantidad + " " + nombres[i] + ".");
	            }
	        }
	    }
	}

	public static int[] eliminarDuplicados(int[] arrayOriginal) {
	        // 1. Si el array está vacío o tiene 1 elemento, se devuelve tal cual
	        if (arrayOriginal.length < 2) {
	            return arrayOriginal;
	        }

	        // 2. Necesitamos un array temporal porque no sabemos el tamaño final todavía
	        int[] temporal = new int[arrayOriginal.length];
	        int j = 0; // Este índice controlará la posición en el nuevo array

	        // 3. Recorremos el array original
	        for (int i = 0; i < arrayOriginal.length - 1; i++) {	            
	            if (arrayOriginal[i] != arrayOriginal[i + 1]) { // Comparamos el actual con el siguiente
	                temporal[j] = arrayOriginal[i]; // Guardamos el número
	                j++; // Avanzamos el índice del nuevo array
	            }
	        }

	        // 4. El bucle anterior siempre se deja el último elemento sin guardar, lo añadimos manual
	        temporal[j] = arrayOriginal[arrayOriginal.length - 1];
	        j++; // Ahora 'j' es igual al número total de elementos únicos

	        // 5. "Recortamos" el array para quitar los ceros sobrantes del final
	        // Usamos Arrays.copyOf para crear el array final del tamaño exacto 'j'
	        return Arrays.copyOf(temporal, j);
	        
	}
	
	public static boolean estaComprimido(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] == null && array[i + 1] != null) {
					return false;
			}
		}
		return true;
	}
	
	public static String[] comprimirArray(String[] array) {
		while (!estaComprimido(array)) {
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] == null) {
					array[i] = array[i + 1];
					array[i + 1] = null;
				}
			}
		}
		return array; 
	}
	
	/* Varianza de {7 3 5 8 2} (7-5)^2 + (3-5)^2 + (5-5)^2 + (8-5)^2 (2-5)^2 /Todo DIVIDIDO entre 5
	 * 
	 */
	
	public static double varianza (double[] array) { //Referimos al de media.
		imprimirTraza("Calculando la media");
		double media = media(array);
		double varianza = 0;
		double auxiliar = 0;
		for(int i = 0; i < array.length; i++) {
			auxiliar +=  Math.pow((array[i] - media),2.0);
		}
		varianza = auxiliar/media;
		imprimirTraza("Varianza= " + varianza);
		return varianza;
	}
	public static double media(double[] array) {
		double media = 0;
		for(int i = 0; i < array.length; i++) {
			media+=array[i]; // media = media + enteros[i];
		}
		media = media/array.length;
		
		return media;
	}
	
	public static void eliminarString(String[]array, int indice) {
		/*if(indice < array.length) {
			System.out.println("ERROR");
		}*/
	}
}
