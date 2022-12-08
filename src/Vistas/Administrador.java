/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Conexión.CerrarConexion;
import Conexión.Conexión;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import Vistas_Administrador.RegistroClientes;
import Vistas_Administrador.ActividadesClientes;
import Vistas_Administrador.ContratosClientes;
import Vistas_Administrador.Estadisticas;
import Vistas_Administrador.RegistroProfesionales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igore
 */
public class Administrador extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Administrador() {

        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/admin.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSalir1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jMenu = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jReClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAcClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jContratos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jReProfesionales = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jCerrarSesion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jEstadisticas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jVistasAdmin = new javax.swing.JPanel();
        jHeader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JIDA = new javax.swing.JTextField();
        JNOMA = new javax.swing.JTextField();
        JRUTA = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jSalir1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jSalir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSalir1.setText("x");
        jSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSalir1MouseExited(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel11.setBackground(new java.awt.Color(159, 197, 248));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu.setMinimumSize(new java.awt.Dimension(340, 70));
        jMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("Asesorias");
        jMenu.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 159, 66));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 122, 159, 13));

        jReClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jReClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jReClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jReClientesMousePressed(evt);
            }
        });
        jReClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Clientes");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jReClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jMenu.add(jReClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 239, 340, -1));

        jAcClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAcClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAcClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAcClientesMousePressed(evt);
            }
        });
        jAcClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Actividades Clientes");
        jAcClientes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jMenu.add(jAcClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 309, 340, -1));

        jContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jContratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jContratosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jContratosMousePressed(evt);
            }
        });
        jContratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contratos ");
        jContratos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jMenu.add(jContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, 340, -1));

        jReProfesionales.setMinimumSize(new java.awt.Dimension(340, 70));
        jReProfesionales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jReProfesionalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jReProfesionalesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jReProfesionalesMousePressed(evt);
            }
        });
        jReProfesionales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro de Profesionales");
        jReProfesionales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jMenu.add(jReProfesionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 449, 340, -1));

        jCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCerrarSesionMousePressed(evt);
            }
        });
        jCerrarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cerrar Sesion");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jCerrarSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jMenu.add(jCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 340, 70));

        jEstadisticas.setPreferredSize(new java.awt.Dimension(340, 70));
        jEstadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estadisticas");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jEstadisticas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 6, 340, 60));

        jMenu.add(jEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 340, -1));

        jPanel11.add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 850));

        jVistasAdmin.setBackground(new java.awt.Color(159, 197, 248));

        javax.swing.GroupLayout jVistasAdminLayout = new javax.swing.GroupLayout(jVistasAdmin);
        jVistasAdmin.setLayout(jVistasAdminLayout);
        jVistasAdminLayout.setHorizontalGroup(
            jVistasAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jVistasAdminLayout.setVerticalGroup(
            jVistasAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel11.add(jVistasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 1070, 720));

        jHeader.setBackground(new java.awt.Color(159, 197, 248));
        jHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jHeaderMouseDragged(evt);
            }
        });
        jHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jHeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jHeaderLayout = new javax.swing.GroupLayout(jHeader);
        jHeader.setLayout(jHeaderLayout);
        jHeaderLayout.setHorizontalGroup(
            jHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jHeaderLayout.setVerticalGroup(
            jHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jLabel7.setText("Nombre:");

        jLabel8.setText("Rut:");

        jLabel9.setText("ID:");

        JIDA.setEditable(false);
        JIDA.setBackground(new java.awt.Color(214, 217, 223));
        JIDA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JIDA.setBorder(null);

        JNOMA.setEditable(false);
        JNOMA.setBackground(new java.awt.Color(214, 217, 223));
        JNOMA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JNOMA.setBorder(null);

        JRUTA.setEditable(false);
        JRUTA.setBackground(new java.awt.Color(214, 217, 223));
        JRUTA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JRUTA.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(JIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JNOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(JRUTA, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(JIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JNOMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRUTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 1070, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jHeaderMouseDragged

    private void jHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jHeaderMousePressed

    private void jSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalir1MouseClicked

    private void jSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalir1MouseEntered

    private void jSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalir1MouseExited

    private void jReClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReClientesMouseEntered
        jReClientes.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jReClientesMouseEntered

    private void jReClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReClientesMouseExited
        jReClientes.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jReClientesMouseExited

    private void jAcClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAcClientesMouseEntered
        jAcClientes.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jAcClientesMouseEntered

    private void jAcClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAcClientesMouseExited
        jAcClientes.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jAcClientesMouseExited

    private void jContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContratosMouseEntered
        jContratos.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jContratosMouseEntered

    private void jContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContratosMouseExited
        jContratos.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jContratosMouseExited

    private void jCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarSesionMouseEntered
        jCerrarSesion.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jCerrarSesionMouseEntered

    private void jCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarSesionMouseExited
        jCerrarSesion.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jCerrarSesionMouseExited

    private void jCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarSesionMousePressed

    }//GEN-LAST:event_jCerrarSesionMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        try {
            CerrarConexion.CerrarSession();
        } catch (SQLException ex) {
            Logger.getLogger(Profesionales.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jCerrarSesion.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jCerrarSesion.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jReClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReClientesMousePressed
        RegistroClientes rc = new RegistroClientes();
        rc.setSize(1070, 720);
        rc.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(rc, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jReClientesMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        RegistroClientes rc = new RegistroClientes();
        rc.llenarProfesionales();
        rc.llenarRepresentantes();
        rc.setSize(1070, 720);
        rc.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(rc, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jAcClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAcClientesMousePressed
        ActividadesClientes ac = new ActividadesClientes();
        ac.setSize(1070, 720);
        ac.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(ac, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jAcClientesMousePressed

    private void jContratosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContratosMousePressed
        ContratosClientes cc = new ContratosClientes();
        cc.setSize(1070, 720);
        cc.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(cc, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jContratosMousePressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jReClientes.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jReClientes.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jReProfesionalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReProfesionalesMouseEntered
        jReProfesionales.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jReProfesionalesMouseEntered

    private void jReProfesionalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReProfesionalesMouseExited
        jReProfesionales.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jReProfesionalesMouseExited

    private void jReProfesionalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReProfesionalesMousePressed
        RegistroProfesionales rp = new RegistroProfesionales();
        rp.setSize(1070, 720);
        rp.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(rp, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jReProfesionalesMousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jEstadisticas.setBackground(new Color(159, 197, 248));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jEstadisticas.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Estadisticas es = new Estadisticas();
        es.setSize(1070, 720);
        es.setLocation(0, 0);

        jVistasAdmin.removeAll();
        jVistasAdmin.add(es, BorderLayout.CENTER);
        jVistasAdmin.revalidate();
        jVistasAdmin.repaint();
    }//GEN-LAST:event_jLabel6MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField JIDA;
    public javax.swing.JTextField JNOMA;
    public javax.swing.JTextField JRUTA;
    private javax.swing.JPanel jAcClientes;
    private javax.swing.JPanel jCerrarSesion;
    private javax.swing.JPanel jContratos;
    private javax.swing.JPanel jEstadisticas;
    private javax.swing.JPanel jHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jReClientes;
    private javax.swing.JPanel jReProfesionales;
    private javax.swing.JLabel jSalir1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel jVistasAdmin;
    // End of variables declaration//GEN-END:variables
}
