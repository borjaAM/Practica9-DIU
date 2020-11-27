package com.mycompany.practica9.diu;
import java.sql.*;
import java.util.logging.*;

public class BD {

    private Connection con;
    private final String username, password;
    
    public BD(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/DIU_BD?useSSL=true", username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public void readTables() throws SQLException{
        DatabaseMetaData md = con.getMetaData();
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(null, null, "%", types);
        while (rs.next()) {
            String nombreTabla = rs.getString("TABLE_NAME");
            System.out.println("Tabla: " + nombreTabla);
            ResultSet rs2 = md.getColumns(null, null, nombreTabla, null);
            while (rs2.next()) {
                String nombreCampo = rs2.getString("COLUMN_NAME");
                System.out.println(" Campo: " + nombreCampo);
                }
        }
        con.close();
    }
}
