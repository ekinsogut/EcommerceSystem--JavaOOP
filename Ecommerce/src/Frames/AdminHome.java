package Frames;

import Operations.DatabaseOperations;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class AdminHome extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    //When the page is first opened, the components and the icon of the project are taken
    public AdminHome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        product_button = new javax.swing.JButton();
        category_button = new javax.swing.JButton();
        seller_button = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(1000, 670));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 75, 96));
        jLabel1.setText("Select the action you want to do !!");

        product_button.setBackground(new java.awt.Color(204, 255, 204));
        product_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        product_button.setForeground(new java.awt.Color(12, 75, 96));
        product_button.setText("Product");
        product_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_buttonActionPerformed(evt);
            }
        });

        category_button.setBackground(new java.awt.Color(204, 255, 204));
        category_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        category_button.setForeground(new java.awt.Color(12, 75, 96));
        category_button.setText("Category");
        category_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        category_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_buttonActionPerformed(evt);
            }
        });

        seller_button.setBackground(new java.awt.Color(204, 255, 204));
        seller_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        seller_button.setForeground(new java.awt.Color(12, 75, 96));
        seller_button.setText("Seller");
        seller_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        seller_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_buttonActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(204, 255, 204));
        logout.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        logout.setForeground(new java.awt.Color(12, 75, 96));
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(category_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seller_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(product_button, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(category_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seller_button, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        jLabel2.setBackground(new java.awt.Color(12, 75, 96));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Codes required to go to the seller page
    private void seller_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_buttonActionPerformed
        
        
        SellerPage sellerpage = new SellerPage();
        setVisible(false);
        sellerpage.setVisible(true);
        
    }//GEN-LAST:event_seller_buttonActionPerformed

    //Codes required to go to the category page
    private void category_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_buttonActionPerformed
        
        
        CategoryPage categorypage = new CategoryPage();
        setVisible(false);
        categorypage.setVisible(true);
    }//GEN-LAST:event_category_buttonActionPerformed

    //Codes required to go to the product page
    private void product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_buttonActionPerformed
        
        try {
            ProductPage productpage = new ProductPage();
            setVisible(false);
            productpage.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_product_buttonActionPerformed

    //Codes required to go back to the main page
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        Main mainpage = new Main();
        setVisible(false);
        mainpage.setVisible(true);
        
        
    }//GEN-LAST:event_logoutActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton category_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton product_button;
    private javax.swing.JButton seller_button;
    // End of variables declaration//GEN-END:variables
}
