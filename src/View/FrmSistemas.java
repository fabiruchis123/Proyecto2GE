
package View;

import View.Clientes.FRMClientes;
import View.Habitacion.FRMHabitacion;
import View.Reserva.FRMReserva;


public class FrmSistemas extends javax.swing.JFrame {

    public FrmSistemas() {
        initComponents();
        View.maximize(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        Desk = new javax.swing.JDesktopPane();
        BtnClientes = new javax.swing.JButton();
        BtnHabitaciones = new javax.swing.JButton();
        BtnReservas = new javax.swing.JButton();
        BtnServicios = new javax.swing.JButton();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnClientes.setBackground(new java.awt.Color(255, 204, 204));
        BtnClientes.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        BtnClientes.setForeground(new java.awt.Color(255, 51, 102));
        BtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/user (4).png"))); // NOI18N
        BtnClientes.setText("Clientes");
        BtnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnHabitaciones.setBackground(new java.awt.Color(255, 204, 204));
        BtnHabitaciones.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        BtnHabitaciones.setForeground(new java.awt.Color(255, 51, 102));
        BtnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-bedroom-interior-32.png"))); // NOI18N
        BtnHabitaciones.setText("Habitaciones");
        BtnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHabitacionesActionPerformed(evt);
            }
        });

        BtnReservas.setBackground(new java.awt.Color(255, 204, 204));
        BtnReservas.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        BtnReservas.setForeground(new java.awt.Color(255, 51, 102));
        BtnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-reserve-32 (1).png"))); // NOI18N
        BtnReservas.setText("Reservas");
        BtnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReservasActionPerformed(evt);
            }
        });

        BtnServicios.setBackground(new java.awt.Color(255, 204, 204));
        BtnServicios.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        BtnServicios.setForeground(new java.awt.Color(255, 51, 102));
        BtnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-holiday-32.png"))); // NOI18N
        BtnServicios.setText("Servicios");
        BtnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnServiciosActionPerformed(evt);
            }
        });

        Desk.setLayer(BtnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk.setLayer(BtnHabitaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk.setLayer(BtnReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk.setLayer(BtnServicios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DeskLayout = new javax.swing.GroupLayout(Desk);
        Desk.setLayout(DeskLayout);
        DeskLayout.setHorizontalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BtnClientes)
                .addGap(80, 80, 80)
                .addComponent(BtnHabitaciones)
                .addGap(80, 80, 80)
                .addComponent(BtnReservas)
                .addGap(80, 80, 80)
                .addComponent(BtnServicios)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        DeskLayout.setVerticalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClientes)
                    .addComponent(BtnHabitaciones)
                    .addComponent(BtnReservas)
                    .addComponent(BtnServicios))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        FRMClientes frm = new FRMClientes ();
        View.showInternal(Desk, frm);
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnServiciosActionPerformed
        
    }//GEN-LAST:event_BtnServiciosActionPerformed

    private void BtnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHabitacionesActionPerformed
        FRMHabitacion frm = new FRMHabitacion ();
        View.showInternal(Desk, frm);
    }//GEN-LAST:event_BtnHabitacionesActionPerformed

    private void BtnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReservasActionPerformed
         FRMReserva frm = new FRMReserva ();
         View.showInternal(Desk, frm);
    }//GEN-LAST:event_BtnReservasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSistemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnHabitaciones;
    private javax.swing.JButton BtnReservas;
    private javax.swing.JButton BtnServicios;
    private javax.swing.JDesktopPane Desk;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
