/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import javax.swing.JOptionPane;

/**
 *
 * @author teo
 */
public class frmSoxo extends javax.swing.JFrame {

    /**
     * Creates new form frmSoxo
     */
    public frmSoxo() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTram = new javax.swing.JTextField();
        txtChuc = new javax.swing.JTextField();
        txtDonvi = new javax.swing.JTextField();
        btnTram = new javax.swing.JButton();
        btnChuc = new javax.swing.JButton();
        btnDonvi = new javax.swing.JButton();
        btnInSo = new javax.swing.JButton();
        btnCheckKQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("XỔ SỐ KIẾN THIẾT");

        jLabel2.setText("Trăm");

        jLabel3.setText("Chục");

        jLabel4.setText("Đơn vị");

        txtTram.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTram.setForeground(new java.awt.Color(255, 102, 51));
        txtTram.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtChuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtChuc.setForeground(new java.awt.Color(255, 102, 51));
        txtChuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDonvi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDonvi.setForeground(new java.awt.Color(255, 102, 51));
        txtDonvi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTram.setText("Start");
        btnTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramActionPerformed(evt);
            }
        });

        btnChuc.setText("Start");
        btnChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChucActionPerformed(evt);
            }
        });

        btnDonvi.setText("Start");
        btnDonvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonviActionPerformed(evt);
            }
        });

        btnInSo.setText("In Số");
        btnInSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInSoActionPerformed(evt);
            }
        });

        btnCheckKQ.setText("Check KQ");
        btnCheckKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckKQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnInSo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCheckKQ))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(btnTram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTram))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(btnChuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtChuc))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDonvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTram)
                    .addComponent(btnChuc)
                    .addComponent(btnDonvi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInSo)
                    .addComponent(btnCheckKQ))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramActionPerformed
        // TODO add your handling code here:
       new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    try{
                        int so = (int) Math.round(Math.random()*9);
                        txtTram.setText(String.valueOf(so));
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        break;
                    }
                }
            }
        }.start();  
       
    }//GEN-LAST:event_btnTramActionPerformed

    private void btnChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChucActionPerformed
        // TODO add your handling code here:
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    try{
                        int so = (int) Math.round(Math.random()*9);
                        txtChuc.setText(String.valueOf(so));
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        break;
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnChucActionPerformed

    private void btnDonviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonviActionPerformed
        // TODO add your handling code here:
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    try{
                        int so = (int) Math.round(Math.random()*9);
                        txtDonvi.setText(String.valueOf(so));
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        break;
                    }
                }
            }
        }.start(); 
    }//GEN-LAST:event_btnDonviActionPerformed

    private void btnInSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInSoActionPerformed
        // TODO add your handling code here:
        //............
        JOptionPane.showMessageDialog(this, "3 7 9");
    }//GEN-LAST:event_btnInSoActionPerformed

    private void btnCheckKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckKQActionPerformed
        // TODO add your handling code here:
        //..............
         JOptionPane.showMessageDialog(this, "Có người trúng!");
    }//GEN-LAST:event_btnCheckKQActionPerformed

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
            java.util.logging.Logger.getLogger(frmSoxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSoxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSoxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSoxo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSoxo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckKQ;
    private javax.swing.JButton btnChuc;
    private javax.swing.JButton btnDonvi;
    private javax.swing.JButton btnInSo;
    private javax.swing.JButton btnTram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtChuc;
    private javax.swing.JTextField txtDonvi;
    private javax.swing.JTextField txtTram;
    // End of variables declaration//GEN-END:variables
}
