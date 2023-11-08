/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author teo
 */
public class frmBai4 extends javax.swing.JFrame {

    /**
     * Creates new form frmBai4
     */
    public frmBai4() {
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
        txtTenFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên file");

        jLabel2.setText("Nội dụng");

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab5/Save-icon.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab5/open-file-icon.png"))); // NOI18N
        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addComponent(txtTenFile)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 190, Short.MAX_VALUE)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoc)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoc)
                    .addComponent(btnLuu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String path = txtTenFile.getText();
        String noidung = txtNoiDung.getText();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(noidung);
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(this, "Ghi file thanh cong");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Loi ghi file");
        }
    }//GEN-LAST:event_btnLuuActionPerformed
    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        String path = txtTenFile.getText();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while(true){
                String line = br.readLine();
                if(line == null){
                    break;
                }else{
                    txtNoiDung.append(line);
                    txtNoiDung.append("\r\n");
                }
            }
            br.close();
            JOptionPane.showMessageDialog(this, "Doc file thanh cong");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Loi doc file");
        }
    }//GEN-LAST:event_btnDocActionPerformed

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
            java.util.logging.Logger.getLogger(frmBai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtTenFile;
    // End of variables declaration//GEN-END:variables
}
