/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek.project;

import com.kkp.sipenalek.ComboBoxItem;
import com.kkp.sipenalek.DBConnection;
import com.kkp.sipenalek.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.text.*;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class ProjectCreate extends javax.swing.JFrame {

    /**
     * Creates new form ProjectCreate
     */
    public ProjectCreate() {
    	getContentPane().setBackground(new Color(255, 255, 255));
        this.name = UserSession.emp_name;
        initComponents();
        
        setResizable(false);
        
        DBConnection DB = new DBConnection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        try {
            populateComboBox();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pNumberInp = new javax.swing.JTextField();
        pNameInp = new javax.swing.JTextField();
        pDateInp = new javax.swing.JTextField();
        noteInp = new javax.swing.JTextField();
        commentInp = new javax.swing.JTextField();
        pmInp = new javax.swing.JComboBox<>();
        speInp = new javax.swing.JComboBox<>();
        mainMenu = new javax.swing.JButton();
        mainMenu.setForeground(new Color(255, 255, 255));
        saveButton = new javax.swing.JButton();
        saveButton.setForeground(new Color(255, 255, 255));
        jLabel10 = new javax.swing.JLabel();
        setUpFormats();
        amountInp = new javax.swing.JFormattedTextField(amountFormat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Project Create");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PROJECT NUMBER");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PROJECT NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PROJECT DATE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PROJECT MANAGER");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PROJECT PIC");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("NOTES");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("COMMENT");

        pmInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmInpActionPerformed(evt);
            }
        });

        mainMenu.setBackground(new Color(80, 187, 0));
        mainMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainMenu.setText("MAIN MENU");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        saveButton.setBackground(new Color(80, 187, 0));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setText("AJUKAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("BUDGET");

        amountInp.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                amountInpInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mainMenu)
                                        .addGap(61, 61, 61))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pDateInp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pmInp, javax.swing.GroupLayout.Alignment.TRAILING, 0, 187, Short.MAX_VALUE)
                                        .addComponent(speInp, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(noteInp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(commentInp, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(saveButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pNumberInp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(pNameInp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountInp, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pNumberInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pNameInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(amountInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pDateInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pmInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(speInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(noteInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(commentInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenu)
                    .addComponent(saveButton))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mainMenuActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            save();
            clear();
            JOptionPane.showMessageDialog(null, "Project Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Project Gagal Disimpan, "+ e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void pmInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmInpActionPerformed

    private void amountInpInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_amountInpInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_amountInpInputMethodTextChanged
    public void clear() {
        pNumberInp.setText("");
        pNameInp.setText("");
        amountInp.setText("0");
        pDateInp.setText("");
        noteInp.setText("");
        pmInp.setSelectedIndex(0);
        speInp.setSelectedIndex(0);
        commentInp.setText("");
    }
    
    public void save() throws SQLException {
        sql = "INSERT INTO prj_project_main(project_number, project_name, amount, project_date, notes, pm_id, pm_name, spe_id, spe_name, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pstat = con.prepareStatement(sql, stat.RETURN_GENERATED_KEYS);

        pstat.setString(1, pNumberInp.getText());
        pstat.setString(2, pNameInp.getText());
        pstat.setString(3, amountInp.getText());
        pstat.setString(4, pDateInp.getText());
        pstat.setString(5, noteInp.getText());
        pstat.setInt(6, pm.get(pmInp.getSelectedItem().toString()));
        pstat.setString(7, pmInp.getSelectedItem().toString());
        pstat.setInt(8, spe.get(speInp.getSelectedItem().toString()));
        pstat.setString(9, speInp.getSelectedItem().toString());
        pstat.setString(10, "Approval Budget");
        pstat.executeUpdate();

        try (ResultSet generatedKeys = pstat.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                int projectId = generatedKeys.getInt(1);
                sql = "INSERT INTO prj_project_comment(project_id, commenter_name, comment, response) VALUES (?, ?, ?, ?)";
                pstat = con.prepareStatement(sql);
                
                pstat.setInt(1, projectId);
                pstat.setString(2, name);
                pstat.setString(3, commentInp.getText());
                pstat.setString(4, "Ajukan");
                pstat.executeUpdate();
            }
            else {
                JOptionPane.showMessageDialog(null, "Gagal Mendapat ID Project!");
            }
        }
    }
    
    public void populateComboBox(){
        pm = getComboBoxData("SELECT emp.id, emp.name FROM ms_employee emp JOIN ms_role r ON emp.ms_role_id = r.id WHERE r.name = 'PIC' ORDER BY emp.name ASC");
        for(String s : pm.keySet()){
            pmInp.addItem(s);
        }
        
        spe = getComboBoxData("SELECT emp.id, emp.name FROM ms_employee emp JOIN ms_role r ON emp.ms_role_id = r.id WHERE r.name = 'Employee' ORDER BY emp.name ASC");
        for(String s : spe.keySet()){
            speInp.addItem(s);
        }
    }
    
    public HashMap<String, Integer> getComboBoxData(String query){
      HashMap<String, Integer> map = new HashMap<>();

       try {
           rs = stat.executeQuery(query);
           ComboBoxItem cmi;
           int i = 0;
           while(rs.next()){
               cmi = new ComboBoxItem(rs.getInt(1), rs.getString(2));
               map.put(cmi.getLabel(), cmi.getId());
           }

       } catch (SQLException ex) {

       }

       return map;
    }
    
    private void setUpFormats() {
        amountFormat = NumberFormat.getNumberInstance();
    }
    
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
            java.util.logging.Logger.getLogger(ProjectCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField amountInp;
    private javax.swing.JTextField commentInp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton mainMenu;
    private javax.swing.JTextField noteInp;
    private javax.swing.JTextField pDateInp;
    private javax.swing.JTextField pNameInp;
    private javax.swing.JTextField pNumberInp;
    private javax.swing.JComboBox<String> pmInp;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> speInp;
    // End of variables declaration//GEN-END:variables

    //initialize SQL Connection  
    private Connection con;
    private Statement stat;
    private PreparedStatement pstat;
    private ResultSet rs;
    private String sql;
    private HashMap<String, Integer> pm;
    private HashMap<String, Integer> spe;
    final String name;
    //JPane
    private javax.swing.JOptionPane JOptionPane;
    private NumberFormat amountFormat;
}
