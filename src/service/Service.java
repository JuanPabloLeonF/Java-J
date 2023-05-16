package service;

import java.util.List;

import model.Producto;

public interface Service {

	boolean verificarCliente(String tipo);
	List<Producto> obtenerProductosDisponibles();
}
