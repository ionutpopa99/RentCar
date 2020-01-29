/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_personale;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.View;

/**
 *
 * @author John
 */
public class Date_personale extends javax.swing.JFrame {

    /**
     * Creates new form Date_personale
     */
    public Date_personale() {
        initComponents();
    }

    public Connection getConnection()
    {
        Connection con = null;
        
       
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/datepersonale","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Date_personale.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
       
    }
    
    public boolean checkInputs()
	 {
		 if(txtnume.getText()==null||txtprenume.getText()==null||txtoras.getText()==null||txttelefon.getText()==null||txtemail.getText()==null||txtvarsta.getText()==null||txtnume_card.getText()==null||txtnumar_card.getText()==null||txtcvc.getText()==null||txtexp_card.getText()==null ) {
			 return false;
		 
		 }
		 else {
                     return true;
		 }
			 
	 }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnume = new javax.swing.JLabel();
        lblprenume = new javax.swing.JLabel();
        lbloras = new javax.swing.JLabel();
        lbltelefon = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblvarsta = new javax.swing.JLabel();
        txtnume = new javax.swing.JTextField();
        txtprenume = new javax.swing.JTextField();
        txtoras = new javax.swing.JTextField();
        txttelefon = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtvarsta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnume_card = new javax.swing.JLabel();
        lblnumar_card = new javax.swing.JLabel();
        lblcvc = new javax.swing.JLabel();
        lblexp_card = new javax.swing.JLabel();
        txtnume_card = new javax.swing.JTextField();
        txtnumar_card = new javax.swing.JTextField();
        txtcvc = new javax.swing.JTextField();
        txtexp_card = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        lblnume.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnume.setText("Nume:");

        lblprenume.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblprenume.setText("Prenume:");

        lbloras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbloras.setText("Oras:");

        lbltelefon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltelefon.setText("Numar de telefon:");

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblemail.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblvarsta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblvarsta.setText("Varsta:");

        txtnume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informatii de plata");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Informatii despre conducator");

        lblnume_card.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnume_card.setText("Numele titularului cardului:");

        lblnumar_card.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnumar_card.setText("Numarul cardului:");

        lblcvc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcvc.setText("CVC:");

        lblexp_card.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblexp_card.setText("Expirarea cardului:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Plateste");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Iesire");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Inapoi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnume)
                                .addComponent(lblprenume)
                                .addComponent(lbloras))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnume)
                                .addComponent(txtprenume)
                                .addComponent(txtoras, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbltelefon)
                                .addComponent(lblemail)
                                .addComponent(lblvarsta))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txttelefon)
                                .addComponent(txtemail)
                                .addComponent(txtvarsta, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnume_card)
                            .addComponent(lblnumar_card)
                            .addComponent(lblcvc)
                            .addComponent(lblexp_card)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnume_card)
                            .addComponent(txtnumar_card)
                            .addComponent(txtcvc)
                            .addComponent(txtexp_card)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnume)
                    .addComponent(txtnume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblprenume)
                    .addComponent(txtprenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbloras)
                    .addComponent(txtoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefon)
                    .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvarsta)
                    .addComponent(txtvarsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnume_card)
                    .addComponent(txtnume_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumar_card)
                    .addComponent(txtnumar_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcvc)
                    .addComponent(txtcvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblexp_card)
                    .addComponent(txtexp_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(checkInputs())
        {
            try {
                 Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO datepersonale(nume,prenume,oras,numar_de_telefon,email,varsta,nume_card,numar_card,cvc,exp_card)"
                        + "values(?,?,?,?,?,?,?,?,?,?) ");
                ps.setString(1, txtnume.getText());
                ps.setString(2, txtprenume.getText());
                ps.setString(3, txtoras.getText());
                ps.setString(4, txttelefon.getText());
                ps.setString(5, txtemail.getText());
                ps.setString(6, txtvarsta.getText());
                ps.setString(7, txtnume_card.getText());
                ps.setString(8, txtnumar_card.getText());
                ps.setString(9, txtcvc.getText());
                ps.setString(10, txtexp_card.getText());
                
                ps.executeUpdate();
                
               
                JOptionPane.showMessageDialog(null, "Ati inchiriat cu succes!");
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
          JFrame frmLogin_System = new JFrame("Exit");
	if(JOptionPane.showConfirmDialog(frmLogin_System, "Confirmati daca vreti sa iesiti!", "Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.hide();
        
        View.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Date_personale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Date_personale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Date_personale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Date_personale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Date_personale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblcvc;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblexp_card;
    private javax.swing.JLabel lblnumar_card;
    private javax.swing.JLabel lblnume;
    private javax.swing.JLabel lblnume_card;
    private javax.swing.JLabel lbloras;
    private javax.swing.JLabel lblprenume;
    private javax.swing.JLabel lbltelefon;
    private javax.swing.JLabel lblvarsta;
    private javax.swing.JTextField txtcvc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtexp_card;
    private javax.swing.JTextField txtnumar_card;
    private javax.swing.JTextField txtnume;
    private javax.swing.JTextField txtnume_card;
    private javax.swing.JTextField txtoras;
    private javax.swing.JTextField txtprenume;
    private javax.swing.JTextField txttelefon;
    private javax.swing.JTextField txtvarsta;
    // End of variables declaration//GEN-END:variables
}
