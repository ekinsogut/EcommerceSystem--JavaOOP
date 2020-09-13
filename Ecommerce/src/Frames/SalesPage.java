package Frames;
import Models.Category;
import Models.Sales;
import Operations.DatabaseOperations;
import Patterns.ContextStrategy;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SalesPage extends javax.swing.JFrame {

    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //Strategy
    ContextStrategy salesDel = new ContextStrategy(new Sales());
    
    DefaultTableModel model;
    ArrayList<String> list;
    
    /*When the page is first opened, the components and the icon of the project are taken.
    The model belonging to the seller table is created and displayed 
    when the program is opened for the first time with the view function.*/
    public SalesPage(ArrayList<String> list) {
        this.list = list;
     
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        model = (DefaultTableModel) sales_table.getModel();
        salesView();
    }
    
    //With the salesView method, the existing data on our table is printed with the for loop.
    public void salesView() {

        model.setRowCount(0);
        ArrayList<Sales> sales = new ArrayList<Sales>();
        
        int selectedRow = sales_table.getSelectedRow();
        
        sales = databaseOperations.salesBring(Integer.parseInt(list.get(1)));
        
        if (sales != null) {
            
            for(Sales salesvalue : sales) {
            
                
                Object[] additive = {salesvalue.getSales_id(),salesvalue.getCustomer_id(),salesvalue.getProduct_id(),salesvalue.getName(),salesvalue.getTotal_price(),salesvalue.getPiece()};
                model.addRow(additive);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        delete_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        message_label = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1220, 100));

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sales_id", "customer_id", "product_id", "name", "total_price", "piece"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sales_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_tableMouseClicked(evt);
            }
        });
        sales_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sales_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(sales_table);
        if (sales_table.getColumnModel().getColumnCount() > 0) {
            sales_table.getColumnModel().getColumn(0).setResizable(false);
            sales_table.getColumnModel().getColumn(1).setResizable(false);
            sales_table.getColumnModel().getColumn(2).setResizable(false);
            sales_table.getColumnModel().getColumn(3).setResizable(false);
            sales_table.getColumnModel().getColumn(4).setResizable(false);
            sales_table.getColumnModel().getColumn(5).setResizable(false);
        }

        delete_button.setBackground(new java.awt.Color(204, 255, 204));
        delete_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        delete_button.setForeground(new java.awt.Color(12, 75, 96));
        delete_button.setText("Delete the completed order");
        delete_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(204, 255, 204));
        exit_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        exit_button.setForeground(new java.awt.Color(12, 75, 96));
        exit_button.setText("Exit");
        exit_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        message_label.setBackground(new java.awt.Color(204, 255, 204));
        message_label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        message_label.setForeground(new java.awt.Color(12, 75, 96));

        refresh.setBackground(new java.awt.Color(204, 255, 204));
        refresh.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(12, 75, 96));
        refresh.setText("Refresh");
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sales_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sales_tableKeyReleased
        
        
        
        
        
    }//GEN-LAST:event_sales_tableKeyReleased

    //A row is selected in the table and the information of the selected row is deleted from the database.
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        
        message_label.setText("");
        
        int selectedrow = sales_table.getSelectedRow();
       
        if (selectedrow == -1) {
            if (model.getRowCount() == 0 ) {
                message_label.setText("Sales table is empty");
            }
            else {
                message_label.setText("Select a sales to be deleted");
            }
        }
        else {
            int id = (int)model.getValueAt(selectedrow,0);
            
            //Strategy
            salesDel.executeStrategy(id);
            salesView();
            message_label.setText("Sales deleted"); 
        } 
    }//GEN-LAST:event_delete_buttonActionPerformed

    //Exit
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_exit_buttonActionPerformed

    //When clicking on any row in the table, the name of that row appears in our text field.
    private void sales_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_tableMouseClicked
        
        int selectedRow = sales_table.getSelectedRow();
        
        message_label.setText("The product named " + model.getValueAt(selectedRow, 3).toString() + " will be sent to " + list.get(0) + " address within 3 days!");

    }//GEN-LAST:event_sales_tableMouseClicked

    //Run salesView method, the existing data on our table is printed with the for loop.
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        
        salesView();

    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message_label;
    private javax.swing.JButton refresh;
    private javax.swing.JTable sales_table;
    // End of variables declaration//GEN-END:variables
}
