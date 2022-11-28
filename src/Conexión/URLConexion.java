/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

/**
 *
 * @author igore
 */
public class URLConexion {

    public void DescargaConstruccion() {

        String curl = "https://www.ist.cl/wp-content/uploads/pdfs/Lista_de_chequeo_obra.pdf";
        try {
            URL url = new URL(curl);
            String name = "Lista_de_chequeo_obra.pdf"; 
            
            String folder = "C:\\Users\\igore\\Downloads/";
            
            File dir = new File(folder);
            
            if (!dir.exists()) {
                if (!dir.mkdir()) {
                    return;
                }
            }

            File file = new File(folder + name);
            
            
            URLConnection conn = new URL(curl).openConnection();
            conn.connect();
            
            InputStream in = conn.getInputStream();
            OutputStream out = new FileOutputStream(file);

            int b = 0;
            while (b != -1) {
                b = in.read();
                if (b != -1) {
                    out.write(b);
                }
            }
            
            out.close();
            in.close();
            
            JOptionPane.showMessageDialog(null, "descarga realizada");
            
        } catch (MalformedURLException e) {
            System.out.println("la url: " + curl + " no es valida!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void DescargaMineria() {

        String curl = "https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&ved=2ahUKEwjOn77vnJ37AhVsBbkGHWnrCuIQFnoECBMQAQ&url=https%3A%2F%2Fwww.dt.gob.cl%2Fm%2F1620%2Farticles-59852_recurso_1.doc&usg=AOvVaw3qpy-ob9geLy4OyLA8uN8t";
        try {
            URL url = new URL(curl);
            String name = "articles-59852_recurso_1.doc"; 
            
            String folder = "C:\\Users\\igore\\Downloads/";
            
            File dir = new File(folder);
            
            if (!dir.exists()) {
                if (!dir.mkdir()) {
                    return;
                }
            }

            File file = new File(folder + name);
            
            
            URLConnection conn = new URL(curl).openConnection();
            conn.connect();
            
            InputStream in = conn.getInputStream();
            OutputStream out = new FileOutputStream(file);

            int b = 0;
            while (b != -1) {
                b = in.read();
                if (b != -1) {
                    out.write(b);
                }
            }
            
            out.close();
            in.close();
            
            JOptionPane.showMessageDialog(null, "descarga realizada");
            
        } catch (MalformedURLException e) {
            System.out.println("la url: " + curl + " no es valida!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void DescargaIndustrial() {

        String curl = "https://www.ist.cl/wp-content/uploads/pdfs/Lista_de_chequeo_obra.pdf";
        try {
            URL url = new URL(curl);
            String name = "Lista_de_chequeo_obra.pdf"; 
            String folder = "C:\\Users\\igore\\Downloads/";
            
            File dir = new File(folder);
            
            if (!dir.exists()) {
                if (!dir.mkdir()) {
                    return;
                }
            }

            File file = new File(folder + name);
            
            
            URLConnection conn = new URL(curl).openConnection();
            conn.connect();
            
            InputStream in = conn.getInputStream();
            OutputStream out = new FileOutputStream(file);

            int b = 0;
            while (b != -1) {
                b = in.read();
                if (b != -1) {
                    out.write(b);
                }
            }
            
            out.close();
            in.close();
            
            JOptionPane.showMessageDialog(null, "descarga realizada");
            
        } catch (MalformedURLException e) {
            System.out.println("la url: " + curl + " no es valida!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}
