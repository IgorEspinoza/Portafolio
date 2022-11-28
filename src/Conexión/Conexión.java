/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {

    private static Connection cn = null;
    private static String myDB = "jdbc:oracle:thin:@localhost:1521:XE";
    private static String Usuario = "IGOR2";
    private static String Password = "123";

    public static Connection getConnection() throws SQLException {
        try {
            //DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            Class.forName("oracle.jdbc.OracleDriver");

            cn = DriverManager.getConnection(myDB, Usuario, Password);
            
            if(cn!= null){
                System.out.println("Conectado");
            }else{
                System.out.println("Error en la conexion");
            }
            
        } catch (ClassNotFoundException ex) {

            throw new SQLException(ex.getMessage());
        }
        return cn;
    }
    
    
}
