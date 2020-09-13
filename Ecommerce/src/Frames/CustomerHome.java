package Frames;
import Models.Product;
import Patterns.ContextFacade;
import Models.Sales;
import Operations.DatabaseOperations;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class CustomerHome extends javax.swing.JFrame {

    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //Facade
    ContextFacade productBring = new ContextFacade();
    
    DefaultTableModel model_product;
    private ArrayList<Integer> customerInformation = new ArrayList<Integer>();
    
    /*When the page is first opened, the components and the icon of the project are taken 
    Arraylist information is received from the customerlogin screen. In addition, 
    models consisting of tables and view functions also work when the program is opened.*/
    public CustomerHome(ArrayList<Integer> customerInformation) {
        this.customerInformation = customerInformation;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
        customer_id_area.setText(String.valueOf(this.customerInformation.get(0)));
        credit_area.setText(String.valueOf(this.customerInformation.get(1)));
        model_product = (DefaultTableModel) product_table.getModel();
        productView();
        
    }
    
    //With the productView method, the existing data on our table is printed with the for loop.
    public void productView() {
        
        model_product.setRowCount(0);
        ArrayList<Product> product = new ArrayList<Product>();
        product = productBring.bringProduct();
        
        if (product != null) {
            
            for(Product productvalue : product) {
                Object[] additive = {productvalue.getProduct_id(),productvalue.getName(),productvalue.getStock(),productvalue.getPrice()};
                model_product.addRow(additive);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        total_price = new javax.swing.JLabel();
        piece = new javax.swing.JTextField();
        credit_area = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        my_sales = new javax.swing.JButton();
        sales_add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        message_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        product_id_area = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customer_id_area = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        product_name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        credit_add_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        credit_add_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        total_price.setBackground(new java.awt.Color(204, 255, 204));
        total_price.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        total_price.setForeground(new java.awt.Color(12, 75, 96));
        total_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        piece.setBackground(new java.awt.Color(204, 255, 204));
        piece.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        piece.setForeground(new java.awt.Color(12, 75, 96));
        piece.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        piece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pieceKeyReleased(evt);
            }
        });

        credit_area.setBackground(new java.awt.Color(204, 255, 204));
        credit_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        credit_area.setForeground(new java.awt.Color(12, 75, 96));
        credit_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 75, 96));
        jLabel6.setText("Name");

        my_sales.setBackground(new java.awt.Color(204, 255, 204));
        my_sales.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        my_sales.setForeground(new java.awt.Color(12, 75, 96));
        my_sales.setText("My Sales");
        my_sales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        my_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_salesActionPerformed(evt);
            }
        });

        sales_add.setBackground(new java.awt.Color(204, 255, 204));
        sales_add.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        sales_add.setForeground(new java.awt.Color(12, 75, 96));
        sales_add.setText("Sales Add");
        sales_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        sales_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_addActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 75, 96));
        jLabel8.setText("My Credit");

        product_table.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        product_table.setForeground(new java.awt.Color(12, 75, 96));
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product_id", "name", "stock", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        product_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(product_table);
        if (product_table.getColumnModel().getColumnCount() > 0) {
            product_table.getColumnModel().getColumn(0).setResizable(false);
            product_table.getColumnModel().getColumn(1).setResizable(false);
            product_table.getColumnModel().getColumn(2).setResizable(false);
            product_table.getColumnModel().getColumn(3).setResizable(false);
        }

        message_label.setBackground(new java.awt.Color(204, 255, 204));
        message_label.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        message_label.setForeground(new java.awt.Color(12, 75, 96));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 75, 96));
        jLabel3.setText("Customer ID");

        product_id_area.setBackground(new java.awt.Color(204, 255, 204));
        product_id_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        product_id_area.setForeground(new java.awt.Color(12, 75, 96));
        product_id_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 75, 96));
        jLabel4.setText("Product ID");

        customer_id_area.setBackground(new java.awt.Color(204, 255, 204));
        customer_id_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        customer_id_area.setForeground(new java.awt.Color(12, 75, 96));
        customer_id_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 75, 96));
        jLabel5.setText("Price");

        product_name.setBackground(new java.awt.Color(204, 255, 204));
        product_name.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        product_name.setForeground(new java.awt.Color(12, 75, 96));
        product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 75, 96));
        jLabel7.setText("Pieces");

        credit_add_field.setBackground(new java.awt.Color(204, 255, 204));
        credit_add_field.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        credit_add_field.setForeground(new java.awt.Color(12, 75, 96));
        credit_add_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 75, 96));
        jLabel1.setText("Credit Add");

        credit_add_button.setBackground(new java.awt.Color(204, 255, 204));
        credit_add_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        credit_add_button.setForeground(new java.awt.Color(12, 75, 96));
        credit_add_button.setText("Credit Add");
        credit_add_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        credit_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit_add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(my_sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sales_add, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(credit_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(piece, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(credit_add_field)
                                    .addComponent(product_id_area, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(product_name, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(customer_id_area, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(total_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(credit_area))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(piece, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(credit_area, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(credit_add_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(my_sales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit_add_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sales_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void product_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_tableKeyReleased
        
        
        
        
    }//GEN-LAST:event_product_tableKeyReleased

    //When clicking on any row in the table, some information of that row appears in our text field.
    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        
        int selectedRow = product_table.getSelectedRow();
        
        product_id_area.setText(model_product.getValueAt(selectedRow, 0).toString());
        product_name.setText(model_product.getValueAt(selectedRow, 1).toString());
        total_price.setText(model_product.getValueAt(selectedRow, 3).toString());
        
    }//GEN-LAST:event_product_tableMouseClicked

    /*All information are taken from the customer and adding to the database is performed. 
     New credit and new stock are updated after the sales is created. */
    private void sales_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_addActionPerformed
        
        message_label.setText("");
        
        String customer_id = customer_id_area.getText();
        String product_id = this.product_id_area.getText();
        String product_name = this.product_name.getText();
        String piece = this.piece.getText();
        String total_price = this.total_price.getText();
        String credit = credit_area.getText();
        
        int selectedRow = product_table.getSelectedRow();
        
        if(customer_id.trim().equals("") || product_id.trim().equals("") || product_name.trim().equals("") || piece.trim().equals("") || total_price.trim().equals("") || credit.trim().equals("")) {
        
            message_label.setText("Please enter value!");
            
        } else {
            
            int customer_id_In = Integer.parseInt(customer_id);
            int product_id_In = Integer.parseInt(product_id);
            
            int pieceIn = Integer.parseInt(piece);
            int total_price_In = Integer.parseInt(total_price);
            int creditIn = Integer.parseInt(credit);
            
            int new_total = total_price_In * pieceIn;
            
            if (new_total > creditIn) {
            
                message_label.setText("Insufficient balance --> Total Price: " + new_total + " Your Credit " + creditIn);
            
            } else if (pieceIn <= 0) {
                
                message_label.setText("You must add at least one product");

            }       
            else {
                
                
                int new_credit = creditIn - new_total;
                

                Sales salesinfo = new Sales(customer_id_In, product_id_In, new_total, product_name, pieceIn);

                databaseOperations.salesAdd(salesinfo);
                
                message_label.setText("Succesful! New credit: " + new_credit);
                
                databaseOperations.newCredit(customer_id_In, new_credit);
                
                credit_area.setText(String.valueOf(new_credit));
                this.piece.setText("");
              
                //---------------
                
                String stock = model_product.getValueAt(selectedRow, 2).toString();
                
                int stockIn = Integer.parseInt(stock);
                int new_stock = stockIn - pieceIn;
                
                databaseOperations.newStock(new_stock, product_id_In);
                
                
            } 
        }
    }//GEN-LAST:event_sales_addActionPerformed

    private void pieceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pieceKeyReleased
 
        
    }//GEN-LAST:event_pieceKeyReleased

    //Codes required to go back to the salesPage page. Sales information is taken from this page.
    private void my_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_salesActionPerformed
        
        ArrayList<String> list = databaseOperations.getCustomerSalesInfo(Integer.parseInt(customer_id_area.getText()));

        SalesPage salespage = new SalesPage(list);
        salespage.setVisible(true);
        
        my_sales.setEnabled(false);
        
    }//GEN-LAST:event_my_salesActionPerformed

    //The customer can add credit with this method.
    private void credit_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit_add_buttonActionPerformed
        
        
        String credit_add = credit_add_field.getText();
        
        if(credit_add.trim().equals("")){
        
            
            message_label.setText("Please enter value!");

        }
        else {
            
            int credit_addIn = Integer.parseInt(credit_add);
        
            String credit = credit_area.getText();
            int creditIn = Integer.parseInt(credit);

            int new_credit_value = creditIn + credit_addIn;

            databaseOperations.newCredit(this.customerInformation.get(0), new_credit_value);

            message_label.setText("Credits added! New Credit: " + new_credit_value);

                
            credit_area.setText(String.valueOf(new_credit_value));
            credit_add_field.setText("");
        
        }        
    }//GEN-LAST:event_credit_add_buttonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton credit_add_button;
    private javax.swing.JTextField credit_add_field;
    private javax.swing.JTextField credit_area;
    private javax.swing.JLabel customer_id_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message_label;
    private javax.swing.JButton my_sales;
    private javax.swing.JTextField piece;
    private javax.swing.JLabel product_id_area;
    private javax.swing.JLabel product_name;
    private javax.swing.JTable product_table;
    private javax.swing.JButton sales_add;
    private javax.swing.JLabel total_price;
    // End of variables declaration//GEN-END:variables
}
