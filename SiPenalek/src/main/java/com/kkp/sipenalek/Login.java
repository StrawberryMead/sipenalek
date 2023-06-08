/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek;
import java.lang.Exception;  
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Dell
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        
        DBConnection DB = new DBConnection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
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
        jPanel1.setBackground(new Color(80, 187, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(255, 255, 255));
        unameInput = new javax.swing.JTextField();
        passInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        loginButton.setForeground(new Color(255, 255, 255));
        cancelButton = new javax.swing.JButton();
        cancelButton.setForeground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        unameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameInputActionPerformed(evt);
            }
        });

        loginButton.setBackground(new Color(80, 187, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setText("MASUK");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new Color(80, 187, 0));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setText("BATAL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(57)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel2))
        					.addGap(18, 21, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(unameInput, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        						.addComponent(passInput)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
        					.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
        			.addGap(77))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(156, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addGap(129))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(9)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(unameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(passInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameInputActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String unameValue = unameInput.getText();        //get user entered username from the userField  
        String passValue = passInput.getText();        //get user entered pasword from the passField
        try {
            sql = "SELECT u.*, emp.name, emp.nik, r.name as role, pos.name as pos FROM ms_user u JOIN ms_employee emp ON u.ms_employee_id = emp.id JOIN ms_role r ON emp.ms_role_id = r.id JOIN ms_pos pos ON emp.ms_pos_id = pos.id WHERE u.uname='"+unameValue+"' AND u.pass='"+passValue+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(unameValue.equals(rs.getString("uname")) && passValue.equals(rs.getString("pass"))){
                    
                    UserSession.emp_id = rs.getInt("ms_employee_id");
                    UserSession.emp_name = rs.getString("name");
                    UserSession.nik = rs.getString("nik");
                    UserSession.u_id = rs.getInt("id");
                    UserSession.u_name = rs.getString("uname");
                    UserSession.role = rs.getString("role");
                    UserSession.pos = rs.getString("pos");
                    
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.setVisible(false); //you can't see me!
                    this.dispose(); //Destroy the JFrame object
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.setLocationRelativeTo(null);
                    mainMenu.setVisible(true);  
                    
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Please enter valid username and password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        unameInput.setText("");  
        passInput.setText("");   
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passInput;
    private javax.swing.JTextField unameInput;
    // End of variables declaration//GEN-END:variables
    
    //initialize SQL Connection  
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private String sql;
    
    //JPane
    private javax.swing.JOptionPane JOptionPane;
}
