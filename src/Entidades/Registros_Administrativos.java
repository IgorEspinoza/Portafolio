/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Registros_Administrativos {
    
    int ID_Registro;
    String reporte_Administrativo;
    String Estadisticas;

    public Registros_Administrativos(int ID_Registro, String reporte_Administrativo, String Estadisticas) {
        this.ID_Registro = ID_Registro;
        this.reporte_Administrativo = reporte_Administrativo;
        this.Estadisticas = Estadisticas;
    }

    public int getID_Registro() {
        return ID_Registro;
    }

    public void setID_Registro(int ID_Registro) {
        this.ID_Registro = ID_Registro;
    }

    public String getReporte_Administrativo() {
        return reporte_Administrativo;
    }

    public void setReporte_Administrativo(String reporte_Administrativo) {
        this.reporte_Administrativo = reporte_Administrativo;
    }

    public String getEstadisticas() {
        return Estadisticas;
    }

    public void setEstadisticas(String Estadisticas) {
        this.Estadisticas = Estadisticas;
    }
    
    
    
}
