/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek;

import com.kkp.sipenalek.project.DaftarPekerjaan;
import com.kkp.sipenalek.project.ProjectCreate;
import com.kkp.sipenalek.master.MasterPosition;
import com.kkp.sipenalek.master.MasterUser;
import com.kkp.sipenalek.master.MasterEmployee;
import com.kkp.sipenalek.report.*;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
    	getContentPane().setBackground(new Color(255, 255, 255));
        this.name = UserSession.emp_name;
        this.nik = UserSession.nik;
        this.role = UserSession.role;
        this.pos = UserSession.pos;
        initComponents();
        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        master = new javax.swing.JMenu();
        position = new javax.swing.JMenuItem();
        employee = new javax.swing.JMenuItem();
        user = new javax.swing.JMenuItem();
        project = new javax.swing.JMenu();
        create = new javax.swing.JMenuItem();
        approvalBudget = new javax.swing.JMenuItem();
        approval = new javax.swing.JMenuItem();
        revision = new javax.swing.JMenuItem();
        report = new javax.swing.JMenu();
        rPos = new javax.swing.JMenuItem();
        rEmp = new javax.swing.JMenuItem();
        rUser = new javax.swing.JMenuItem();
        rAPrj = new javax.swing.JMenuItem();
        rN1Prj = new javax.swing.JMenuItem();
        rN2Prj = new javax.swing.JMenuItem();
        options = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        master.setText("Utama");

        position.setText("Posisi");
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        master.add(position);

        employee.setText("Pegawai");
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        master.add(employee);

        user.setText("Pengguna");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        master.add(user);

        jMenuBar1.add(master);

        project.setText("Proyek");

        create.setText("Buat Proyek");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        project.add(create);

        approvalBudget.setText("Persetujuan Anggaran");
        approvalBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalBudgetActionPerformed(evt);
            }
        });
        project.add(approvalBudget);

        approval.setText("Persetujuan Kepala Divisi");
        approval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalActionPerformed(evt);
            }
        });
        project.add(approval);

        revision.setText("Revisi Proyek");
        revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisionActionPerformed(evt);
            }
        });
        project.add(revision);

        jMenuBar1.add(project);

        report.setText("Laporan");

        rPos.setText("Posisi");
        rPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPosActionPerformed(evt);
            }
        });
        report.add(rPos);

        rEmp.setText("Pegawai");
        rEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmpActionPerformed(evt);
            }
        });
        report.add(rEmp);

        rUser.setText("Pengguna");
        rUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserActionPerformed(evt);
            }
        });
        report.add(rUser);

        rAPrj.setText("Proyek Aktif");
        rAPrj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAPrjActionPerformed(evt);
            }
        });
        report.add(rAPrj);

        rN1Prj.setText("Persetujuan Anggaran");
        rN1Prj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	rN1PrjActionPerformed(evt);
            }
        });
        report.add(rN1Prj);

        rN2Prj.setText("Persetujuan Kepala Divisi");
        rN2Prj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	rN2PrjActionPerformed(evt);
            }
        });
        report.add(rN2Prj);
        
        jMenuBar1.add(report);

        options.setText("Setelan");

        logout.setText("Keluar");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        options.add(logout);

        jMenuBar1.add(options);

        setJMenuBar(jMenuBar1);
        
        JLabel lblWelcome = new JLabel("SELAMAT DATANG DI SIPENALEK");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblUser = new JLabel("Halo "+name+", anda login sebagai "+role);
        lblUser.setHorizontalAlignment(SwingConstants.CENTER);
        lblUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
        
        background = new JLabel("");
        background.setIcon(new ImageIcon(getClass().getResource("/bg.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(100)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(5)
        			.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void approvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalActionPerformed
        // TODO add your handling code here:
        if(role.equals("Approver")){
            DaftarPekerjaan daftarPekerjaan = new DaftarPekerjaan("PERSETUJUAN KEPALA DIVISI");
            daftarPekerjaan.setLocationRelativeTo(null);
            daftarPekerjaan.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_approvalActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
        if(role.equals("Admin")){
            MasterPosition masterPos = new MasterPosition();
            masterPos.setLocationRelativeTo(null);
            masterPos.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_positionActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
        if(role.equals("Admin")){
            MasterEmployee masterEmployee = new MasterEmployee();
            masterEmployee.setLocationRelativeTo(null);
            masterEmployee.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_employeeActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        if(role.equals("Admin")){
            MasterUser masterUser = new MasterUser();
            masterUser.setLocationRelativeTo(null);
            masterUser.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_userActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Anda Berhasil Keluar!");
        this.setVisible(false); //you can't see me!
        this.dispose(); //Destroy the JFrame object
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);  
    }//GEN-LAST:event_logoutActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        if(role.equals("PIC")){
            ProjectCreate projectCreate = new ProjectCreate();
            projectCreate.setLocationRelativeTo(null);
            projectCreate.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_createActionPerformed

    private void revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisionActionPerformed
        // TODO add your handling code here:
        if(role.equals("PIC")){
            DaftarPekerjaan daftarPekerjaan = new DaftarPekerjaan("REVISI PROYEK");
            daftarPekerjaan.setLocationRelativeTo(null);
            daftarPekerjaan.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_revisionActionPerformed

    private void approvalBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalBudgetActionPerformed
        // TODO add your handling code here:
        if(role.equals("Budget")){
            DaftarPekerjaan daftarPekerjaan = new DaftarPekerjaan("PERSETUJUAN ANGGARAN");
            daftarPekerjaan.setLocationRelativeTo(null);
            daftarPekerjaan.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Akses Untuk Halaman Ini!");
        }
    }//GEN-LAST:event_approvalBudgetActionPerformed

    private void rPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPosActionPerformed
        // TODO add your handling code here:
        ReportPosition report = new ReportPosition();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rPosActionPerformed

    private void rEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmpActionPerformed
        // TODO add your handling code here:
        ReportEmployee report = new ReportEmployee();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rEmpActionPerformed

    private void rUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserActionPerformed
        // TODO add your handling code here:
        ReportUser report = new ReportUser();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rUserActionPerformed

    private void rAPrjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAPrjActionPerformed
        // TODO add your handling code here:
        ReportProjectAktif report = new ReportProjectAktif();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rAPrjActionPerformed

    private void rN1PrjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rN1PrjActionPerformed
        // TODO add your handling code here:
    	ReportProjectApprovalBudget report = new ReportProjectApprovalBudget();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rN1PrjActionPerformed

    private void rN2PrjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rN2PrjActionPerformed
        // TODO add your handling code here:
    	ReportProjectApprovalKadiv report = new ReportProjectApprovalKadiv();
        report.setLocationRelativeTo(null);
        report.setVisible(true); 
    }//GEN-LAST:event_rN2PrjActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem approval;
    private javax.swing.JMenuItem approvalBudget;
    private javax.swing.JMenuItem create;
    private javax.swing.JMenuItem employee;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu master;
    private javax.swing.JMenu options;
    private javax.swing.JMenuItem position;
    private javax.swing.JMenu project;
    private javax.swing.JMenuItem rAPrj;
    private javax.swing.JMenuItem rEmp;
    private javax.swing.JMenuItem rN1Prj;
    private javax.swing.JMenuItem rN2Prj;
    private javax.swing.JMenuItem rPos;
    private javax.swing.JMenuItem rUser;
    private javax.swing.JMenu report;
    private javax.swing.JMenuItem revision;
    private javax.swing.JMenuItem user;
    // End of variables declaration//GEN-END:variables
    
    final String name;
    final String nik;
    final String role;
    final String pos;
    
    private javax.swing.JOptionPane JOptionPane;
    private JLabel lblNewLabel;
    private JLabel background;
}
