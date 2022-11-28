/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas_Administrador;

import Conexión.Conexión;
import Entidades.Persona;
import Vistas_Profesional.Funciones_Profesional;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class Funciones_Empresa {

    Persona persona = new Persona();

    public void GuardarEmpresa(RegistroClientes rc) {

        String nom = rc.NomEmpresa.getText();
        String rut = rc.RutEmpresa.getText();
        String rubro = rc.RubroEmpresa.getText();
        String dir = rc.DireccionEmpresa.getText();
        String email = rc.EmailEmpresa.getText();
        String tel = rc.TelEmpresa.getText();
        String pass = rc.PassEmpresa.getText();
        int pro = rc.cbxProfesionalesAd.getItemAt(rc.cbxProfesionalesAd.getSelectedIndex()).getId_persona();

        try {
            URL url = new URL("http://127.0.0.1:8000/administrador/empresa");
            Map<String, Object> params = new LinkedHashMap<>();
            params.put("RUT_EMPRESA", rut);
            params.put("NOMBRE_EMPRESA", nom);
            params.put("RUBRO_EMPRESA", rubro);
            params.put("TELEFONO_EMPRESA", tel);
            params.put("CORREO_EMPRESA", email);
            params.put("DIRECCION_EMPRESA", dir);
            params.put("ID_CONTRATO", 1);
            params.put("ID_ESTADO", 1);
            params.put("ID_PROFESIONAL", pro);
            //params.put("ID_REPRESENTANTE", rep);
            params.put("USERNAME", rut);
            params.put("PASSWORD", pass);

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
                //postData.append("}");
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

            if (response != 0) {
                JOptionPane.showMessageDialog(null, map.get("" + response));
            } else {
                JOptionPane.showMessageDialog(null, map.get("default"));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void ModificarEmpresa(RegistroClientes rc) {

        String nom = rc.NomEmpresa.getText();
        String rut = rc.RutEmpresa.getText();
        String rubro = rc.RubroEmpresa.getText();
        String dir = rc.DireccionEmpresa.getText();
        String email = rc.EmailEmpresa.getText();
        String tel = rc.TelEmpresa.getText();

        int id = Integer.parseInt(rc.jIde.getText());

        try {
            URL url = new URL("http://127.0.0.1:8000/administrador/modificarE/" + id);
            Map<String, Object> params = new LinkedHashMap<>();
            params.put("RUT_EMPRESA", rut);
            params.put("NOMBRE_EMPRESA", nom);
            params.put("RUBRO_EMPRESA", rubro);
            params.put("TELEFONO_EMPRESA", tel);
            params.put("CORREO_EMPRESA", email);
            params.put("DIRECCION_EMPRESA", dir);
            params.put("ID_CONTRATO", 1);
            params.put("ID_ESTADO", 1);
            params.put("USERNAME", rut);

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
                //postData.append("}");
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

            map.put("200", "Modificacion Exitosa");
            map.put("default", "Error al Modificar");

            if (response != 200) {
                JOptionPane.showMessageDialog(null, map.get("default"));
            } else {
                JOptionPane.showMessageDialog(null, map.get(String.valueOf(response)));
            }

            //return map.get(response);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    public void EliminarEmpresa(RegistroClientes rc) {

        int id = Integer.parseInt(rc.jIde.getText());

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/eliminarE/" + id);
            StringBuilder postData = new StringBuilder();
            byte[] postByte = postData.toString().getBytes("UTF-8");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");
            con.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.addRequestProperty("Content-Length", String.valueOf(postByte.length));
            con.setDoOutput(true);
            con.getOutputStream().write(postByte);

            int response = con.getResponseCode();

            Map<String, String> map = new HashMap<>();

            map.put("404", "ID inexistente");
            map.put("200", "Eliminacion Exitosa");
            map.put("default", "Error al Eliminar");

            if (response != 0) {
                JOptionPane.showMessageDialog(null, map.get("" + response));
            } else {
                JOptionPane.showMessageDialog(null, map.get("default"));
            }

            Limpiar(rc);
            //return map.get(response);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void listarEmpresas(RegistroClientes rc) {

        DefaultTableModel tabla = new DefaultTableModel();

        tabla.addColumn("RUT EMPRESA");
        tabla.addColumn("NOMBRE EMPRESA");
        tabla.addColumn("RUBRO EMPRESA");
        tabla.addColumn("TELEFONO EMPRESA");
        tabla.addColumn("CORREO EMPRESA");
        tabla.addColumn("DIRECCION EMPRESA");
        tabla.addColumn("ESTADO");

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/listarE/?format=json");
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
                        
                        datos[0] = object.getString("Rut_empresa");
                        datos[1] = object.getString("Nombre_empresa");
                        datos[2] = object.getString("Rubro_empresa");
                        datos[3] = object.getString("Telefono_empresa");
                        datos[4] = object.getString("Correo_empresa");
                        datos[5] = object.getString("Direccion_empresa");
                        datos[6] = object.getString("Estado");

                        tabla.addRow(datos);
                        //a++;
                    }
                } catch (Exception e) {
                    System.out.println("" + e);
                }

            }
            System.out.println("cargado");
            rc.jListaEmpresa.setModel(tabla);

        } catch (Exception ex) {
            System.out.println("error");
            System.out.println(ex.toString());
        }

    }

    public void Limpiar(RegistroClientes rc) {
        rc.NomEmpresa.setText(null);
        rc.RutEmpresa.setText(null);
        rc.RubroEmpresa.setText(null);
        rc.DireccionEmpresa.setText(null);
        rc.EmailEmpresa.setText(null);
        rc.TelEmpresa.setText(null);
        rc.PassEmpresa.setText(null);
    }

    public void DesactivarEmpresa(RegistroClientes rc) {

        String rut = rc.RutEmpresa.getText();

        String sql = "UPDATE EMPRESA SET estado = ? WHERE RUT_EMPRESA='" + rut + "'";

        try {
            Connection con = Conexión.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id_estado from EMPRESA where RUT_EMPRESA = '" + rut + "'");

            if (rs.next()) {
                if (rs.equals(1)) {

                    PreparedStatement des = con.prepareStatement(sql);
                    des.setString(1, "inactivo");
                    des.executeUpdate();
                    JOptionPane.showMessageDialog(null, "usuario desactivado");

                } else if (rs.equals(2)) {

                    PreparedStatement des = con.prepareStatement(sql);
                    des.setString(1, "activo");
                    des.executeUpdate();
                    JOptionPane.showMessageDialog(null, "usuario activado");
                }
            }

        } catch (SQLException ex) {
            System.out.println("" + ex.toString());
        }
    }

}
