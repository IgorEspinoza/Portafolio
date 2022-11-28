/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Estado {
    
    int ID_Estado;
    String Estado;

    public Estado(int ID_Estado, String Estado) {
        this.ID_Estado = ID_Estado;
        this.Estado = Estado;
    }

    public int getID_Estado() {
        return ID_Estado;
    }

    public void setID_Estado(int ID_Estado) {
        this.ID_Estado = ID_Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
