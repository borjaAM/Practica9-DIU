package com.mycompany.practica9.diu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class BaseDatos {

    private Connection con;
    private DatabaseMetaData md;
    
    public BaseDatos(){
    }

    public boolean connectDB(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/DIU_BD?useSSL=true", username, password);
            md = con.getMetaData();
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public List readTables() throws SQLException{
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(null, null, "%", types);
        List<String> tablas = new ArrayList<>();
        while (rs.next()) {
            String nombreTabla = rs.getString("TABLE_NAME");
            tablas.add(nombreTabla);
        }
        return tablas;
    }
    
    public List readColumnas(String tabla) throws SQLException{
        ResultSet rs2 = md.getColumns(null, null, tabla, null);
        List<String> columnas = new ArrayList<>();
        while (rs2.next()) {
            String nombreCampo = rs2.getString("COLUMN_NAME");
            columnas.add(nombreCampo);
        }
        return columnas;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
