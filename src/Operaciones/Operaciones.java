package Operaciones;

public class Operaciones {
	
	int a;
	int b;
	
	//CONTRUCTOR VACIO Y SUS METODOS CON PARAMETROS:
	public Operaciones() {
	}
	
	public int sumando(int a, int b) {
		return ( a + b);
	}
	
	public int resta(int a,int b) {
		return ( a - b);
	}
	
	public int division(int a,int b) {
		return ( a - b);
	}
	
	public int multiplicacion(int a, int b) {
		return ( a * b);
	}
	
	//CONSTRUCTOR CON PARAMETROS Y SUS METODOS SIN PARAMETROS
	public Operaciones(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sumar() {
		return ( this.a + this.b);
	}
	
	public int restando() {
		return ( this.a - this.b);
	}
	
	public int dividiendo() {
		return ( this.a - this.b);
	}
	
	public int multiplicando() {
		return ( this.a * this.b);
	}
	
}
