package service;

import java.util.List;

import model.Producto;

import java.util.ArrayList;

public class ServiceImp implements Service{

	@Override
	public boolean verificarCliente(String tipo) {
		
		 if (tipo.equals("cliente")) {
	            return true;
	        } else {
	            return false;
	        }
	}

	@Override
	public List<Producto> obtenerProductosDisponibles() {
		List<Producto> productos = new ArrayList<>();
		return productos;
	}

}
