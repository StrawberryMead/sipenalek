package com.kkp.sipenalek;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class DBConnection {
    public Connection con;
    public Statement stm;
    String databaseName = "sipenalek";
    
    public DBConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "");
            stm = con.createStatement();
            boolean databaseExists = checkDatabaseExists(databaseName);
            if (!databaseExists) {
                JOptionPane.showMessageDialog(null, "Basis data tidak dapat ditemukan! \nKlik \"OK\" untuk membuat basis data.");     
                createDatabase(databaseName);
                con.setCatalog(databaseName); 
                executeSqlFile("/database_setup.sql");
                JOptionPane.showMessageDialog(null, "Basis data berhasil dibuat.");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke basis data gagal " + e.getMessage());
        }
    }

    private boolean checkDatabaseExists(String databaseName) throws SQLException {
        ResultSet resultSet = con.getMetaData().getCatalogs();
        while (resultSet.next()) {
            String dbName = resultSet.getString(1);
            if (dbName.equals(databaseName)) {
                return true;
            }
        }
        return false;
    }

    private void createDatabase(String databaseName) throws SQLException {
        String createDatabaseSql = "CREATE DATABASE " + databaseName;
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createDatabaseSql);
        }
    }

    private void executeSqlFile(String filePath) throws SQLException {
        try {
            InputStream inputStream = getClass().getResourceAsStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder sqlStatements = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sqlStatements.append(line);
                if (line.trim().endsWith(";")) {
                    try (Statement stmt = con.createStatement()) {
                        stmt.executeUpdate(sqlStatements.toString());
                    }
                    sqlStatements.setLength(0);
                }
            }

            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menjalankan file SQL: " + e.getMessage());
        }
    }
    
    public void config() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "");
            con.setCatalog(databaseName);
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke basis data gagal: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke basis data gagal " + e.getMessage());
        }
    }
}
