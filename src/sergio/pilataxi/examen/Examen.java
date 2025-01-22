package sergio.pilataxi.examen;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = UtilidadesExamen.crearArray();
		
		UtilidadesExamen.mostrarArray(array);
		
		double promedio = UtilidadesExamen.calcularPromedio(array);
        System.out.println("Promedio: " + promedio);

        int[] extremos = UtilidadesExamen.encontrarExtremos(array);
        System.out.println("Mínimo: " + extremos[0] + ", Máximo: " + extremos[1]);
        
        int[] mayoresQuePromedio = UtilidadesExamen.filtrarMayoresQuePromedio(array, promedio);
        System.out.print("Mayores que el promedio: ");
        for (int num : mayoresQuePromedio) {
            System.out.print(num + " ");
        }
        System.out.println();
	}

}
