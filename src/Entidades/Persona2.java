/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Persona2 {
    int Id_persona;
    String Rut;
    String Nombre;
    String A_Paterno;
    String A_Materno;
    String Direccion;
    String Correo;
    int Telefono;
    int Id_rol;
    int Id_estado;

    public Persona2(){}
    
    public Persona2(int Id_persona, String Nombre, String Rut){
        this.Id_persona = Id_persona;
        this.Nombre = Nombre;        
        this.Rut = Rut;        
    }

    public String toString(){
        return Nombre + Rut;
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

    public int getId_rol() {
        return Id_rol;
    }

    public void setId_rol(int Id_rol) {
        this.Id_rol = Id_rol;
    }

    public int getId_estado() {
        return Id_estado;
    }

    public void setId_estado(int Id_estado) {
        this.Id_estado = Id_estado;
    }
    
    public int getId_persona() {
        return Id_persona;
    }

    public void setId_persona(int Id_persona) {
        this.Id_persona = Id_persona;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
