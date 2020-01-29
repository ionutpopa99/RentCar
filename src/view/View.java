/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import first_page.First_page;
import date_personale.Date_personale;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        Show_Products_In_JTable();
    }
    int pos=0;
    String ImgPath = null;
    
    public Connection getConnection()
    {
        Connection con = null;
        
       
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/inchirieri","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);

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
    
    public ArrayList<Views> getProductList()
    {
            ArrayList<Views> productList  = new ArrayList<Views>();
            Connection con = getConnection();
            String query = "SELECT * FROM vizualizare";
            
            Statement st;
            ResultSet rs;
            
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            Views product;
            
            while(rs.next())
            {
                product = new Views(rs.getInt("id"),rs.getString("marca"),rs.getString("model"),rs.getString("culoare"),rs.getInt("an_fabricatie"),rs.getInt("consum"),Float.parseFloat(rs.getString("pret")),rs.getBytes("imagine"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList; 
                
    }
    
     public void Show_Products_In_JTable()
    {
        ArrayList<Views> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getMarca();
            row[2] = list.get(i).getModel();
            row[3] = list.get(i).getCuloare();
            row[4] = list.get(i).getAn_fabricatie();
            row[5] = list.get(i).getConsum();
            row[6] = list.get(i).getPret();
            
            model.addRow(row);
        }
    
    }
    
    
    public void ShowItem(int index)
    {
            txtid.setText(Integer.toString(getProductList().get(index).getId()));
            txtmarca.setText(getProductList().get(index).getMarca());
            txtmodel.setText(getProductList().get(index).getModel());
            txtculoare.setText(getProductList().get(index).getCuloare());
            txtan_fabricatie.setText(Integer.toString(getProductList().get(index).getAn_fabricatie()));
            txtconsum.setText(Float.toString (getProductList().get(index).getConsum()));
            txtpret.setText(Float.toString(getProductList().get(index).getPret()));
            
       
        
        lblimg.setIcon(ResizeImage(null, getProductList().get(index).getImagine()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        lblmodel = new javax.swing.JLabel();
        lblculoare = new javax.swing.JLabel();
        lblan_fabricatie = new javax.swing.JLabel();
        lblconsum = new javax.swing.JLabel();
        lblpret = new javax.swing.JLabel();
        lblimagine = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtculoare = new javax.swing.JTextField();
        txtan_fabricatie = new javax.swing.JTextField();
        txtconsum = new javax.swing.JTextField();
        txtpret = new javax.swing.JTextField();
        lblimg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnurmator = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btninchiriere = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("Id:");

        lblmarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmarca.setText("Marca:");

        lblmodel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmodel.setText("Model:");

        lblculoare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblculoare.setText("Culoare:");

        lblan_fabricatie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblan_fabricatie.setText("An fabricatie:");

        lblconsum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblconsum.setText("Consum:");

        lblpret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpret.setText("Pret:");

        lblimagine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblimagine.setText("Imagine:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
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

        lblimg.setBackground(new java.awt.Color(153, 204, 255));
        lblimg.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca", "Model", "Culoare", "An fabricatie", "Consum/100km", "Pret/zi"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnurmator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnurmator.setText("Urmator");
        btnurmator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnurmatorActionPerformed(evt);
            }
        });

        btnanterior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnanterior.setText("Anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btninchiriere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btninchiriere.setText("Inchiriere");
        btninchiriere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninchiriereActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("Iesire");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblimagine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblpret, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblconsum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblan_fabricatie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblculoare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmodel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtpret, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtconsum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtan_fabricatie, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtculoare, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmodel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btnurmator)
                                .addGap(43, 43, 43)
                                .addComponent(btnanterior)
                                .addGap(47, 47, 47)
                                .addComponent(btninchiriere)
                                .addGap(69, 69, 69))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmarca)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmodel)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblculoare)
                            .addComponent(txtculoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblan_fabricatie)
                            .addComponent(txtan_fabricatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblconsum)
                            .addComponent(txtconsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpret)
                            .addComponent(txtpret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblimagine))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnurmator)
                            .addComponent(btnanterior)
                            .addComponent(btninchiriere))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnexit))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtculoareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtculoareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtculoareActionPerformed

    private void btnurmatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnurmatorActionPerformed
        
        pos++;
        
        if(pos>=getProductList().size()){
            pos=getProductList().size()-1;
        }
        ShowItem(pos);
    }//GEN-LAST:event_btnurmatorActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int index = jTable1.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        
        pos--;
        if(pos<0){
            pos=0;
        }
        ShowItem(pos);
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        
        JFrame frmLogin_System = new JFrame("Exit");
	if(JOptionPane.showConfirmDialog(frmLogin_System, "Confirmati daca vreti sa iesiti!", "Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btninchiriereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninchiriereActionPerformed
        this.hide();
        //Date_personale info = new Date_personale();
        Date_personale.main(null);
            
    }//GEN-LAST:event_btninchiriereActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninchiriere;
    private javax.swing.JButton btnurmator;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
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
