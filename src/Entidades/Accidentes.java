/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Accidentes {
    
    int ID_Reporte;
    String Reporte_Accidentes;

    public Accidentes(int ID_Reporte, String Reporte_Accidentes) {
        this.ID_Reporte = ID_Reporte;
        this.Reporte_Accidentes = Reporte_Accidentes;
    }

    public int getID_Reporte() {
        return ID_Reporte;
    }

    public void setID_Reporte(int ID_Reporte) {
        this.ID_Reporte = ID_Reporte;
    }

    public String getReporte_Accidentes() {
        return Reporte_Accidentes;
    }

    public void setReporte_Accidentes(String Reporte_Accidentes) {
        this.Reporte_Accidentes = Reporte_Accidentes;
    }
    
    
}
