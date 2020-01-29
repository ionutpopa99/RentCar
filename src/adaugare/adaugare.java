/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaugare;

import first_page.First_page;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author John
 */
public class adaugare extends javax.swing.JFrame {

    /**
     * Creates new form adaugare
     */
    public adaugare() {
        initComponents();
    }
    
    
    String ImgPath = null;
    
    public Connection getConnection()
    {
        Connection con = null;
        
       
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/inchirieri","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(adaugare.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
       
    }
    
    public boolean checkInputs()
	 {
		 if(txtmarca.getText()==null||txtmodel.getText()==null||txtculoare.getText()==null||txtan_fabricatie.getText()==null||txtconsum.getText()==null||txtpret.getText()==null ) {
			 return false;
		 
		 }
		 else {
		 try {
			 Float.parseFloat(txtpret.getText());
			 return true;
		 }catch(Exception ex){
			 return false;
		 }
		 }
			 
	 }
    
    
    
    public ImageIcon ResizeImage(String imagePath, byte[] pimag)
    {
        ImageIcon myImage = null;
        
        if(imagePath != null)
        {
            myImage = new ImageIcon(imagePath);
        }else{
            myImage = new ImageIcon(pimag);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        lblmarca = new javax.swing.JLabel();
        lblmodel = new javax.swing.JLabel();
        lblculoare = new javax.swing.JLabel();
        lblan_fabricatie = new javax.swing.JLabel();
        lblconsum = new javax.swing.JLabel();
        lblpret = new javax.swing.JLabel();
        lblimagine = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        btnalegere = new javax.swing.JButton();
        txtmarca = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtculoare = new javax.swing.JTextField();
        txtan_fabricatie = new javax.swing.JTextField();
        txtconsum = new javax.swing.JTextField();
        txtpret = new javax.swing.JTextField();
        btnadaugare = new javax.swing.JButton();
        btnactualizare = new javax.swing.JButton();
        btnstergere = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("Id:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        lblmarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmarca.setText("Marca:");

        lblmodel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmodel.setText("Model:");

        lblculoare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblculoare.setText("Culoare:");

        lblan_fabricatie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblan_fabricatie.setText("An fabricatie:");

        lblconsum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblconsum.setText("Consum/100km:");

        lblpret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpret.setText("Pret/zi:");

        lblimagine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblimagine.setText("Imagine:");

        lblimg.setBackground(new java.awt.Color(153, 204, 255));
        lblimg.setOpaque(true);

        btnalegere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnalegere.setText("Alegeti imaginea");
        btnalegere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalegereActionPerformed(evt);
            }
        });

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        txtculoare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtculoareActionPerformed(evt);
            }
        });

        btnadaugare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadaugare.setText("Adauga");
        btnadaugare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadaugareActionPerformed(evt);
            }
        });

        btnactualizare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnactualizare.setText("Actualizare");
        btnactualizare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizareActionPerformed(evt);
            }
        });

        btnstergere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstergere.setText("Stergere");
        btnstergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstergereActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Inapoi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblimagine, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnalegere, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblculoare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmodel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblconsum)
                                    .addComponent(lblan_fabricatie)
                                    .addComponent(lblpret, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpret, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtculoare, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtan_fabricatie, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconsum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(416, 416, 416))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnadaugare)
                .addGap(18, 18, 18)
                .addComponent(btnactualizare)
                .addGap(18, 18, 18)
                .addComponent(btnstergere)
                .addGap(155, 155, 155)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmarca)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmodel)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblculoare)
                    .addComponent(txtculoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblan_fabricatie)
                    .addComponent(txtan_fabricatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblconsum)
                    .addComponent(txtconsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpret)
                    .addComponent(txtpret, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblimagine)))
                .addGap(18, 18, 18)
                .addComponent(btnalegere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadaugare)
                    .addComponent(btnactualizare)
                    .addComponent(btnstergere)
                    .addComponent(btnexit)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnalegereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalegereActionPerformed

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblimg.setIcon(ResizeImage(path, null));
            ImgPath = path;
        }
        else{
            System.out.println("Niciun fisier ales");
        }
    }//GEN-LAST:event_btnalegereActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtculoareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtculoareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtculoareActionPerformed

    private void btnadaugareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadaugareActionPerformed

        if(checkInputs() && ImgPath != null)
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO vizualizare(marca,model,culoare,an_fabricatie,consum,pret,imagine)"
                    + "values(?,?,?,?,?,?,?) ");
                ps.setString(1, txtmarca.getText());
                ps.setString(2, txtmodel.getText());
                ps.setString(3, txtculoare.getText());
                ps.setString(4, txtan_fabricatie.getText());
                ps.setString(5, txtconsum.getText());
                ps.setString(6, txtpret.getText());

                InputStream img = new FileInputStream(new File(ImgPath));
                ps.setBlob(7, img);
                ps.executeUpdate();
                //Show_Products_In_JTable();

                JOptionPane.showMessageDialog(null, "Date introduse");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }

    }//GEN-LAST:event_btnadaugareActionPerformed

    private void btnactualizareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizareActionPerformed

        if(checkInputs() && txtid.getText() != null)
        {
            String UpdateQuery = null;
            PreparedStatement ps = null;
            Connection con = getConnection();
            if(ImgPath == null)
            {
                try {
                    UpdateQuery = "UPDATE vizualizare SET marca = ?,model = ?,culoare = ?,an_fabricatie = ?,consum = ?,pret = ?"
                    + "WHERE id = ?";
                    ps = con.prepareStatement(UpdateQuery);

                    ps.setString(1, txtmarca.getText());
                    ps.setString(2, txtmodel.getText());
                    ps.setString(3, txtculoare.getText());
                    ps.setString(4, txtan_fabricatie.getText());
                    ps.setString(5, txtconsum.getText());
                    ps.setString(6, txtpret.getText());

                    ps.setInt(7, Integer.parseInt(txtid.getText()));

                    ps.executeUpdate();
                    //Show_Products_In_JTable();
                    JOptionPane.showMessageDialog(null, "Produs actualizat");

                } catch (SQLException ex) {
                    Logger.getLogger(adaugare.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            else{
                try{
                    InputStream img = new FileInputStream(new File(ImgPath));

                    UpdateQuery = "UPDATE vizualizare SET marca = ?,model = ?,culoare = ?,an_fabricatie = ?,consum = ?,pret = ?"
                    + ", imagine = ? WHERE id = ?";

                    ps = con.prepareStatement(UpdateQuery);

                    ps.setString(1, txtmarca.getText());
                    ps.setString(2, txtmodel.getText());
                    ps.setString(3, txtculoare.getText());
                    ps.setString(4, txtan_fabricatie.getText());
                    ps.setString(5, txtconsum.getText());
                    ps.setString(6, txtpret.getText());

                    ps.setBlob(7, img);

                    ps.setInt(8, Integer.parseInt(txtid.getText()));

                    ps.executeUpdate();
                    //Show_Products_In_JTable();
                    JOptionPane.showMessageDialog(null, "Produs actualizat");

                }catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }

    }//GEN-LAST:event_btnactualizareActionPerformed

    private void btnstergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstergereActionPerformed

        if(!txtid.getText().equals(""))
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("DELETE FROM vizualizare WHERE id = ?");
                int id = Integer.parseInt(txtid.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                //Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null, "Produs sters");
            } catch (SQLException ex) {
                Logger.getLogger(adaugare.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Produsul nu a fost sters");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Produsul nu a fost sters,nu ati introdus id-ul");
        }

    }//GEN-LAST:event_btnstergereActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        JFrame frmLogin_System = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frmLogin_System, "Confirmati daca vreti sa iesiti!", "Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();

        First_page.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adaugare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adaugare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizare;
    private javax.swing.JButton btnadaugare;
    private javax.swing.JButton btnalegere;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnstergere;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblan_fabricatie;
    private javax.swing.JLabel lblconsum;
    private javax.swing.JLabel lblculoare;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblimagine;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JLabel lblpret;
    private javax.swing.JTextField txtan_fabricatie;
    private javax.swing.JTextField txtconsum;
    private javax.swing.JTextField txtculoare;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtpret;
    // End of variables declaration//GEN-END:variables
}
