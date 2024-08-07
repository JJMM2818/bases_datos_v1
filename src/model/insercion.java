
package model;

import java.sql.*;

public class insercion {
    private final String tabla = "pregrado";
    
    public void guardar(Connection conexion, String Nombre, String Creditos, String Grupo){
        try{
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO "+ this.tabla + "(Nombre, Creditos, Grupo) VALUES(?, ?, ?)");
            
            consulta.setString(1, Nombre);
            consulta.setString(2, Creditos);
            consulta.setString(3, Grupo);
            
            consulta.executeUpdate();
            System.out.println("Se efectuo la operacion de escritura");
        }catch(SQLException e){
            System.out.println("Error " + e);
        }
    
}
    
}
