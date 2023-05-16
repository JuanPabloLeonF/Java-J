package model;

public class Producto {

	private String nombre;
	private int codigo;
	private String tipoProducto;
	
	public Producto(String nombre, int codigo, String tipoProducto) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.length() <= 20) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe tener máximo 20 caracteres.");
        }
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		if (tipoProducto.length() <= 20) {
            this.tipoProducto = tipoProducto;
        } else {
            throw new IllegalArgumentException("El tipo de producto debe tener máximo 20 caracteres.");
        }
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", tipoProducto=");
		builder.append(tipoProducto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
