package Frames;
import Operations.DatabaseOperations;
import Models.Customer;
import Patterns.ContextFactory;
import Patterns.Factory;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerLogin extends javax.swing.JFrame {
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //Factory
    ContextFactory contextFactory = new ContextFactory();
    Factory factory = contextFactory.getFactory("CUSTOMER");

    //When the page is first opened, the components and the icon of the project are taken
    public CustomerLogin() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        login_email_area = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        login_password_area = new javax.swing.JPasswordField();
        back_button = new javax.swing.JButton();
        name_area = new javax.swing.JTextField();
        surname_area = new javax.swing.JTextField();
        gender_area = new javax.swing.JTextField();
        age_area = new javax.swing.JTextField();
        address_area = new javax.swing.JTextField();
        phone_area = new javax.swing.JTextField();
        tcno_area = new javax.swing.JTextField();
        mail_area = new javax.swing.JTextField();
        credit_area = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        message_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password_area = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        jLabel15.setBackground(new java.awt.Color(12, 75, 96));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Customer Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(12, 75, 96));
        jLabel13.setText("E-Mail");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(12, 75, 96));
        jLabel14.setText("Password");

        login_email_area.setBackground(new java.awt.Color(204, 255, 204));
        login_email_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        login_email_area.setForeground(new java.awt.Color(12, 75, 96));
        login_email_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        login_button.setBackground(new java.awt.Color(204, 255, 204));
        login_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        login_button.setForeground(new java.awt.Color(12, 75, 96));
        login_button.setText("Login");
        login_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        login_password_area.setBackground(new java.awt.Color(204, 255, 204));
        login_password_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        login_password_area.setForeground(new java.awt.Color(12, 75, 96));
        login_password_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

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

        name_area.setBackground(new java.awt.Color(204, 255, 204));
        name_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        name_area.setForeground(new java.awt.Color(12, 75, 96));
        name_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        surname_area.setBackground(new java.awt.Color(204, 255, 204));
        surname_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        surname_area.setForeground(new java.awt.Color(12, 75, 96));
        surname_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        gender_area.setBackground(new java.awt.Color(204, 255, 204));
        gender_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        gender_area.setForeground(new java.awt.Color(12, 75, 96));
        gender_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        age_area.setBackground(new java.awt.Color(204, 255, 204));
        age_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        age_area.setForeground(new java.awt.Color(12, 75, 96));
        age_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        address_area.setBackground(new java.awt.Color(204, 255, 204));
        address_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        address_area.setForeground(new java.awt.Color(12, 75, 96));
        address_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        phone_area.setBackground(new java.awt.Color(204, 255, 204));
        phone_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        phone_area.setForeground(new java.awt.Color(12, 75, 96));
        phone_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        tcno_area.setBackground(new java.awt.Color(204, 255, 204));
        tcno_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        tcno_area.setForeground(new java.awt.Color(12, 75, 96));
        tcno_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        mail_area.setBackground(new java.awt.Color(204, 255, 204));
        mail_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        mail_area.setForeground(new java.awt.Color(12, 75, 96));
        mail_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        credit_area.setBackground(new java.awt.Color(204, 255, 204));
        credit_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        credit_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        register_button.setBackground(new java.awt.Color(204, 255, 204));
        register_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        register_button.setForeground(new java.awt.Color(12, 75, 96));
        register_button.setText("Register");
        register_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        message_label.setBackground(new java.awt.Color(204, 255, 204));
        message_label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        message_label.setForeground(new java.awt.Color(12, 75, 96));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 75, 96));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 75, 96));
        jLabel4.setText("Surname");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 75, 96));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 75, 96));
        jLabel6.setText("Age");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 75, 96));
        jLabel7.setText("Address");

        password_area.setBackground(new java.awt.Color(204, 255, 204));
        password_area.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        password_area.setForeground(new java.awt.Color(12, 75, 96));
        password_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 75, 96)));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 75, 96));
        jLabel8.setText("Phone");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(12, 75, 96));
        jLabel9.setText("Tc No");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(12, 75, 96));
        jLabel10.setText("Mail");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(12, 75, 96));
        jLabel11.setText("Credit");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(12, 75, 96));
        jLabel12.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login_password_area, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(login_email_area))
                .addGap(189, 189, 189)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(phone_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcno_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mail_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(credit_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gender_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(age_area, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_area)
                            .addComponent(surname_area)
                            .addComponent(password_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_email_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(password_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_password_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gender_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(age_area, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phone_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tcno_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mail_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credit_area, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Customer registration and database adding
    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        
        message_label.setText("");
        
        String name = name_area.getText();
        String surname = surname_area.getText();
        String password = password_area.getText();
        String gender = gender_area.getText();
        String age = age_area.getText();
        String address = address_area.getText();
        String phone = phone_area.getText();
        String tcno = tcno_area.getText();
        String mail = mail_area.getText();
        String credit = credit_area.getText();
        
        int passwordIn = Integer.parseInt(password);
        int ageIn = Integer.parseInt(age);
        int creditIn = Integer.parseInt(credit);
        
        Customer customerinfo = new Customer(name, surname, passwordIn, gender, ageIn, address, phone, tcno, mail, creditIn);
        
        if(name.trim().equals("") || surname.trim().equals("") || password.trim().equals("") || gender.trim().equals("") || age.trim().equals("") || address.trim().equals("") || phone.trim().equals("") || tcno.trim().equals("") || mail.trim().equals("") || credit.trim().equals("") ) {
        
            message_label.setText("Please enter value!");
            
        }
        else {


            databaseOperations.customerAdd(customerinfo);

            message_label.setText("Succesful!");
        }
    }//GEN-LAST:event_register_buttonActionPerformed

    //Getting username and password from customer. Verifications. Performing login process with pattern. Go to customerhome page.
    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed

        
        message_label.setText("");
        
        String email = login_email_area.getText();
        String password = new String(login_password_area.getPassword());
        
        if(email.trim().equals("") || password.trim().equals("")) {
        
            message_label.setText("Please enter value!");
            
        }
        else {
            
            //Factory
            boolean success = factory.operationLogin(email, password);
            
            if (success) {
                
                ArrayList<Integer> list = new ArrayList<Integer>();
                
                list = databaseOperations.getCustomerProductInfo(email,password);

                CustomerHome customerhome = new CustomerHome(list);
                setVisible(false);
                customerhome.setVisible(true);

            }
            else {

                message_label.setText(" Connection Failed!");
        } 
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    //Codes required to go to the main page
    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        
        Main main = new Main();
        setVisible(false);
        main.setVisible(true);
        
    }//GEN-LAST:event_back_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_area;
    private javax.swing.JTextField age_area;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField credit_area;
    private javax.swing.JTextField gender_area;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField login_email_area;
    private javax.swing.JPasswordField login_password_area;
    private javax.swing.JTextField mail_area;
    private javax.swing.JLabel message_label;
    private javax.swing.JTextField name_area;
    private javax.swing.JPasswordField password_area;
    private javax.swing.JTextField phone_area;
    private javax.swing.JButton register_button;
    private javax.swing.JTextField surname_area;
    private javax.swing.JTextField tcno_area;
    // End of variables declaration//GEN-END:variables
}
