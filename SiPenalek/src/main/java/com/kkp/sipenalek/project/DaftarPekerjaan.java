/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek.project;
import com.kkp.sipenalek.project.ProjectRevision;
import com.kkp.sipenalek.project.ProjectApproveProject;
import com.kkp.sipenalek.project.ProjectApproveBudget;
import com.kkp.sipenalek.DBConnection;
import com.kkp.sipenalek.DBConnection;
import com.kkp.sipenalek.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
/**
 *
 * @author Dell
 */
public class DaftarPekerjaan extends javax.swing.JFrame {

    /**
     * Creates new form DaftarPekerjaan
     */
    public DaftarPekerjaan(String status) {
    	getContentPane().setBackground(new Color(255, 255, 255));
        this.name = UserSession.emp_name;
        this.nik = UserSession.nik;
        this.role = UserSession.role;
        this.pos = UserSession.pos;
        this.status = status;
        initComponents();

        setResizable(false);
        
        DBConnection DB = new DBConnection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        try {
            display();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan "+e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDaftarPekerjaan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        process = new javax.swing.JButton();
        process.setForeground(new Color(255, 255, 255));
        MainMenu = new javax.swing.JButton();
        MainMenu.setForeground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDaftarPekerjaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PROJECT NUMBER", "PROJECT NAME", "BUDGET", "PROJECT DATE", "STATUS"
            }
        ));
        tableDaftarPekerjaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDaftarPekerjaanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDaftarPekerjaan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DAFTAR PEKERJAAN");

        process.setBackground(new Color(80, 187, 0));
        process.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        process.setText("PROSES");
        process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processActionPerformed(evt);
            }
        });

        MainMenu.setBackground(new Color(80, 187, 0));
        MainMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MainMenu.setText("MAIN MENU");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        
        if(this.status == "Revisi") {
        	this.jenisPekerjaan = "DAFTAR REVISI";
        }else {
        	this.jenisPekerjaan = this.status.toUpperCase();
        }
    	JLabel jLabelJenisPekerjaan = new JLabel(this.jenisPekerjaan);
        jLabelJenisPekerjaan.setFont(new Font("Segoe UI", Font.BOLD, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(MainMenu)
        							.addGap(18)
        							.addComponent(process)
        							.addGap(0, 389, Short.MAX_VALUE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(224)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelJenisPekerjaan)
        						.addComponent(jLabel1))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelJenisPekerjaan)
        			.addGap(15)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(process)
        				.addComponent(MainMenu))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDaftarPekerjaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDaftarPekerjaanMouseClicked
        // TODO add your handling code here:
        int row = tableDaftarPekerjaan.getSelectedRow();
        this.projectId = (Integer)tableDaftarPekerjaan.getValueAt(row, 0);
    }//GEN-LAST:event_tableDaftarPekerjaanMouseClicked

    private void processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processActionPerformed
        // TODO add your handling code here:
        if(status.equals("Revisi")){
            ProjectRevision pekerjaan = new ProjectRevision(projectId);
            pekerjaan.setLocationRelativeTo(null);
            pekerjaan.setVisible(true); 
            dispose();
        }else if(status.equals("Approval Budget")){
            ProjectApproveBudget pekerjaan = new ProjectApproveBudget(projectId);
            pekerjaan.setLocationRelativeTo(null);
            pekerjaan.setVisible(true); 
            dispose();
        }else if(status.equals("Approval Project")){
            ProjectApproveProject pekerjaan = new ProjectApproveProject(projectId);
            pekerjaan.setLocationRelativeTo(null);
            pekerjaan.setVisible(true); 
            dispose();           
        }
    }//GEN-LAST:event_processActionPerformed

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_MainMenuActionPerformed
    private void display() throws SQLException {
        while (tableDaftarPekerjaan.getRowCount() > 0) {
            ((javax.swing.table.DefaultTableModel) tableDaftarPekerjaan.getModel()).removeRow(0);
        }
        
        sql = "SELECT id, project_number, project_name, amount, project_date, status FROM prj_project_main WHERE status = '"+status+"';";
        rs = stat.executeQuery(sql);
        int columns = rs.getMetaData().getColumnCount();
        while (rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((javax.swing.table.DefaultTableModel) tableDaftarPekerjaan.getModel()).insertRow(rs.getRow() - 1,row);
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
            java.util.logging.Logger.getLogger(DaftarPekerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarPekerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarPekerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarPekerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarPekerjaan(status).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton process;
    private javax.swing.JTable tableDaftarPekerjaan;
    // End of variables declaration//GEN-END:variables
    
    final String name;
    final String nik;
    final String role;
    final String pos;
    final String status;
    
    private Connection con;
    private Statement stat;
    private PreparedStatement pstat;
    private ResultSet rs;
    private String sql;
    private HashMap<String, Integer> emp;
    //JPane
    private javax.swing.JOptionPane JOptionPane;
    
    private int projectId;
    private String jenisPekerjaan;
}
