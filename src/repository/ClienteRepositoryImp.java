package repository;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteRepositoryImp implements ClienteRepository{

	private List<Cliente> clientes;
	
	public ClienteRepositoryImp() {
		clientes = new ArrayList<>();
	}
	
	@Override
	public List<Cliente> obtenerTodo() {
		return clientes;
	}

	@Override
	public Cliente obtenerPorId(int id) {
		
		 for (Cliente cliente : clientes) {
	            if (cliente.getId() == id) {
	                return cliente;
	            }
	        }
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		clientes.add(cliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		clientes.remove(cliente);
	}

	
}
