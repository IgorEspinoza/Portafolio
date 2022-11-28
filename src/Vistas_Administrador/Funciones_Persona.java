/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas_Administrador;

import Conexión.Conexión;
import Entidades.Persona;
import Vistas.Profesionales;
import Vistas_Profesional.Capacitación;
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

/**
 *
 * @author igore
 */
public class Funciones_Persona {

    Capacitación ca = new Capacitación();
    Profesionales pro = new Profesionales();

    public void GuardarPersona(RegistroProfesionales rp) {

        String nom = rp.NombrePro.getText();
        String rut = rp.RutPro.getText();
        String Apaterno = rp.PaternoPro.getText();
        String Amaterno = rp.MaternoPro.getText();
        String dir = rp.DirPro.getText();
        String email = rp.EmailPro.getText();
        String tel = rp.TelPro.getText();
        String pass = rp.Pass.getText();
        int opcion = (int) rp.jPrivilegio.getSelectedIndex();
        int id = pro.id;

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/persona");
            Map<String, Object> params = new LinkedHashMap<>();

            params.put("RUT", rut);
            params.put("NOMBRE", nom);
            params.put("A_PATERNO", Apaterno);
            params.put("A_MATERNO", Amaterno);
            params.put("DIRECCION", dir);
            params.put("CORREO", email);
            params.put("TELEFONO", tel);
            params.put("ID_ROL", opcion);
            params.put("ID_ESTADO", 1);
            params.put("USERNAME", rut);
            params.put("PASSWORD", pass);

            //param.put("PASSWORD", pass );
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

    public void ModificarPersona(RegistroProfesionales rp) {

        String nom = rp.NombrePro.getText();
        String rut = rp.RutPro.getText();
        String Apaterno = rp.PaternoPro.getText();
        String Amaterno = rp.MaternoPro.getText();
        String dir = rp.DirPro.getText();
        String email = rp.EmailPro.getText();
        String tel = rp.TelPro.getText();
        int opcion = (int) rp.jPrivilegio.getSelectedIndex();
        int id = Integer.parseInt(rp.jid.getText());

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/modificarP/" + id);
            Map<String, Object> params = new LinkedHashMap<>();

            params.put("RUT", rut);
            params.put("NOMBRE", nom);
            params.put("A_PATERNO", Apaterno);
            params.put("A_MATERNO", Amaterno);
            params.put("DIRECCION", dir);
            params.put("CORREO", email);
            params.put("TELEFONO", tel);
            params.put("ID_ROL", opcion);
            params.put("ID_ESTADO", 1);

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

            map.put("200", "Modificación Exitosa");
            map.put("default", "Error al Modificar");

            if (response != 200) {
                JOptionPane.showMessageDialog(null, map.get("default"));
            } else {
                JOptionPane.showMessageDialog(null, map.get(String.valueOf(response)));

            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void EliminaPersona(RegistroProfesionales rp) {

        int id = Integer.parseInt(rp.jid.getText());

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/eliminarP/" + id);
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
            map.put("405", "Error al Eliminar");

            if (response != 0) {
                JOptionPane.showMessageDialog(null, map.get("" + response));
            } else {
                JOptionPane.showMessageDialog(null, map.get("default"));
            }

            Limpiar(rp);
            //return map.get(response);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void listarPersona(RegistroProfesionales rp) {

        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID_PERSONA");
        tabla.addColumn("RUT");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("A PATERNO");
        tabla.addColumn("A MATERNO");
        tabla.addColumn("DIRECCION");
        tabla.addColumn("CORREO");
        tabla.addColumn("TELEFONO");
        tabla.addColumn("ESTADO");
        tabla.addColumn("ROL");

        try {

            URL url = new URL("http://127.0.0.1:8000/administrador/listarP/?format=json");
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
                //JSONObject object = json.getJSONObject(a);

                try {
                    for (int i = 0; i < 10; i++) {

                        JSONObject object = json.getJSONObject(i);
                        datos[0] = String.valueOf(object.getInt("Id_Persona"));
                        datos[1] = object.getString("Rut");
                        datos[2] = object.getString("Nombre");
                        datos[3] = object.getString("A_Paterno");
                        datos[4] = object.getString("A_Materno");
                        datos[5] = object.getString("Direccion");
                        datos[6] = object.getString("Correo");
                        datos[7] = object.getString("Telefono");
                        datos[8] = object.getString("Estado");
                        datos[9] = object.getString("Rol");
                        tabla.addRow(datos);
                        //a++;
                    }
                } catch (Exception e) {
                    System.out.println("" + e);
                }

            }
            System.out.println("cargado");
            rp.jListaPersona.setModel(tabla);

        } catch (Exception ex) {
            System.out.println("error");
            System.out.println(ex.toString());
        }

    }

    public void Limpiar(RegistroProfesionales rp) {
        rp.RutPro.setText(null);
        rp.NombrePro.setText(null);
        rp.PaternoPro.setText(null);
        rp.MaternoPro.setText(null);
        rp.DirPro.setText(null);
        rp.EmailPro.setText(null);
        rp.TelPro.setText(null);
        rp.Pass.setText(null);
        rp.jid.setText(null);
    }

    public void DesactivarPersona(RegistroProfesionales rp) {

        String rut = rp.RutPro.getText();
        int act = 1;

        String sql = "UPDATE persona SET id_estado = ? WHERE RUT = '" + rut + "'";
        String sql2 = "select id_estado from PERSONA where RUT = '" + rut + "'";
        try {
            Connection con = Conexión.getConnection();
            PreparedStatement se = con.prepareStatement(sql2);
            int result = se.executeUpdate();

            if (result != act) {

                PreparedStatement des = con.prepareStatement(sql);
                des.setInt(1, 1);
                des.executeUpdate();
                JOptionPane.showMessageDialog(null, "usuario activado");

            } else if (result == act) {

                PreparedStatement des = con.prepareStatement(sql);
                des.setInt(1, 2);
                des.executeUpdate();
                JOptionPane.showMessageDialog(null, "usuario desactivado");
            }

        } catch (SQLException ex) {
            System.out.println("" + ex.toString());
        }
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
}
