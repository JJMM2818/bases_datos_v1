
package controller;

import java.sql.*;

public class Mysql {
    
    private static Connection con;

    public static Connection getCon() {
        return con;
    }
    
    
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3307/prueba";
    
    public void conectar(){
        con = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if(con != null){
                System.out.println("Conexion exitosa");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error de conexion "+e);
        }
    }
    
}
