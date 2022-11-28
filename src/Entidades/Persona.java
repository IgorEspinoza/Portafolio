/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Persona {
    
    int Id_persona;
    String rut;
    String Nombre;
    String A_Paterno;
    String A_Materno;
    String Direccion;
    String Correo;
    int Telefono;
    int Id_rol;
    int Id_estado;
    
    public Persona(){}
    
    public Persona(int Id_persona, String Nombre){
        this.Id_persona = Id_persona;
        this.Nombre = Nombre;
    }
    public int getId_persona() {
        return Id_persona;
    }
    public String toString(){
        return Nombre;
    }
   

    public void setId_persona(int id_persona) {
        this.Id_persona = id_persona;
    }

    public int getId_rol() {
        return Id_rol;
    }

    public void setId_rol(int id_rol) {
        this.Id_rol = id_rol;
    }

    public int getId_estado() {
        return Id_estado;
    }

    public void setId_estado(int Id_estado) {
        this.Id_estado = Id_estado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getA_Paterno() {
        return A_Paterno;
    }

    public void setA_Paterno(String A_Paterno) {
        this.A_Paterno = A_Paterno;
    }

    public String getA_Materno() {
        return A_Materno;
    }

    public void setA_Materno(String A_Materno) {
        this.A_Materno = A_Materno;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
        
    
}
