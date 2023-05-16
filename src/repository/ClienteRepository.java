package repository;

import java.util.List;

import model.Cliente;

public interface ClienteRepository {

	List<Cliente> obtenerTodo();
	Cliente obtenerPorId(int id);
	void guardar(Cliente cliente);
	void eliminar(Cliente cliente);
}
