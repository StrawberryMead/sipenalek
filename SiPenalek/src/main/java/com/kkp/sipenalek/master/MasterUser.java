/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kkp.sipenalek.master;
import com.kkp.sipenalek.ComboBoxItem;
import com.kkp.sipenalek.DBConnection;
import com.kkp.sipenalek.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class MasterUser extends javax.swing.JFrame {

    /**
     * Creates new form MasterEmployee
     */
    public MasterUser() {
        initComponents();
        
        DBConnection DB = new DBConnection();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        try {
            display();
            populateComboBox();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nikInput = new javax.swing.JTextField();
        namaInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        empIdInput = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DATA USER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PEGAWAI");

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(204, 204, 204));
        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USERNAME", "PEGAWAI", "NIK"
            }
        ));
        tableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableEmployee);

        editButton.setBackground(new java.awt.Color(204, 204, 204));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        empIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIdInputActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        mainMenu.setBackground(new java.awt.Color(204, 204, 204));
        mainMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainMenu.setText("MAIN MENU");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nikInput, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaInput)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(empIdInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nikInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenu)
                    .addComponent(resetButton)
                    .addComponent(deleteButton)
                    .addComponent(editButton)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            save();
            clear();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan, "+ e.getMessage());
        }
        try {
            display();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan, "+ e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void empIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIdInputActionPerformed

    private void tableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeeMouseClicked
        // TODO add your handling code here:
        int row = tableEmployee.getSelectedRow();
        this.currentlyEditedId = (Integer)tableEmployee.getValueAt(row, 0);
        nikInput.setText(tableEmployee.getValueAt(row, 1).toString());
        namaInput.setText(tableEmployee.getValueAt(row, 2).toString());  
        int size = empIdInput.getItemCount();
        for (int i = 0; i < size; i++) {
                    
            if(empIdInput.getItemAt(i).equals(tableEmployee.getValueAt(row, 4).toString())){
                empIdInput.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tableEmployeeMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try {
            delete();
            clear();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus, "+ e.getMessage());
        }
        try {
            display();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan, "+ e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try {
            update();
            clear();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate, "+ e.getMessage());
        }
        try {
            display();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan, "+ e.getMessage());
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mainMenuActionPerformed

    public void clear(){
        nikInput.setText("");
        namaInput.setText("");
        empIdInput.setSelectedIndex(0);
    }
    
    public void save() throws SQLException {
        sql = "INSERT INTO ms_user(uname, pass, ms_employee_id, is_active) VALUES (?, ?, ?, ?)";
        pstat = con.prepareStatement(sql);

        pstat.setString(1, nikInput.getText());
        pstat.setString(2, namaInput.getText());
        pstat.setInt(3, emp.get(empIdInput.getSelectedItem().toString()));
        pstat.setInt(4, 1);
        pstat.executeUpdate();
    }
    
    
    public void update() throws SQLException {
        sql = "update ms_user set uname = ?, pass = ?, ms_employee_id = ?, is_active = ? WHERE id = ?";
        pstat = con.prepareStatement(sql);

        pstat.setString(1, nikInput.getText());
        pstat.setString(2, namaInput.getText());
        pstat.setInt(3, emp.get(empIdInput.getSelectedItem().toString()));
        pstat.setInt(4, 1);
        pstat.setInt(5, this.currentlyEditedId);
        pstat.executeUpdate();
    }
    
    
    public void delete() throws SQLException {
        sql = "delete FROM ms_employee WHERE id = ?";
        pstat = con.prepareStatement(sql);

        pstat.setInt(1, this.currentlyEditedId);
        pstat.executeUpdate();
    }
    
    private void display() throws SQLException {
        while (tableEmployee.getRowCount() > 0) {
            ((javax.swing.table.DefaultTableModel) tableEmployee.getModel()).removeRow(0);
        }
        
        sql = "SELECT u.id, u.uname, emp.name, emp.nik FROM ms_user u join ms_employee emp on u.ms_employee_id = emp.id;";
        rs = stat.executeQuery(sql);
        int columns = rs.getMetaData().getColumnCount();
        while (rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((javax.swing.table.DefaultTableModel) tableEmployee.getModel()).insertRow(rs.getRow() - 1,row);
        }
    }
    
    public void populateComboBox(){
        emp = getComboBoxData("SELECT id, name FROM ms_employee WHERE is_active = 1 ORDER BY id");
        for(String s : emp.keySet()){
            empIdInput.addItem(s);
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
            java.util.logging.Logger.getLogger(MasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> empIdInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainMenu;
    private javax.swing.JTextField namaInput;
    private javax.swing.JTextField nikInput;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tableEmployee;
    // End of variables declaration//GEN-END:variables

    //initialize SQL Connection  
    private Connection con;
    private Statement stat;
    private PreparedStatement pstat;
    private ResultSet rs;
    private String sql;
    private HashMap<String, Integer> emp;
    //JPane
    private javax.swing.JOptionPane JOptionPane;
    
    private int currentlyEditedId;
    
}