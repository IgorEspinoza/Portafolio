/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import oracle.sql.DATE;

/**
 *
 * @author igore
 */
public class Contrato {
    
    int ID_Contrato;
    String Contrato;
    DATE Fecha_Contrato;

    public Contrato(int ID_Contrato, String Contrato, DATE Fecha_Contrato) {
        this.ID_Contrato = ID_Contrato;
        this.Contrato = Contrato;
        this.Fecha_Contrato = Fecha_Contrato;
    }

    public int getID_Contrato() {
        return ID_Contrato;
    }

    public void setID_Contrato(int ID_Contrato) {
        this.ID_Contrato = ID_Contrato;
    }

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String Contrato) {
        this.Contrato = Contrato;
    }

    public DATE getFecha_Contrato() {
        return Fecha_Contrato;
    }

    public void setFecha_Contrato(DATE Fecha_Contrato) {
        this.Fecha_Contrato = Fecha_Contrato;
    }
    
    
}
