package Vistas_Profesional;

import Conexión.URLConexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CheckList extends javax.swing.JPanel {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    Funciones funcion = new Funciones();
    URLConexion cn = new URLConexion();

    public CheckList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAbrirTxt = new javax.swing.JButton();
        btnGuardarTxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMejoras = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        GuardarPdf = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(950, 300));

        jLabel1.setText("Creación de CheckList");

        jLabel2.setText("CheckList Contruccion");

        jLabel3.setText("CheckList Mineria");

        jLabel4.setText("CheckList Industrial");

        jButton4.setText("Descargar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Descargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton4)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 140));

        jLabel5.setText("Actividad de Mejoras");

        btnAbrirTxt.setText("Abrir Archivo");
        btnAbrirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTxtActionPerformed(evt);
            }
        });

        btnGuardarTxt.setText("Guardar");
        btnGuardarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTxtActionPerformed(evt);
            }
        });

        txtMejoras.setColumns(20);
        txtMejoras.setRows(5);
        jScrollPane1.setViewportView(txtMejoras);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        GuardarPdf.setText("PDF");
        GuardarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAbrirTxt)
                                .addGap(491, 491, 491)
                                .addComponent(btnLimpiar)
                                .addGap(27, 27, 27)
                                .addComponent(btnGuardarTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarPdf)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirTxt)
                    .addComponent(btnGuardarTxt)
                    .addComponent(btnLimpiar)
                    .addComponent(GuardarPdf))
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 950, 520));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTxtActionPerformed
        funcion.GuardarArchivo(this);
    }//GEN-LAST:event_btnGuardarTxtActionPerformed

    private void btnAbrirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTxtActionPerformed
        funcion.AbrirArchivo(this);
    }//GEN-LAST:event_btnAbrirTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cn.DescargaIndustrial();
        try {
            Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start C:\\Users\\igore\\Downloads");
        } catch (IOException ex) {
            Logger.getLogger(CheckList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cn.DescargaMineria();
        try {
            Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start C:\\Users\\igore\\Downloads");
        } catch (IOException ex) {
            Logger.getLogger(CheckList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cn.DescargaConstruccion();
        try {
            Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start C:\\Users\\igore\\Downloads");
        } catch (IOException ex) {
            Logger.getLogger(CheckList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        funcion.Limpiar(this);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void GuardarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPdfActionPerformed
        funcion.GuardarPDF(this);
    }//GEN-LAST:event_GuardarPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPdf;
    private javax.swing.JButton btnAbrirTxt;
    private javax.swing.JButton btnGuardarTxt;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtMejoras;
    // End of variables declaration//GEN-END:variables
}
