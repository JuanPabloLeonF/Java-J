package model;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String correo;
	private String identificacion;
	private int id;
	
	public Cliente(String nombre, String apellidos, String correo, String identificacion,int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.identificacion = identificacion;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre.length() <= 13) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe tener máximo 13 caracteres.");
        }
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		if (apellidos.length() <= 13) {
            this.apellidos = apellidos;
        } else {
            throw new IllegalArgumentException("El apellido debe tener máximo 13 caracteres.");
        }
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		if (correo.length() <= 30) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("El correo debe tener máximo 30 caracteres.");
        }
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion) {
		
		  if (identificacion.length() <= 10) {
	            this.identificacion = identificacion;
	        } else {
	            throw new IllegalArgumentException("La identificacion debe tener máximo 10 dígitos.");
	        }
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", identificacion="
				+ identificacion + ", id=" + id + "]";
	}
	
	
	
	
	
}
