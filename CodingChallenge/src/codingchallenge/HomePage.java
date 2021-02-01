/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author for sale pc
 */
public class HomePage extends javax.swing.JFrame {
    String gender;
    String occ;
    String stat;
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regLabel.setText("RegNo");

        nameLabel.setText("Name");

        surnameLabel.setText("Surname");

        genderLabel.setText("Gender");

        phoneLabel.setText("PhoneNo");

        emailLabel.setText("Email");

        occLabel.setText("Occupation");

        statLabel.setText("Status");

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setText("MALE");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regLabel)
                    .addComponent(nameLabel)
                    .addComponent(surnameLabel)
                    .addComponent(genderLabel)
                    .addComponent(phoneLabel)
                    .addComponent(emailLabel)
                    .addComponent(occLabel)
                    .addComponent(statLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(33, 33, 33)
                        .addComponent(newButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(regTextField)
                                .addComponent(nameTextField)
                                .addComponent(surnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteButton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(femaleRadioButton))
                                    .addComponent(statComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(occComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(updateButton)
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regLabel)
                    .addComponent(regTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(newButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false","root","Adolphhk07");
            
            String sql ="insert into userinfo(registNo, name, surname, gender, phoneNo, email, occupation, status) values (?,?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(regTextField.getText()) );
           pst.setString(2,nameTextField.getText() );
           pst.setString(3,surnameTextField.getText() );
           
           if(maleRadioButton.isSelected()){
               
               gender = "MALE";
           }
           else if (femaleRadioButton.isSelected()){
               
               gender = "FEMALE";
               
           }
            
          pst.setString(4,gender ); 
          pst.setInt(5, Integer.parseInt(phoneTextField.getText()) );
          pst.setString(6,emailTextField.getText());
          
          occ = occComboBox.getSelectedItem().toString();
          pst.setString(7,occ);
          stat = statComboBox.getSelectedItem().toString();
          pst.setString(8,stat);
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this,"Insertion Succesfully");
          con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        
        regTextField.setText("");
        nameTextField.setText("");
        surnameTextField.setText("");
        buttonGroup1.clearSelection();
        phoneTextField.setText("");
        emailTextField.setText("");
        occComboBox.setSelectedIndex(0);
        statComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_newButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false","root","Adolphhk07");
            
            String sql= "update userinfo set name=?,surname=?, gender=?, phoneNo=?, email=?, occupation=?, status=? where registNo=? ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nameTextField.getText());
            pst.setString(2,surnameTextField.getText() );
            if(maleRadioButton.isSelected()){
               
               gender = "MALE";
           }
           else if (femaleRadioButton.isSelected()){
               
               gender = "FEMALE";
               
           }
            
          pst.setString(3,gender ); 
          pst.setInt(4, Integer.parseInt(phoneTextField.getText()) );
          pst.setString(5,emailTextField.getText());
          
          occ = occComboBox.getSelectedItem().toString();
          pst.setString(6,occ);
          stat = statComboBox.getSelectedItem().toString();
          pst.setString(7,stat);
          pst.setInt(8, Integer.parseInt(regTextField.getText()) );
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this,"Updated Succesfully");
           con.close(); 
           
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSS=false","root","Adolphhk07");
            
            String sql = "delete from userinfo where registNo=? ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nameTextField.getText());
            pst.executeUpdate();
          JOptionPane.showMessageDialog(this,"Deleted Succesfully");
          con.close();   
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

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
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
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
