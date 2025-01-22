package sergio.pilataxi.examen;

import java.util.Scanner;

public class UtilidadesExamen {
	
	/*
	 * EN UNA CLASE llamada UtilidadesExamen
2.	Parte 1: Crear un array y llenarlo con números del usuario (1 punto)
	Escribe una función crearArray que:
	o	Pida al usuario el tamaño del array (entre 1 y 100).
	o	Llene el array con números introducidos por el usuario.
	o	Devuelva el array.
*/
	
	    public static int[] crearArray() {
	    	
	        Scanner scan = new Scanner(System.in);
	        int tamano = 0;
	        
	     
	        do {
	            System.out.println("Introduce el tamaño del array entre 1 y 100 : ");
	            
	            tamano = scan.nextInt();
	        } while (tamano < 1 || tamano > 100);

	        int[] tamanoArray = new int[tamano];

	   
	        for (int i = 0; i < tamano; i++) {
	            System.out.println("Introduce el número para la posición " + (i + 1) + ": ");
	            tamanoArray[i] = scan.nextInt();
	        }

	        return tamanoArray;
	    }
	

	    public static void main(String[] args) {

			mostrarArray(crearArray());
			
		}
	    
	    /*
	     * 3.Parte 2: Mostrar el array (1 punto)
			Escribe una función mostrarArray que reciba un array lo recorra y lo imprima.
*/
	    public static void mostrarArray(int[] array) {
	        System.out.println("Datos del array: ");
	        for (int numero : array) {
	            System.out.print(numero + " ");
	        }
	        System.out.println();
	    }
	    
/*
 * 4.	Parte 3: Calcular el promedio de los números (1 punto)
Escribe una función calcularPromedio que:
o	Reciba un array.
o	Calcule y devuelva el promedio de los números.
*/
	    
	    public static double calcularPromedio(int[] array) {
	        int suma = 0;
	        for(int i=0;i<array.length;i++){
	            suma += array[i];

	            
	        }
	        double promedio = suma/array.length;
	        System.out.println(promedio);
	        return promedio;
	    }
	    
	    
/*
 * 5.	Parte 4: Encontrar el número máximo y mínimo (1 punto)
Escribe una función encontrarExtremos que:
o	Reciba un array.
o	Encuentre y devuelva el valor máximo y el mínimo.
*/	    
	    public static int[] encontrarExtremos(int[] array) {
	        int maximo = array[0];
	        int minimo = array[0];
	    
	        for (int num : array) {
	            if (num > maximo){
	                maximo = num;
	            } 
	            if (num < minimo){
	                minimo = num;
	            } 
	        }

	        return new int[]{minimo, maximo};
	    }
	    
	    /*6.	Parte 5: Filtrar números mayores que el promedio (1 punto)
	    Escribe una función filtrarMayoresQuePromedio que:
	    o	Reciba un array y el promedio calculado.
	    o	Devuelva un nuevo array con los números mayores que el promedio.
	    */

	    
	    public static int[] filtrarMayoresQuePromedio(int[] array, double promedio) {

	    	int [] resultado = new int [3]; 
	        return resultado;
	    }

}

