/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas_Profesional;

import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author igore
 */
public class Funciones {

    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    JFileChooser seleccionado = new JFileChooser();
    
    public Funciones() {
    }

    public String Abrir(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                contenido += caracter;
            }
        } catch (Exception e) {

        }
        return contenido;
    }
    
    public void AbrirArchivo(CheckList c){
         try {
            if (seleccionado.showDialog(c, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionado.getSelectedFile();
                if (archivo.canRead()) {
                    if (archivo.getName().endsWith("txt")) {
                        String contenido = Abrir(archivo);
                        c.txtMejoras.setText(contenido);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por Favor Seleccione Archivo Valido");
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    public String Guardar(File archivo, String contenido) throws IOException {
        String respuesta = null;

        try {

            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Guardado Correctamente";
        } catch (Exception e) {

        }
        return respuesta;
    }

    public void GuardarArchivo(CheckList c){
               try {
            if (seleccionado.showDialog(c, "GUARDAR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionado.getSelectedFile();
                if (archivo.getName().endsWith(".txt") || archivo.getName().endsWith(".pdf")) {
                    String contenido = c.txtMejoras.getText();
                    String respuesta;
                    try {
                        respuesta = Guardar(archivo, contenido);
                        if (respuesta != null) {
                            JOptionPane.showMessageDialog(null, respuesta);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar Archivo");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(CheckList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor guardar en formato texto");
                }
            }
        } catch (Exception e) {

        }
    }
           
    public void GuardarPDF(CheckList c){
        try {
            if (seleccionado.showDialog(c, "GUARDAR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionado.getSelectedFile();
                if (archivo.getName().endsWith(".pdf")) {
                    try {
                        OutputStream salida = new FileOutputStream(seleccionado.getSelectedFile());
                        Document doc = new Document();
                        PdfWriter.getInstance(doc, salida);
                        doc.open();
                        doc.add(new Paragraph(c.txtMejoras.getText()));
                        doc.close();
                        salida.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al guardar PDF");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar PDF");
        }     
    }
    
    public void Limpiar(CheckList c) {
        c.txtMejoras.setText(null);
    }
       
}
