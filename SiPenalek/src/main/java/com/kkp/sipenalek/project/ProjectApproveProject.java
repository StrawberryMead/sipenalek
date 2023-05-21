/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek.project;

import com.kkp.sipenalek.DBConnection;
import com.kkp.sipenalek.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class ProjectApproveProject extends javax.swing.JFrame {

    /**
     * Creates new form ProjectCreate
     */
    public ProjectApproveProject(int projectId) {

        this.name = UserSession.emp_name;
        this.nik = UserSession.nik;
        this.role = UserSession.role;
        this.pos = UserSession.pos;
        
        this.projectId = projectId;
        initComponents();
        
        DBConnection DB = new DBConnection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        try {
            display();
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
        daftarPekerjaan = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        revision = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComment = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        pmInp = new javax.swing.JTextField();
        speInp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amountInp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Project Approval");

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

        pNumberInp.setEditable(false);

        pNameInp.setEditable(false);

        pDateInp.setEditable(false);

        noteInp.setEditable(false);

        daftarPekerjaan.setBackground(new java.awt.Color(204, 204, 204));
        daftarPekerjaan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        daftarPekerjaan.setText("DAFTAR PEKERJAAN");
        daftarPekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarPekerjaanActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setText("SETUJU");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        revision.setBackground(new java.awt.Color(204, 204, 204));
        revision.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        revision.setText("REVISI");
        revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisionActionPerformed(evt);
            }
        });

        tableComment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal", "Nama", "Komentar", "Respon"
            }
        ));
        jScrollPane1.setViewportView(tableComment);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("COMMENT HISTORY");

        pmInp.setEditable(false);

        speInp.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("BUDGET");

        amountInp.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(daftarPekerjaan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(revision)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(90, 90, 90)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pNameInp, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                            .addComponent(pNumberInp)))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(commentInp)
                                    .addComponent(noteInp)
                                    .addComponent(pDateInp)
                                    .addComponent(pmInp)
                                    .addComponent(speInp)
                                    .addComponent(amountInp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(revision)
                    .addComponent(daftarPekerjaan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarPekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarPekerjaanActionPerformed
        // TODO add your handling code here:
        returnToDaftarPekerjaan();
    }//GEN-LAST:event_daftarPekerjaanActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            save();
            returnToDaftarPekerjaan();
            JOptionPane.showMessageDialog(null, "Approval Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Approval Gagal Disimpan, "+ e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisionActionPerformed
        // TODO add your handling code here:
        try {
            revision();
            returnToDaftarPekerjaan();
            JOptionPane.showMessageDialog(null, "Approval Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Approval Gagal Disimpan, "+ e.getMessage());
        }
    }//GEN-LAST:event_revisionActionPerformed
    public void clear() {
        pNumberInp.setText("");
        pNameInp.setText("");
        amountInp.setText("0");
        pDateInp.setText("");
        noteInp.setText("");
        pmInp.setText("");
        speInp.setText("");
        commentInp.setText("");
    }
    
    public void returnToDaftarPekerjaan(){
        DaftarPekerjaan daftarPekerjaan = new DaftarPekerjaan("Approval Project");
        daftarPekerjaan.setLocationRelativeTo(null);
        daftarPekerjaan.setVisible(true); 
        dispose();
    }
    
    public void save() throws SQLException {
        sql = "UPDATE prj_project_main set status = ? WHERE id = ?";
        pstat = con.prepareStatement(sql);

        pstat.setString(1, "Aktif");
        pstat.setInt(2, projectId);
        pstat.executeUpdate();

        sql = "INSERT INTO prj_project_comment(project_id, commenter_name, comment, response) VALUES (?, ?, ?, ?)";
        pstat = con.prepareStatement(sql);
                
        pstat.setInt(1, projectId);
        pstat.setString(2, name);
        pstat.setString(3, commentInp.getText());
        pstat.setString(4, "Approved");
        pstat.executeUpdate();
    }
    
    public void revision() throws SQLException {
        sql = "UPDATE prj_project_main set status = ? WHERE id = ?";
        pstat = con.prepareStatement(sql);

        pstat.setString(1, "Revisi");
        pstat.setInt(2, projectId);
        pstat.executeUpdate();

        sql = "INSERT INTO prj_project_comment(project_id, commenter_name, comment, response) VALUES (?, ?, ?, ?)";
        pstat = con.prepareStatement(sql);
                
        pstat.setInt(1, projectId);
        pstat.setString(2, name);
        pstat.setString(3, commentInp.getText());
        pstat.setString(4, "Revisi");
        pstat.executeUpdate();
    }
      
    private void display() throws SQLException {
        while (tableComment.getRowCount() > 0) {
            ((javax.swing.table.DefaultTableModel) tableComment.getModel()).removeRow(0);
        }
        
        sql = "SELECT created_date, commenter_name, comment, response FROM prj_project_comment WHERE project_id = '"+projectId+"' ORDER BY id ASC;";
        rs = stat.executeQuery(sql);
        int columns = rs.getMetaData().getColumnCount();
        while (rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((javax.swing.table.DefaultTableModel) tableComment.getModel()).insertRow(rs.getRow() - 1,row);
        }
        
        
        sql = "SELECT * FROM prj_project_main WHERE id = '"+projectId+"' ORDER BY id ASC;";
        rs = stat.executeQuery(sql);
        while(rs.next()){
            pNumberInp.setText(rs.getString("project_number"));
            pNameInp.setText(rs.getString("project_name"));
            amountInp.setText(rs.getString("amount"));
            pDateInp.setText(rs.getString("project_date"));
            noteInp.setText(rs.getString("notes"));
            pmInp.setText(rs.getString("pm_name"));
            speInp.setText(rs.getString("spe_name"));
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ProjectApproveProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectApproveProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectApproveProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectApproveProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectApproveProject(projectId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountInp;
    private javax.swing.JTextField commentInp;
    private javax.swing.JButton daftarPekerjaan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noteInp;
    private javax.swing.JTextField pDateInp;
    private javax.swing.JTextField pNameInp;
    private javax.swing.JTextField pNumberInp;
    private javax.swing.JTextField pmInp;
    private javax.swing.JButton revision;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField speInp;
    private javax.swing.JTable tableComment;
    // End of variables declaration//GEN-END:variables

    //initialize SQL Connection  
    private Connection con;
    private Statement stat;
    private PreparedStatement pstat;
    private ResultSet rs;
    private String sql;
    final String name;
    final String nik;
    final String role;
    final String pos;
    
    final int projectId;
    //JPane
    private javax.swing.JOptionPane JOptionPane;
}