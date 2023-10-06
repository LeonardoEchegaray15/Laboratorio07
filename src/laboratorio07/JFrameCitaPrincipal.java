/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio07;


import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Leonardo
 */
public class JFrameCitaPrincipal extends javax.swing.JFrame {

   
    private List<Cita> listaCitas;
    private DefaultListModel <String> modelo;  //Me permite utilizar los elementos de una lista


    /**
     * Creates new form JFrameCitaPrincipal
     */
    
    
    public JFrameCitaPrincipal() {
          initComponents();
          listaCitas = GestorCitas.CitaEnSistema;
          modelo = new DefaultListModel<>();
          this.lstNuevaCita.setModel(modelo);
          modelo.removeAllElements();
    
    }
    
    

    
    /*public void agregarNuevaCita(String nuevaCita) {
        modelo.addElement(nuevaCita);
        lstNuevaCita.setModel(modelo);
    }*/

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNuevaCita = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();
        btnNuevaCita = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(520, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 320));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));

        lstNuevaCita.setBackground(new java.awt.Color(255, 255, 255));
        lstNuevaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNuevaCitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNuevaCita);

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio07/Group 1.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio07/Group 3.png"))); // NOI18N
        btnCancelarCita.setBorder(null);
        btnCancelarCita.setContentAreaFilled(false);
        btnCancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCitaActionPerformed(evt);
            }
        });

        btnNuevaCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio07/Group 2.png"))); // NOI18N
        btnNuevaCita.setBorder(null);
        btnNuevaCita.setContentAreaFilled(false);
        btnNuevaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCitaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CITA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCancelarCita)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaCita))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCita)
                    .addComponent(btnNuevaCita))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCitaActionPerformed

        int index = lstNuevaCita.getSelectedIndex();
        listaCitas.remove(index);
        vCargarCitas("");
        
    }//GEN-LAST:event_btnCancelarCitaActionPerformed

    private void btnNuevaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCitaActionPerformed

          JFrameNuevaCita nuevaCita = new JFrameNuevaCita(this);
          nuevaCita.setLocationRelativeTo(this);
          nuevaCita.setVisible(true);
          this.setVisible(false);
        
    }//GEN-LAST:event_btnNuevaCitaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        vCargarCitas(txtBuscar.getText().trim());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lstNuevaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNuevaCitaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() > 1){
            JFrameNuevaCita cita = new JFrameNuevaCita(this, listaCitas.get(lstNuevaCita.getSelectedIndex()));
            cita.setLocationRelativeTo(null);
            cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lstNuevaCitaMouseClicked

    
    
    
    
    
    
    public void AgregarCita(Cita newCita){
        listaCitas.add(newCita);
        modelo.removeAllElements();
        for(Cita citaLst: listaCitas){
            modelo.addElement(citaLst.getTexto());
        }
    }
    
    
    
    private void vCargarCitas(String crit){
        modelo.removeAllElements();
        
        for(Cita cita : listaCitas){
            if(cita.getPaciente().getNombre().contains(crit)){
                modelo.addElement(cita.getTexto());
            }
        }
    }
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
            java.util.logging.Logger.getLogger(JFrameCitaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCitaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCitaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCitaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCitaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnNuevaCita;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNuevaCita;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
