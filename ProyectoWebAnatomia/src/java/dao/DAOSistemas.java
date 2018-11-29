/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Organo;
import modelo.SistemaAnatomico;

/**
 *
 * @author Admin
 */
public class DAOSistemas {
    
    private Connection conn;
    private ConexionDB db;
    
    
    public ArrayList getSistemas(){
         
        ArrayList sistemas = new ArrayList(); 
        ArrayList organos = new ArrayList(); 
        Statement stmt1 = null;    
        ResultSet rs1 = null;         
        
        db = new ConexionDB();
        conn = db.getConn();
        
        try{
            stmt1 = conn.createStatement();
            String sqlsistema = "SELECT * FROM sistemaanatomico";
            rs1 = stmt1.executeQuery(sqlsistema);
            
            while(rs1.next()){
                int idSistema = rs1.getInt("sistema_id");
                String nombreSistema = rs1.getString("sistema_nombre");
                String descripcionSistema = rs1.getString("sistema_descripcion");
                String imagenSistema = rs1.getString("sistema_imagen");
                int idQuizSistema = rs1.getInt("quiz_id");
                
                organos = getOrganos(idSistema);
                //stmt2.close();
                
                SistemaAnatomico sa = new SistemaAnatomico(idSistema, nombreSistema, descripcionSistema, imagenSistema, idQuizSistema, organos);
                sistemas.add(sa);
            }
            stmt1.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo obtener la lista de productos." +e.getMessage());
        }     
        
        return sistemas;
    }
     
     public ArrayList getOrganos(int idSistema){
        ArrayList organos = new ArrayList(); 
        Statement stmt = null;
        ResultSet rs = null; 
        db = new ConexionDB();
         conn = db.getConn();
        try{
            stmt = conn.createStatement();
            String sqlorgano = "SELECT * FROM organo WHERE sistema_id = "+idSistema;
            rs = stmt.executeQuery(sqlorgano);
            while(rs.next()){
                int idOrgano = rs.getInt("organo_id");
                String nombreOrgano = rs.getString("organo_nombre");
                String descripcionOrgano = rs.getString("organo_descripcion");
                String ubicacionOrgano = rs.getString("organo_imagen");
                String imagenOrgano = rs.getString("organo_imagen");

                Organo o = new Organo(idOrgano, nombreOrgano, descripcionOrgano, ubicacionOrgano, imagenOrgano, idSistema);   
                organos.add(o);
            }
            conn.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo obtener la lista de productos.");
            e.printStackTrace();
        }     
        
        return organos;
    }
}
