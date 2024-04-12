/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Tools.Imagen;
import dto.ClientesDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocio.GenerarTramiteLicenciaBO;

/**
 *
 * @author Arell
 */
public class CostosLicenciaAuto extends javax.swing.JFrame {
private GenerarTramiteLicenciaBO generar;
  private ClientesDTO cliente;
    /**
     * Creates new form LicenciaPanel
     */
    public CostosLicenciaAuto(ClientesDTO cliente) {
        initComponents();
        //Configurar Tamaño JFrame
        setTitle("Ventana de Costos Licencas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configurar la Foto
        Imagen imagen = new Imagen();
        imagen.PintarImagen(FotoGobSonora, "src\\Pantallas\\GobSonora.jpg");
        imagen.PintarImagen(TablaCostos, "src\\Pantallas\\CostoLicencia.jpg");
        //inicializacion
        this.cliente = cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        Aceptar = new javax.swing.JButton();
        FondoBlanco = new javax.swing.JPanel();
        FondoGris4 = new javax.swing.JPanel();
        FotoGobSonora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TablaCostos = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JButton();
        Cancelar1 = new javax.swing.JButton();
        ComboBoxAños = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        Aceptar.setBackground(new java.awt.Color(0, 255, 51));
        Aceptar.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        FondoGris4.setBackground(new java.awt.Color(0, 51, 51));

        FotoGobSonora.setBackground(new java.awt.Color(255, 255, 255));
        FotoGobSonora.setForeground(new java.awt.Color(255, 255, 255));
        FotoGobSonora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costos Licencia ");

        javax.swing.GroupLayout FondoGris4Layout = new javax.swing.GroupLayout(FondoGris4);
        FondoGris4.setLayout(FondoGris4Layout);
        FondoGris4Layout.setHorizontalGroup(
            FondoGris4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoGris4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FotoGobSonora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        FondoGris4Layout.setVerticalGroup(
            FondoGris4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoGris4Layout.createSequentialGroup()
                .addGroup(FondoGris4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoGris4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FotoGobSonora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoGris4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TablaCostos.setBackground(new java.awt.Color(255, 255, 255));
        TablaCostos.setForeground(new java.awt.Color(255, 255, 255));
        TablaCostos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Aceptar1.setBackground(new java.awt.Color(0, 255, 51));
        Aceptar1.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N
        Aceptar1.setText("Aceptar");
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });

        Cancelar1.setBackground(new java.awt.Color(255, 0, 0));
        Cancelar1.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N
        Cancelar1.setText("Cancelar");
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });

        ComboBoxAños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "" }));
        ComboBoxAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAñosActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        jLabel3.setText("Años");

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoGris4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxAños, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TablaCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(FondoGris4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(TablaCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxAños, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
      //  CostosLicenciaAuto licencia = new CostosLicenciaAuto();
        //licencia.setVisible(true);
    }//GEN-LAST:event_AceptarActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
         String años = (String)ComboBoxAños.getSelectedItem();
         try {
            generar.CalcularCosto(años,cliente.getDiscapacitado());
        } catch (Exception e) {
        }
        InicioMenuPanel inicio = new InicioMenuPanel();
        inicio.setVisible(true);this.dispose();
        JOptionPane.showMessageDialog(this, "El Tramite se realizo correctamente.", "Transacción Exitosa", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_Aceptar1ActionPerformed

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        // Cerrar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_Cancelar1ActionPerformed

    private void ComboBoxAñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAñosActionPerformed

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
            java.util.logging.Logger.getLogger(CostosLicenciaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostosLicenciaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostosLicenciaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostosLicenciaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CostosLicenciaAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JComboBox<String> ComboBoxAños;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JPanel FondoGris4;
    private javax.swing.JLabel FotoGobSonora;
    private javax.swing.JLabel TablaCostos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
