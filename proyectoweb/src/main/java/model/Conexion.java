package model;
// creacion clase conexion

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/Bolsillos"; 
    private static final String user="root";
    private static final String password="";
    private static Connection con; //guarda el estado de la conexion


//metodo de conexion
public static Connection conectar(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,user,password);
        System.out.println("Conexion Exitosa");
        
    }catch(Exception e) {
        System.out.println("Error de conexion a la base de datos  "+e.getMessage().toString());
    }
    return con;
}

public static void main(String[] args){
    Conexion.conectar();
}
}


