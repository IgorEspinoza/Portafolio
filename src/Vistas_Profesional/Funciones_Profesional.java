/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas_Profesional;

import Conexión.Conexión;
import Entidades.Empresa;
import Entidades.Persona;
import Vistas.Profesionales;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author igore
 */
public class Funciones_Profesional {

    Profesionales pro = new Profesionales();

    public ArrayList<Empresa> getEmpresa() {
        //int id = pro.id;

        Statement st;
        ResultSet rs;
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();
        try {
            Connection cn = Conexión.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select e.id_empresa, e.nombre_empresa, id_representante from empresa e , persona p where e.id_profesional = p.id_persona order by id_empresa");

            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setId_Empresa(rs.getInt("Id_Empresa"));
                empresa.setNombre_Empresa(rs.getString("Nombre_Empresa"));
                empresa.setId_Representante(rs.getInt("Id_Representante"));
                listaEmpresa.add(empresa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Funciones_Profesional.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
        return listaEmpresa;
    }

    public ArrayList<Persona> getPersona() {

        ArrayList<Persona> listaPersona = new ArrayList<>();
        try {
            Connection cn = Conexión.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select id_persona, nombre from persona where id_rol = 1 OR id_rol = 2 order by id_persona");
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("Id_Persona"));
                persona.setNombre(rs.getString("Nombre"));
                listaPersona.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Funciones_Profesional.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
        return listaPersona;
    }

    public void GuardarCapacitacion(Capacitación ca) {

        int nom = ca.cbxProfesionales.getItemAt(ca.cbxProfesionales.getSelectedIndex()).getId_persona();
        int emp = ca.cbxEmpresas.getItemAt(ca.cbxEmpresas.getSelectedIndex()).getId_empresa();
        int rep = ca.cbxEmpresas.getItemAt(ca.cbxEmpresas.getSelectedIndex()).getId_Representante();
        String fecha = ca.jFecha.getText().trim();
        int asistentes = Integer.parseInt(ca.jAsistentes.getText().trim());
        String tema = ca.jTema.getText().trim();

        try {

            URL url = new URL("http://127.0.0.1:8000/profesional/capacitacion");
            Map<String, Object> params = new LinkedHashMap<>();

            params.put("ID_PERSONA_PROFESIONAL", nom);
            params.put("ID_EMPRESA", emp);
            params.put("ID_PERSONA_REPRESENTANTE", rep);
            params.put("FECHA_CAPACITACION", fecha);
            params.put("ASISTENTES", asistentes);
            params.put("TEMA", tema);

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

            }
            byte[] postByte = postData.toString().getBytes("UTF-8");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.addRequestProperty("Content-Length", String.valueOf(postByte.length));
            con.setDoOutput(true);
            con.getOutputStream().write(postByte);

            int response = con.getResponseCode();
            Map<String, String> map = new HashMap<>();

            map.put("201", "Registro Exitoso");
            map.put("default", "Error en el registro");

            if (response == 201) {
                JOptionPane.showMessageDialog(null, map.get("" + response));
            } else {
                JOptionPane.showMessageDialog(null, map.get("default"));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void listarCapacitaciones(Capacitación ca) {

        DefaultTableModel tabla = new DefaultTableModel();

        tabla.addColumn("FECHA CAPACITACION");
        tabla.addColumn("NOMBRE REPRESENTANTE");
        tabla.addColumn("NOMBRE EMPRESA");
        tabla.addColumn("CANTIDAD DE ASISTENTES");
        tabla.addColumn("TEMA");

        try {

            URL url = new URL("http://127.0.0.1:8000/profesional/listarC/?format=json");
            HttpURLConnection curl = (HttpURLConnection) url.openConnection();
            curl.setRequestMethod("GET");
            curl.connect();
            int response = curl.getResponseCode();

            if (response != 200) {

                throw new RuntimeException("Error:" + response);

            } else {
                StringBuilder information = new StringBuilder();
                Scanner s = new Scanner(url.openStream());
                String[] datos = new String[10];

                while (s.hasNext()) {

                    information.append(s.nextLine());

                }
                s.close();

                JSONArray json = new JSONArray(information.toString());
                try {
                    for (int i = 0; i < 10; i++) {

                        JSONObject object = json.getJSONObject(i);

                        datos[0] = object.getString("Fecha_Capacitacion");
                        datos[1] = object.getString("Nombre");
                        datos[2] = object.getString("Nombre_Empresa");
                        datos[3] = String.valueOf(object.getInt("Asistentes"));
                        datos[4] = object.getString("Tema");

                        tabla.addRow(datos);

                    }
                } catch (Exception e) {
                    System.out.println("" + e);
                }

            }
            System.out.println("cargado");
            ca.jTablaCap.setModel(tabla);

        } catch (Exception ex) {
            System.out.println("error");
            System.out.println(ex.toString());
        }

    }

    public void GuardarVisita(PlanificarVisitas v) {
              
        int nom = v.cbxProfesional.getItemAt(v.cbxProfesional.getSelectedIndex()).getId_persona();
        int emp = v.cbxEmpresa.getItemAt(v.cbxEmpresa.getSelectedIndex()).getId_empresa();
        String fecha = v.jFechaVisita.getText();
        
        try {
            URL url = new URL("http://127.0.0.1:8000/profesional/visita");
            Map<String, Object> params = new LinkedHashMap<>();

            params.put("Id_Persona", nom);
            params.put("Id_Empresa", emp);
            params.put("Fecha_Visita", fecha);
            

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

            }
            byte[] postByte = postData.toString().getBytes("UTF-8");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.addRequestProperty("Content-Length", String.valueOf(postByte.length));
            con.setDoOutput(true);
            con.getOutputStream().write(postByte);

            int response = con.getResponseCode();
            Map<String, String> map = new HashMap<>();

            map.put("201", "Registro Exitoso");
            map.put("default", "Error en el registro");

            if (response == 201) {
                JOptionPane.showMessageDialog(null, map.get("" + response));
            } else {
                JOptionPane.showMessageDialog(null, map.get("default"));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void listarVisitas(PlanificarVisitas v) {

        DefaultTableModel tabla = new DefaultTableModel();

        tabla.addColumn("FECHA VISITA");
        tabla.addColumn("NOMBRE EMPRESA");
        tabla.addColumn("DIRECCION");
        
        try {

            URL url = new URL("http://127.0.0.1:8000/profesional/listarV/?format=json");
            HttpURLConnection curl = (HttpURLConnection) url.openConnection();
            curl.setRequestMethod("GET");
            curl.connect();
            int response = curl.getResponseCode();

            if (response != 200) {

                throw new RuntimeException("Error:" + response);

            } else {
                StringBuilder information = new StringBuilder();
                Scanner s = new Scanner(url.openStream());
                String[] datos = new String[10];

                while (s.hasNext()) {

                    information.append(s.nextLine());

                }
                s.close();

                JSONArray json = new JSONArray(information.toString());
                try {
                    for (int i = 0; i < 10; i++) {

                        JSONObject object = json.getJSONObject(i);

                        datos[0] = object.getString("Fecha_Visita");
                        datos[1] = object.getString("Nombre_Empresa");
                        datos[2] = object.getString("Direccion_Empresa");

                        tabla.addRow(datos);

                    }
                } catch (Exception e) {
                    System.out.println("" + e);
                }

            }
            System.out.println("cargado");
            v.jTablaVisitas.setModel(tabla);

        } catch (Exception ex) {
            System.out.println("error");
            System.out.println(ex.toString());
        }

    }
    
    public void Limpiar(Capacitación ca) {
        ca.jAsistentes.setText(null);
        ca.jFecha.setText(null);
        ca.jTema.setText(null);

    }

}
