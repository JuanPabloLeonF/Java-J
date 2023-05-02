package Metodos;
import Humano.ClaseHumano;

public class ControllerHumano {

	ClaseHumano humano1 = new ClaseHumano();
	
	//CONSTRUCTORES:
		public ControllerHumano() {
		}
	
		public ControllerHumano(String nombre,String colorPiel, int edad, int cedula) {
			this.humano1.setNombre(nombre);
			this.humano1.setColorPiel(colorPiel);
			this.humano1.setEdad(edad);
			this.humano1.setCedula(cedula);
		}
	//METODOS PARA LA CLASE HUMANO:
	public String correr() {
		return "La persona " + this.humano1.getNombre()  + " esta corriendo....";
	}
	
	public String saltar() {
		return "La persona " + this.humano1.getNombre()  + " esta saltando....";
	}
	
	public String toString() {
		return this.humano1.toString();
	}
}
