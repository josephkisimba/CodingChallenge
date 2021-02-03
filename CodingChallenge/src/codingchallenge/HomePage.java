package codingchallenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author for sale pc
 */
public class HomePage extends javax.swing.JFrame {

    //vairable declaration
    String gender;//used for radiobutton
    String occ;//use for combobox
    String stat;//used for combox

    /**
     *
     */
    public HomePage() {
        initComponents();
        show_user();//calling the show user to show data in the table
    }

    //-------------Creating the Arraylist ---------------------------------
    public ArrayList<User> userList() {

        ArrayList<User> userList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false", "root", "Adolphhk07");//Establish the connection the DB  

            String sql = "select * from userinfo";// ceating sql command to select data

            Statement stm = con.createStatement();//creating the stament
            ResultSet rst = stm.executeQuery(sql);//executing the stmt

            User user;
            //-------creating the while loop  ---------------
            while (rst.next()) {
                user = new User(rst.getInt("registNo"), rst.getString("name"), rst.getString("surname"), rst.getString("gender"), rst.getInt("phoneNo"), rst.getString("email"), rst.getString("occupation"), rst.getString("status"));//parametrs of the table
                userList.add(user);//adding user to the user list

            }//end while

        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;

    }//end ArrayList

    //---------showing user in the table---------------
    public void show_user() {

        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) dbTable.getModel();
        Object[] row = new Object[8];//setting the size
        //-------for statement -------------------
        for (int i = 0; i < list.size(); i++) {

            //-------Adding each data to his row----------
            row[0] = list.get(i).getReg();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getSurname();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getPhone();
            row[5] = list.get(i).getEmail();
            row[6] = list.get(i).getOccu();
            row[7] = list.get(i).getStatus();
            model.addRow(row);

        }//end for

    }// end show_user

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        occLabel = new javax.swing.JLabel();
        statLabel = new javax.swing.JLabel();
        regTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        surnameTextField = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        occComboBox = new javax.swing.JComboBox<>();
        statComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regLabel.setText("RegNo");

        nameLabel.setText("Name");

        surnameLabel.setText("Surname");

        genderLabel.setText("Gender");

        phoneLabel.setText("PhoneNo");

        emailLabel.setText("Email");

        occLabel.setText("Occupation");

        statLabel.setText("Status");

        regTextField.setToolTipText("");

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setText("MALE");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setText("FEMALE");

        occComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "EMPLOYED", "UN-EMPLOYED", "RETIRED" }));

        statComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "MARRIED", "DIVORCED" }));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        newButton.setText("NEW");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "registNo", "name", "surname", "gender", "phoneNo", "email", "occupation", "status"
            }
        ));
        jScrollPane3.setViewportView(dbTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(occLabel)
                            .addComponent(statLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(33, 33, 33)
                                .addComponent(newButton))
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(genderLabel))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateButton)
                                .addGap(31, 31, 31)
                                .addComponent(deleteButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(femaleRadioButton))
                                    .addComponent(surnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(emailTextField)
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(occComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regLabel)
                    .addComponent(regTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(femaleRadioButton)
                    .addComponent(maleRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occLabel)
                    .addComponent(occComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statLabel)
                    .addComponent(statComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(newButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateButton)
                        .addComponent(deleteButton)))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //-------------Declare variable use for REGEX-----------------------
        String regis = regTextField.getText();
        String name1 = nameTextField.getText();
        String surname1 = nameTextField.getText();
        String phone = phoneTextField.getText();
        String mail = emailTextField.getText();
        //---------------------------------------------------------------- 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false", "root", "Adolphhk07");//Establish the connection the DB
            //---------Creating the condition before executing the insert command---------------
            String sql1 = "select * from userinfo where registNo=?";

            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setInt(1, Integer.parseInt(regTextField.getText()));//taking parameters from the registeer No textfield
            ResultSet rst = pst1.executeQuery();

            if (!rst.next()) {
                String sql = "insert into userinfo(registNo, name, surname, gender, phoneNo, email, occupation, status) values (?,?,?,?,?,?,?,?);";//Creating the sql commande
                PreparedStatement pst = con.prepareStatement(sql);//statement
                //----------------REGEX condition  and Taking parameter from the textfield----------------------------------------      
                if (regis.matches("[1-2]\\d{6}")) {

                    pst.setInt(1, Integer.parseInt(regTextField.getText()));

                } else {
                    JOptionPane.showMessageDialog(null, "All registration numbers must be 7 digits and start with a 1 or 2");
                }

                if (name1.matches("[A-Z][a-zA-Z]*")) {

                    pst.setString(2, nameTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect format on Name");
                }
                if (surname1.matches("[A-Z][a-zA-Z]*")) {

                    pst.setString(3, surnameTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect format on Surname");
                }
                //---------------------------------------------------------------------------

                //--------Taking selection from radiobutton------------------- 
                if (maleRadioButton.isSelected()) {

                    gender = "MALE";
                } else if (femaleRadioButton.isSelected()) {

                    gender = "FEMALE";

                }

                pst.setString(4, gender);
                //--------------------------------------------------------------------------------------  
                if (phone.matches("[0]\\d{9}")) {

                    pst.setInt(5, Integer.parseInt(phoneTextField.getText()));

                } else {
                    JOptionPane.showMessageDialog(null, "Number must be 10 digit and start with 0 ");
                }

                if (mail.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {

                    pst.setString(6, emailTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Enter the Correct format of email!! eg. jkm@gmail.com or 1234@jk.za.az");
                }

                //-----COMBOBOX selection-------------------------------- 
                occ = occComboBox.getSelectedItem().toString();//converting the selected iemto toString
                pst.setString(7, occ);
                stat = statComboBox.getSelectedItem().toString();//converting the selected iemto toString
                pst.setString(8, stat);

                pst.executeUpdate();//executing e update
                JOptionPane.showMessageDialog(this, "Insertion Succesfully");
                DefaultTableModel mdel = (DefaultTableModel) dbTable.getModel();//getting table model
                mdel.setRowCount(0);//emptying the rows in the table
                show_user();//calling the show user again after emptying the table

            } else {
                JOptionPane.showMessageDialog(this, "User with the same Registration number is already existing in the DB");

                con.close();

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_addButtonActionPerformed
    //end  addButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

        //-----------Emptying the textfield-----------
        regTextField.setText("");
        nameTextField.setText("");
        surnameTextField.setText("");
        buttonGroup1.clearSelection();
        phoneTextField.setText("");
        emailTextField.setText("");
        occComboBox.setSelectedIndex(0);
        statComboBox.setSelectedIndex(0);

        //----------------------------------------
    }//GEN-LAST:event_newButtonActionPerformed
    //end newButtonActionPerformed

    /**
     *
     * @param evt
     */
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        //-------------Declare variable use for REGEX-----------------------
        String regis = regTextField.getText();
        String name1 = nameTextField.getText();
        String surname1 = nameTextField.getText();
        String phone = phoneTextField.getText();
        String mail = emailTextField.getText();
        //---------------------------------------------------------------- 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false", "root", "Adolphhk07");//Establish the connection the DB
            //---------Creating the condition before executing the update command---------------
            String sql1 = "select * from userinfo where registNo=?";

            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setInt(1, Integer.parseInt(regTextField.getText()));//taking parameters from the registeer No textfield
            ResultSet rst = pst1.executeQuery();

            if (rst.next()) {

                String sql = "update userinfo set name=?,surname=?, gender=?, phoneNo=?, email=?, occupation=?, status=? where registNo=? ;";//Creating the update sql commande
                PreparedStatement pst = con.prepareStatement(sql);//statement

                //----------Taking parameter from the textfield, combobox and radiobutton---------------
                if (name1.matches("[A-Z][a-zA-Z]*")) {

                    pst.setString(1, nameTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect format on Name");
                }
                if (surname1.matches("[A-Z][a-zA-Z]*")) {

                    pst.setString(2, surnameTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect format on Surname");
                }
                //---------------------------------------------------------------------------

                //--------Taking selection from radiobutton------------------- 
                if (maleRadioButton.isSelected()) {

                    gender = "MALE";
                } else if (femaleRadioButton.isSelected()) {

                    gender = "FEMALE";

                }

                pst.setString(3, gender);
                //--------------------------------------------------------------------------------------  
                if (phone.matches("[0]\\d{9}")) {

                    pst.setInt(4, Integer.parseInt(phoneTextField.getText()));

                } else {
                    JOptionPane.showMessageDialog(null, "Phone Number must be 10 digit and start with 0 ");
                }

                if (mail.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {

                    pst.setString(5, emailTextField.getText());

                } else {
                    JOptionPane.showMessageDialog(null, "Enter the Correct format of email!! eg. jkm@gmail.com or 1234@jk.za.az");
                }

                //-----COMBOBOX selection-------------------------------- 
                occ = occComboBox.getSelectedItem().toString();//converting the selected iemto toString
                pst.setString(6, occ);
                stat = statComboBox.getSelectedItem().toString();//converting the selected iemto toString
                pst.setString(7, stat);

                if (regis.matches("[1-2]\\d{6}")) {

                    pst.setInt(8, Integer.parseInt(regTextField.getText()));

                } else {
                    JOptionPane.showMessageDialog(null, "All registration numbers must be 7 digits and start with a 1 or 2");
                }
                //------------------------------------------------------------------  

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Succesfully");
                DefaultTableModel mdel = (DefaultTableModel) dbTable.getModel();//getting table model
                mdel.setRowCount(0);//emptying the rows in the table
                show_user();//calling the show user again after emptying the table

            } else {
                JOptionPane.showMessageDialog(this, "No match with the registration number provided");
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateButtonActionPerformed
    //end updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false", "root", "Adolphhk07");//creating the connection to the DB

            //---------Creating the condition before executing the delete command---------------
            String sql1 = "select * from userinfo where registNo=?";//creating the sql command

            PreparedStatement pst1 = con.prepareStatement(sql1);//
            pst1.setInt(1, Integer.parseInt(regTextField.getText()));//taking parameters from the registeer No textfield
            ResultSet rst = pst1.executeQuery();
            //--Start if statement-------
            if (rst.next()) {
                String sql = "delete from userinfo where registNo=?;";//creating the delete sql command

                PreparedStatement pst = con.prepareStatement(sql);//statement

                pst.setInt(1, Integer.parseInt(regTextField.getText()));//taking parameters from the registeer No textfield
                pst.executeUpdate();//executing the update
                JOptionPane.showMessageDialog(this, "Deleted Succesfully");
                DefaultTableModel mdel = (DefaultTableModel) dbTable.getModel();//getting table model
                mdel.setRowCount(0);//emptying the rows in the table
                show_user();//calling the show user again after emptying the table
            }//end if
            else {
                JOptionPane.showMessageDialog(this, "This registration number does not exist");//error message

                con.close();

            }//end else

        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable dbTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JComboBox<String> occComboBox;
    private javax.swing.JLabel occLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel regLabel;
    private javax.swing.JTextField regTextField;
    private javax.swing.JComboBox<String> statComboBox;
    private javax.swing.JLabel statLabel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
