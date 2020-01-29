/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reduceri;

import date_personale.Date_personale;
import first_page.First_page;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class reduceri extends javax.swing.JFrame {

    /**
     * Creates new form reduceri
     */
    public reduceri() {
        initComponents();
        Show_Products_In_JTable();
    }
    int pos=0;
    String ImgPath = null;
    public Connection getConnection()
    {
        Connection con = null;
        
       
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/reduceri","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(reduceri.class.getName()).log(Level.SEVERE, null, ex);

            return null;
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
    
    
    public ArrayList<red> getProductList()
    {
            ArrayList<red> productList  = new ArrayList<red>();
            Connection con = getConnection();
            String query = "SELECT * FROM reduceri";
            
            Statement st;
            ResultSet rs;
            
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            red product;
            
            while(rs.next())
            {
                product = new red(rs.getInt("id"),rs.getString("marca"),rs.getString("model"),rs.getString("culoare"),rs.getInt("an_fabricatie"),rs.getInt("consum"), (int) Float.parseFloat(rs.getString("pret")),Float.parseFloat(rs.getString("pret_redus")),rs.getBytes("imagine"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(red.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList; 
                
    }
    
     public void Show_Products_In_JTable()
    {
        ArrayList<red> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getMarca();
            row[2] = list.get(i).getModel();
            row[3] = list.get(i).getCuloare();
            row[4] = list.get(i).getAn_fabricatie();
            row[5] = list.get(i).getConsum();
            row[6] = list.get(i).getPret();
            row[7] = list.get(i).getPret_redus();
            
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
            txtconsum.setText(Float.toString(getProductList().get(index).getConsum()));
            txtpret.setText(Float.toString(getProductList().get(index).getPret()));
            txtpret_redus.setText(Float.toString(getProductList().get(index).getPret_redus()));
            
       
        
        lblimg.setIcon(ResizeImage(null, getProductList().get(index).getImagine()));
    }
    
    
    
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
        lblpret_redus = new javax.swing.JLabel();
        lblimagine = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtculoare = new javax.swing.JTextField();
        txtan_fabricatie = new javax.swing.JTextField();
        txtconsum = new javax.swing.JTextField();
        txtpret = new javax.swing.JTextField();
        txtpret_redus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

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

        lblpret_redus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpret_redus.setText("Pret redus:");

        lblimagine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblimagine.setText("Imagine:");

        lblimg.setBackground(new java.awt.Color(153, 255, 153));
        lblimg.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca", "Model", "Culoare", "An fabricatie", "Consum", "Pret", "Pret redus"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Urmator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Inchiriere");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Iesire");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Inapoi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblid)
                    .addComponent(lblmarca)
                    .addComponent(lblmodel)
                    .addComponent(lblculoare)
                    .addComponent(lblan_fabricatie)
                    .addComponent(lblconsum)
                    .addComponent(lblpret)
                    .addComponent(lblpret_redus)
                    .addComponent(lblimagine))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(txtmodel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpret_redus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpret, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtan_fabricatie)
                    .addComponent(txtconsum)
                    .addComponent(txtculoare)
                    .addComponent(lblimg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(88, 88, 88))))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmarca)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmodel)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblculoare)
                            .addComponent(txtculoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblan_fabricatie)
                            .addComponent(txtan_fabricatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblconsum)
                            .addComponent(txtconsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpret)
                            .addComponent(txtpret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpret_redus)
                            .addComponent(txtpret_redus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblimagine)
                                .addGap(43, 43, 43)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         pos++;
        
        if(pos>=getProductList().size()){
            pos=getProductList().size()-1;
        }
        ShowItem(pos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pos--;
        if(pos<0){
            pos=0;
        }
        ShowItem(pos);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.hide();
        
        First_page.main(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        //Date_personale info = new Date_personale();
        Date_personale.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame frmLogin_System = new JFrame("Exit");
	if(JOptionPane.showConfirmDialog(frmLogin_System, "Confirmati daca vreti sa iesiti!", "Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(reduceri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reduceri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reduceri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reduceri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reduceri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel lblpret_redus;
    private javax.swing.JTextField txtan_fabricatie;
    private javax.swing.JTextField txtconsum;
    private javax.swing.JTextField txtculoare;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtpret;
    private javax.swing.JTextField txtpret_redus;
    // End of variables declaration//GEN-END:variables
}
