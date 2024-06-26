/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Tools.Imagen;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocio.AgregarPersonaBO;

/**
 *
 * @author Arell
 */
public class InicioMenuPanel extends javax.swing.JFrame {
private AgregarPersonaBO agregarpersona;
    /**
     * Creates new form InicioMenuPanel
     */
    public InicioMenuPanel() {
      initComponents();
       
        //Configurar Tamaño JFrame
        setTitle("Ventana Principal Inicio Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  setSize(800, 600);
         // Configurar la Foto
        Imagen imagen = new Imagen();
        imagen.PintarImagen(FotoSitio, "src\\Pantallas\\FondoPagSonora.jpg");
        imagen.PintarImagen(FotoGobSonora, "src\\Pantallas\\GobSonora.jpg");
        imagen.PintarImagen(Licencia, "src\\Pantallas\\Licenciaphoto.jpg");
        imagen.PintarImagen(Placas, "src\\Pantallas\\Placa.jpg");
        imagen.PintarImagen(Reportes, "src\\Pantallas\\Reporte.jpg");
        imagen.PintarImagen(Historial, "src\\Pantallas\\Historial.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FondoGris = new javax.swing.JPanel();
        FotoGobSonora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Licencia = new javax.swing.JLabel();
        Placas = new javax.swing.JLabel();
        Reportes = new javax.swing.JLabel();
        Historial = new javax.swing.JLabel();
        FotoSitio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setText("Datos a Validar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoGris.setBackground(new java.awt.Color(0, 51, 51));

        FotoGobSonora.setBackground(new java.awt.Color(255, 255, 255));
        FotoGobSonora.setForeground(new java.awt.Color(255, 255, 255));
        FotoGobSonora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu Principal");

        javax.swing.GroupLayout FondoGrisLayout = new javax.swing.GroupLayout(FondoGris);
        FondoGris.setLayout(FondoGrisLayout);
        FondoGrisLayout.setHorizontalGroup(
            FondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoGrisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FotoGobSonora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        FondoGrisLayout.setVerticalGroup(
            FondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoGrisLayout.createSequentialGroup()
                .addGroup(FondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoGrisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FotoGobSonora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoGrisLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(FondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        Licencia.setBackground(new java.awt.Color(0, 51, 51));
        Licencia.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Licencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Licencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LicenciaMouseClicked(evt);
            }
        });
        jPanel3.add(Licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 107, 77));

        Placas.setBackground(new java.awt.Color(0, 51, 51));
        Placas.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Placas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Placas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlacasMouseClicked(evt);
            }
        });
        jPanel3.add(Placas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 107, 77));

        Reportes.setBackground(new java.awt.Color(0, 51, 51));
        Reportes.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Reportes.setText("   ");
        Reportes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportesMouseClicked(evt);
            }
        });
        jPanel3.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 107, 77));

        Historial.setBackground(new java.awt.Color(0, 51, 51));
        Historial.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Historial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        jPanel3.add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 107, 77));

        FotoSitio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FotoSitio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoSitioMouseClicked(evt);
            }
        });
        jPanel3.add(FotoSitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 640, 160));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setText("Reporte");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel6.setText("Licencia");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel7.setText("Placas");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel8.setText("Historial");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LicenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LicenciaMouseClicked
        // TODO add your handling code here:
        DatosLicencia licencia = new DatosLicencia();
        licencia.setVisible(true);
    }//GEN-LAST:event_LicenciaMouseClicked

    private void PlacasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlacasMouseClicked
       PlacasPanel placas = new PlacasPanel();
        placas.setVisible(true);
    }//GEN-LAST:event_PlacasMouseClicked

    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialMouseClicked
       HistorialPanel consulta = new HistorialPanel();
       consulta.setVisible(true);
               
    }//GEN-LAST:event_HistorialMouseClicked

    private void ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseClicked
        // TODO add your handling code here:
        ReportePanel reporte = new ReportePanel();
       reporte.setVisible(true);
    }//GEN-LAST:event_ReportesMouseClicked

    private void FotoSitioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoSitioMouseClicked
        try {
            agregarpersona.PoblarPersonas();

        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "La Insercion de Datos se realizo correctamente.", "Transacción Exitosa", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_FotoSitioMouseClicked

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
            java.util.logging.Logger.getLogger(InicioMenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioMenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioMenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioMenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioMenuPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoGris;
    private javax.swing.JLabel FotoGobSonora;
    private javax.swing.JLabel FotoSitio;
    private javax.swing.JLabel Historial;
    private javax.swing.JLabel Licencia;
    private javax.swing.JLabel Placas;
    private javax.swing.JLabel Reportes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
