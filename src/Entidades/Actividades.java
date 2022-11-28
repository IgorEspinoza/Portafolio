/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Actividades {
    
    int ID_Actividad;
    String ActividadM;

    public Actividades(int ID_Actividad, String ActividadM) {
        this.ID_Actividad = ID_Actividad;
        this.ActividadM = ActividadM;
    }

    public int getID_Actividad() {
        return ID_Actividad;
    }

    public void setID_Actividad(int ID_Actividad) {
        this.ID_Actividad = ID_Actividad;
    }

    public String getActividadM() {
        return ActividadM;
    }

    public void setActividadM(String ActividadM) {
        this.ActividadM = ActividadM;
    }
    
    
}
