package Humano;

public class ClaseHumano {
	
	//Atributos:
	private String nombre;
	private String colorPiel;
	private int edad;
	private int cedula;
	
	//CONSTRUCTORES:
	public ClaseHumano() {
	}
	
	public ClaseHumano(String nombre,String colorPiel,int edad,int cedula) {
		this.nombre = nombre;
		this.colorPiel = colorPiel;
		this.edad = edad;
		this.cedula = cedula;
	}
	
	//Metodos GET Y SET NOMBRE:
	public String getNombre() {
		return this.nombre;
	}
	
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	
	//METODOS GET Y SET COLORPIEL:
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public String setColorPiel(String colorPiel) {
		return this.colorPiel = colorPiel;
	}
	
	//METODOS GET Y SET EDAD:
	public int getEdad() {
		return this.edad;
	}
	
	public int setEdad(int edad) {
		return this.edad = edad;
	}
	
	//METODO GET Y SET CEDULA:
	public int getCedula() {
		return this.cedula;
	}
	
	public int setCedula(int cedula) {
		return this.cedula = cedula;
	}
	
	//METODO toString:
	@Override
	public String toString() {
		return "La persona: " + this.nombre + " con color de piel: " + this.colorPiel + " de edad: " + this.edad + " y con identificacion: " + this.cedula;
	}
}
