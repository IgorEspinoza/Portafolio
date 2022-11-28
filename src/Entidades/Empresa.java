/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author igore
 */
public class Empresa {
    int Id_Empresa;
    String Rut_Empresa;
    String Nombre_Empresa;
    String Rubro_Empresa;
    String Correo_Empresa;
    String Direccion_Empresa;
    String Telefono_Empresa;
    int Id_Rol;
    int Id_Estado;
    int Id_Profesional;
    int Id_Representante;

    public Empresa(){
    
    }

    public int getId_Representante() {
        return Id_Representante;
    }

    public void setId_Representante(int Id_Representante) {
        this.Id_Representante = Id_Representante;
    }
    public Empresa(int Id_Empresa, String Nombre_Empresa, int Id_Representante) {
        this.Id_Empresa = Id_Empresa;
        this.Nombre_Empresa = Nombre_Empresa;
        this.Id_Representante = Id_Representante;
    }
    
    public String toString(){
        return Nombre_Empresa;
    }
    
    public int getId_empresa() {
        return Id_Empresa;
    }

    public void setId_Empresa(int Id_Empresa) {
        this.Id_Empresa = Id_Empresa;
    }

    public int getId_Rol() {
        return Id_Rol;
    }

    public void setId_Rol(int Id_Rol) {
        this.Id_Rol = Id_Rol;
    }

    public int getId_Estado() {
        return Id_Estado;
    }

    public void setId_Estado(int Id_Estado) {
        this.Id_Estado = Id_Estado;
    }

    public int getId_Profesional() {
        return Id_Profesional;
    }

    public void setId_Profesional(int Id_Profesional) {
        this.Id_Profesional = Id_Profesional;
    }

    public String getRut_Empresa() {
        return Rut_Empresa;
    }

    public void setRut_Empresa(String Rut_Empresa) {
        this.Rut_Empresa = Rut_Empresa;
    }

    public String getNombre_Empresa() {
        return Nombre_Empresa;
    }

    public void setNombre_Empresa(String Nombre_Empresa) {
        this.Nombre_Empresa = Nombre_Empresa;
    }

    public String getRubro_Empresa() {
        return Rubro_Empresa;
    }

    public void setRubro_Empresa(String Rubro_Empresa) {
        this.Rubro_Empresa = Rubro_Empresa;
    }

    public String getCorreo_Empresa() {
        return Correo_Empresa;
    }

    public void setCorreo_Empresa(String Correo_Empresa) {
        this.Correo_Empresa = Correo_Empresa;
    }

    public String getDireccion_Empresa() {
        return Direccion_Empresa;
    }

    public void setDireccion_Empresa(String Direccion_Empresa) {
        this.Direccion_Empresa = Direccion_Empresa;
    }

    public String getTelefono_Empresa() {
        return Telefono_Empresa;
    }

    public void setTelefono_Empresa(String Telefono_Empresa) {
        this.Telefono_Empresa = Telefono_Empresa;
    }
    
    
}
