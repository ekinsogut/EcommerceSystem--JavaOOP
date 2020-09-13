package Frames;
import Models.Seller;
import Models.Category;
import Models.Product;
import Operations.DatabaseOperations;
import Patterns.ContextStrategy;
import Patterns.ContextFacade;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ProductPage extends javax.swing.JFrame {
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //Strategy
    ContextStrategy productDel = new ContextStrategy(new Product());
    
    //Facade
    ContextFacade sellerBring = new ContextFacade();
    ContextFacade categoryBring = new ContextFacade();
    ContextFacade productBring = new ContextFacade();

    
    DefaultTableModel model_product;
    DefaultTableModel model_category;
    DefaultTableModel model_seller;

    /*When the page is first opened, the components and the icon of the project are taken.
    The models belonging to the seller, category and product tables are created and displayed 
    when the program is opened for the first time with the view function.*/
    public ProductPage() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        model_product = (DefaultTableModel) product_table.getModel();
        model_category = (DefaultTableModel) category_table.getModel();
        model_seller = (DefaultTableModel) seller_table.getModel();
        productView();
        categoryView();
        sellerView();
    }
    
    //With the productView method, the existing data on our table is printed with the for loop.
    public void productView() {
        
        model_product.setRowCount(0);
        ArrayList<Product> product = new ArrayList<Product>();
        product = productBring.bringProduct(); //Facade
        
        if (product != null) {
            
            for(Product productvalue : product) {
                Object[] additive = {productvalue.getProduct_id(),productvalue.getName(),productvalue.getCategory_id(),productvalue.getStock(),productvalue.getPrice(),productvalue.getSeller_id()};
                model_product.addRow(additive);
            }
        }
    }
    
    //With the categoryView method, the existing data on our table is printed with the for loop.
    public void categoryView() {
        
        model_category.setRowCount(0);
        ArrayList<Category> category = new ArrayList<Category>();
        category = categoryBring.bringCategory(); //Facade
        
        if (category != null) {
            
            for(Category categoryvalue : category) {
                Object[] additive = {categoryvalue.getCategory_id(),categoryvalue.getName()};
                model_category.addRow(additive);
            }
        }
    }
    
    //With the sellerView method, the existing data on our table is printed with the for loop.
    public void sellerView() {
        
        model_seller.setRowCount(0);
        ArrayList<Seller> seller = new ArrayList<Seller>();
        seller = sellerBring.bringSeller(); //Facade
        
        if (seller != null) {
            
            for(Seller sellervalue : seller) {
                Object[] additive = {sellervalue.getSeller_id(),sellervalue.getName()};
                model_seller.addRow(additive);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        stock_area = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        price_area = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        seller_area = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        message_label = new javax.swing.JLabel();
        name_area = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        category_area = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        category_table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        seller_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(1000, 690));

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        jLabel6.setBackground(new java.awt.Color(12, 75, 96));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        product_table.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        product_table.setForeground(new java.awt.Color(12, 75, 96));
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product_id", "product_name", "category_id", "stock", "price", "seller_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane2.setViewportView(product_table);
        if (product_table.getColumnModel().getColumnCount() > 0) {
            product_table.getColumnModel().getColumn(0).setResizable(false);
            product_table.getColumnModel().getColumn(1).setResizable(false);
            product_table.getColumnModel().getColumn(2).setResizable(false);
            product_table.getColumnModel().getColumn(3).setResizable(false);
            product_table.getColumnModel().getColumn(4).setResizable(false);
            product_table.getColumnModel().getColumn(5).setResizable(false);
        }

        stock_area.setBackground(new java.awt.Color(204, 255, 204));
        stock_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        stock_area.setForeground(new java.awt.Color(12, 75, 96));
        stock_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 75, 96));
        jLabel3.setText("Stock");

        price_area.setBackground(new java.awt.Color(204, 255, 204));
        price_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        price_area.setForeground(new java.awt.Color(12, 75, 96));
        price_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 75, 96));
        jLabel4.setText("Price");

        seller_area.setBackground(new java.awt.Color(204, 255, 204));
        seller_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        seller_area.setForeground(new java.awt.Color(12, 75, 96));
        seller_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 75, 96));
        jLabel5.setText("Seller");

        message_label.setBackground(new java.awt.Color(204, 255, 204));
        message_label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        message_label.setForeground(new java.awt.Color(12, 75, 96));

        name_area.setBackground(new java.awt.Color(204, 255, 204));
        name_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        name_area.setForeground(new java.awt.Color(12, 75, 96));
        name_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        name_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_areaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 75, 96));
        jLabel1.setText("Name");

        category_area.setBackground(new java.awt.Color(204, 255, 204));
        category_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        category_area.setForeground(new java.awt.Color(12, 75, 96));
        category_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 75, 96));
        jLabel2.setText("Category");

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(12, 75, 96));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 255, 204));
        update.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        update.setForeground(new java.awt.Color(12, 75, 96));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 255, 204));
        delete.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(12, 75, 96));
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(204, 255, 204));
        back.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(12, 75, 96));
        back.setText("Back");
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 75, 96), 1, true));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        search_field.setBackground(new java.awt.Color(204, 255, 204));
        search_field.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        search_field.setForeground(new java.awt.Color(12, 75, 96));
        search_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        search_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_fieldKeyReleased(evt);
            }
        });

        category_table.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        category_table.setForeground(new java.awt.Color(12, 75, 96));
        category_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "category_id", "category_name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        category_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(category_table);
        if (category_table.getColumnModel().getColumnCount() > 0) {
            category_table.getColumnModel().getColumn(0).setResizable(false);
            category_table.getColumnModel().getColumn(1).setResizable(false);
        }

        seller_table.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        seller_table.setForeground(new java.awt.Color(12, 75, 96));
        seller_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "seller_id", "seller_name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        seller_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seller_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(seller_table);
        if (seller_table.getColumnModel().getColumnCount() > 0) {
            seller_table.getColumnModel().getColumn(0).setResizable(false);
            seller_table.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 75, 96));
        jLabel7.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price_area, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock_area, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seller_area, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category_area, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(stock_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seller_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //All information are taken from the user and other tables. And adding to the database is performed
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        message_label.setText("");
        
        String name = name_area.getText();
        String category = category_area.getText();
        String stock = stock_area.getText();
        String price = price_area.getText();
        String seller = seller_area.getText();

        if(name.trim().equals("") || category.trim().equals("") || stock.trim().equals("") || price.trim().equals("") || seller.trim().equals("")) {
        
            message_label.setText("Please enter value!");
            
        } else {
            
            int categoryIn = Integer.parseInt(category);
            int stockIn = Integer.parseInt(stock);
            int priceIn = Integer.parseInt(price);
            int sellerIn = Integer.parseInt(seller);

            Product productinfo = new Product(name, categoryIn, stockIn, priceIn, sellerIn);
            
            databaseOperations.productAdd(productinfo);
            productView();
            
            message_label.setText("New product added");
            
            name_area.setText("");
            category_area.setText("");
            stock_area.setText("");
            price_area.setText("");
            seller_area.setText("");
        }

        
    }//GEN-LAST:event_addActionPerformed

    /*All information of a selected row in the table comes to our text area 
    and after it is edited, the update process is performed.*/
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       
        String name = name_area.getText();
        String category = category_area.getText();
        String stock = stock_area.getText();
        String price = price_area.getText();
        String seller = seller_area.getText();
        
        int selectedrow = product_table.getSelectedRow();
        
        if(name.trim().equals("") || category.trim().equals("") || stock.trim().equals("") || price.trim().equals("") || seller.trim().equals("")) {
        
            message_label.setText("Please enter value!");
            
        } 
        else {
        
            if(selectedrow == -1) {

                if(model_product.getRowCount() == 0) {

                    message_label.setText("Product table is empty");
                }
                else {

                    message_label.setText("Choose an product to update");
                }
            }
            else {
                
                int categoryIn = Integer.parseInt(category);
                int stockIn = Integer.parseInt(stock);
                int priceIn = Integer.parseInt(price);
                int sellerIn = Integer.parseInt(seller);

                int id = (int)model_product.getValueAt(selectedrow, 0);

                Product productinfo = new Product(id, name, categoryIn, stockIn, priceIn, sellerIn);
                
                databaseOperations.productUpdate(productinfo);
                productView();
                message_label.setText("Product successfully updated");
            }
        } 
    }//GEN-LAST:event_updateActionPerformed

    //Codes required to go back to the adminHome page
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        AdminHome adminhome = new AdminHome();
        setVisible(false);
        adminhome.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    //When clicking on any row in the table, the name of that row appears in our text field.
    private void category_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category_tableMouseClicked
        
        int selectedRow = category_table.getSelectedRow();

        category_area.setText(model_category.getValueAt(selectedRow, 0).toString());  
    }//GEN-LAST:event_category_tableMouseClicked

    //When clicking on any row in the table, the name of that row appears in our text field.
    private void seller_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seller_tableMouseClicked
        
        int selectedRow = seller_table.getSelectedRow();
        
        seller_area.setText(model_seller.getValueAt(selectedRow, 0).toString());
    }//GEN-LAST:event_seller_tableMouseClicked

    //When clicking on any row in the table, the name of that row appears in our text field.
    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        
        int selectedRow = product_table.getSelectedRow();
        name_area.setText(model_product.getValueAt(selectedRow, 1).toString());
        category_area.setText(model_product.getValueAt(selectedRow, 2).toString());
        stock_area.setText(model_product.getValueAt(selectedRow, 3).toString());
        price_area.setText(model_product.getValueAt(selectedRow, 4).toString());
        seller_area.setText(model_product.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_product_tableMouseClicked

    //A row is selected in the table and the information of the selected row is deleted from the database.
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        message_label.setText("");
        
        int selectedrow = product_table.getSelectedRow();
       
        if (selectedrow == -1) {
            if (model_product.getRowCount() == 0 ) {
                message_label.setText("Product table is empty");
            }
            else {
                message_label.setText("Select a product to be deleted");
            }
        }
        else {
            
            int id = (int)model_product.getValueAt(selectedrow,0);
            
            //Strategy
            productDel.executeStrategy(id);
            productView();
            message_label.setText("Product deleted"); 
        } 
    }//GEN-LAST:event_deleteActionPerformed

    //Codes required to search on the model of our product table
    public void searchfunc(String search) {
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model_product);
        product_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }
    
    private void search_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_fieldKeyReleased
        
        String search = search_field.getText();
        
        searchfunc(search);
    }//GEN-LAST:event_search_fieldKeyReleased

    private void name_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_areaActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField category_area;
    private javax.swing.JTable category_table;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel message_label;
    private javax.swing.JTextField name_area;
    private javax.swing.JTextField price_area;
    private javax.swing.JTable product_table;
    private javax.swing.JTextField search_field;
    private javax.swing.JTextField seller_area;
    private javax.swing.JTable seller_table;
    private javax.swing.JTextField stock_area;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
