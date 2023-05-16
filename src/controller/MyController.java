package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import config.DatabaseConfig;

public class MyController {

	public void miMetodo() {
        try {
            Connection connection = DatabaseConfig.getConnection();
            // Ejemplo: Obtener todos los usuarios desde la base de datos
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            Connection connection2 = DatabaseConfig.getConnection();
            String sql2 = "SELECT * FROM productos"; 
            PreparedStatement statement2 = connection2.prepareStatement(sql2);
            ResultSet resultSet2 = statement2.executeQuery();

            while (resultSet.next()&& resultSet2.next()) {
                // Leer los datos del resultado de la tabla cliente
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String correo = resultSet.getString("correo");
                String identificacion = resultSet.getString("identificacion");
                
                // Leer los datos del resultado2 de la tabla productos
                String nombreProductos = resultSet2.getString("nombre");
                String tipoProducto = resultSet2.getString("tipoProducto");
                int codigo = resultSet2.getInt("codigo");
                int idCliente = resultSet2.getInt("id_cliente");
       
             // Hacer algo con los datos obtenidos, como imprimirlos
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + apellidos);
                System.out.println("Correo: " + correo);
                System.out.println("Identificacion: " + identificacion);
                System.out.println("-----------------------");
                System.out.println("Codigo producto: "+ codigo);
                System.out.println("Nombre producto: "+ nombreProductos);
                System.out.println("Tipo producto: "+ tipoProducto);
                System.out.println("ID producto del cliente: "+ idCliente);
                System.out.println("-----------------------");
            }

            resultSet.close();
            statement.close();
            connection.close(); // Cerrar la conexión cuando hayas terminado
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
