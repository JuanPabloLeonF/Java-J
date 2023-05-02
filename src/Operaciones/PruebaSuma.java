package Operaciones;

public class PruebaSuma {
	
	public static void main(String args[]){
		
		int resultado;
		
		//CON PARAMETROS EN LOS METODOS:
		Operaciones operaciones = new Operaciones();
		
		resultado = operaciones.sumando(5,7);
		System.out.println("suma = " + resultado);
		
		resultado = operaciones.resta(5,7);
		System.out.println("resta = " + resultado);
		
		resultado = operaciones.division(5,7);
		System.out.println("division = " + resultado);
		
		resultado = operaciones.multiplicacion(5,7);
		System.out.println("multiplicacion = " + resultado);
		
		System.out.println("\nRESULADOS DEL OBEJTO CON PARAMETRO:");
		// CON PARAMETROS EN EL OBJETO:
		Operaciones operacionesConParametro = new Operaciones(9, 2);
		
		resultado = operacionesConParametro.sumar();
		System.out.println("suma = " + resultado);
		
		resultado = operacionesConParametro.restando();
		System.out.println("resta = " + resultado);
		
		resultado = operacionesConParametro.dividiendo();
		System.out.println("division = " + resultado);
		
		resultado = operacionesConParametro.multiplicando();
		System.out.println("multiplicando = " + resultado);
	}

}
