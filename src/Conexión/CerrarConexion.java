/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author igore
 */
public class CerrarConexion {

    private CerrarConexion() {
        throw new RuntimeException();
    }

    public static void CerrarSession() throws SQLException {
        Connection cn = Conexión.getConnection();

        // Pide confirmación para salir del programa
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0) {
            // Cierra la conexion con la base de datos, si está activa
            try {
                if(cn != null) {
                    cn.close();
                    System.out.println("desconectado");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "No se ha podido desconectar","Desconexión",JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}
