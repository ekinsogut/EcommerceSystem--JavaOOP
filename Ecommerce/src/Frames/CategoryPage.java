
package Frames;
import Operations.DatabaseOperations;
import java.util.ArrayList;
import Models.Category;
import Models.Seller;
import Patterns.ContextAdapter;
import Patterns.ContextStrategy;
import Patterns.ContextFacade;
import java.awt.Toolkit;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CategoryPage extends javax.swing.JFrame {
    
    DefaultTableModel model;
       
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //Strategy
    ContextStrategy categoryDel = new ContextStrategy(new Category());
    
    //Facade
    ContextFacade categoryBring = new ContextFacade();
    
    //Adapter
    ContextAdapter contextAdapter = new ContextAdapter("category");
    
    /*When the page is first opened, the components and the icon of the project are taken.
    The model belonging to the category table is created and displayed 
    when the program is opened for the first time with the view function.*/
    public CategoryPage() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        model = (DefaultTableModel) category_table.getModel();
        categoryView();
    }
    
    //With the categoryView method, the existing data on our table is printed with the for loop.
    public void categoryView() {
        
        model.setRowCount(0);
        ArrayList<Category> category = new ArrayList<Category>();
        category = categoryBring.bringCategory();
        
        if (category != null) {
            
            for(Category categoryvalue : category) {
            
                Object[] additive = {categoryvalue.getCategory_id(),categoryvalue.getName()};
                model.addRow(additive);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        back_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        category_table = new javax.swing.JTable();
        search_field = new javax.swing.JTextField();
        name_area = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        message_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(1000, 670));

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        jLabel2.setBackground(new java.awt.Color(12, 75, 96));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        back_button.setBackground(new java.awt.Color(204, 255, 204));
        back_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        back_button.setForeground(new java.awt.Color(12, 75, 96));
        back_button.setText("Back");
        back_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        add_button.setBackground(new java.awt.Color(204, 255, 204));
        add_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        add_button.setForeground(new java.awt.Color(12, 75, 96));
        add_button.setText("Add");
        add_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        delete_button.setBackground(new java.awt.Color(204, 255, 204));
        delete_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        delete_button.setForeground(new java.awt.Color(12, 75, 96));
        delete_button.setText("Delete");
        delete_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        update_button.setBackground(new java.awt.Color(204, 255, 204));
        update_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        update_button.setForeground(new java.awt.Color(12, 75, 96));
        update_button.setText("Update");
        update_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        category_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
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
        category_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        category_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(category_table);
        if (category_table.getColumnModel().getColumnCount() > 0) {
            category_table.getColumnModel().getColumn(0).setResizable(false);
            category_table.getColumnModel().getColumn(1).setResizable(false);
        }

        search_field.setBackground(new java.awt.Color(204, 255, 204));
        search_field.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        search_field.setForeground(new java.awt.Color(12, 75, 96));
        search_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 75, 96), 1, true));
        search_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_fieldKeyReleased(evt);
            }
        });

        name_area.setBackground(new java.awt.Color(204, 255, 204));
        name_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        name_area.setForeground(new java.awt.Color(12, 75, 96));
        name_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 75, 96));
        jLabel1.setText("Name");

        message_label.setBackground(new java.awt.Color(204, 255, 204));
        message_label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        message_label.setForeground(new java.awt.Color(12, 75, 96));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 75, 96));
        jLabel3.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(add_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    //When clicking on any row in the table, the name of that row appears in our text field.
    private void category_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category_tableMouseClicked

        int selectedRow = category_table.getSelectedRow();

        name_area.setText(model.getValueAt(selectedRow, 1).toString());
        
    }//GEN-LAST:event_category_tableMouseClicked

    //Name is taken from the user and adding to the database is performed with the adapter pattern.
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed

        message_label.setText("");

        String name = name_area.getText();

        if(name.trim().equals("")) {

            message_label.setText("Please enter value!");

        } else {
            
            contextAdapter.add("categoryAdd", name);
            categoryView();
            message_label.setText("New category added");
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    /*The name of a selected row in the table comes to our text area 
    and after it is edited, the update process is performed.*/
    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed

        String name = name_area.getText();

        int selectedrow = category_table.getSelectedRow();

        if(name.trim().equals("")) {

            message_label.setText("Please enter value!");

        }
        else {

            if(selectedrow == -1) {

                if(model.getRowCount() == 0) {

                    message_label.setText("Category table is empty");
                }
                else {

                    message_label.setText("Choose an category to update");
                }
            }
            else {

                int id = (int)model.getValueAt(selectedrow, 0);
                
                Category categoryinfo = new Category(id, name);

                databaseOperations.categoryUpdate(categoryinfo);
                categoryView();
                message_label.setText("Category successfully updated");
            }
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    //A row is selected in the table and the information of the selected row is deleted from the database.
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed

        message_label.setText("");

        int selectedrow = category_table.getSelectedRow();

        if (selectedrow == -1) {
            if (model.getRowCount() == 0 ) {
                message_label.setText("Category table is empty");
            }
            else {
                message_label.setText("Select a category to be deleted");
            }
        }
        else {
            int id = (int)model.getValueAt(selectedrow,0);
            
            //Strategy
            categoryDel.executeStrategy(id);
            categoryView();
            message_label.setText("Category deleted");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    //Codes required to search on the model of our category table
    public void searchfunc(String search) {
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        category_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }

    //Codes required to go back to the adminHome page
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed

        AdminHome adminhome = new AdminHome();
        setVisible(false);
        adminhome.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void search_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_fieldKeyReleased

        String search = search_field.getText();

        searchfunc(search);
    }//GEN-LAST:event_search_fieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back_button;
    private javax.swing.JTable category_table;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message_label;
    private javax.swing.JTextField name_area;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
