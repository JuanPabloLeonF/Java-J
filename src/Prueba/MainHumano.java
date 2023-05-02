package Prueba;

import Metodos.ControllerHumano;
public class MainHumano {

	public static void main(String[] args) {
		
		ControllerHumano humanoUno1 = new ControllerHumano("Juan","Moreno",18,44663);
		
		System.out.println(humanoUno1.correr());
		
		System.out.println(humanoUno1.toString());
	}
}
