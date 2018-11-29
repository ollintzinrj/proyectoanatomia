/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager; //establece la conexion
import java.sql.SQLException;
import java.sql.Statement; //para los queritos 
import java.sql.ResultSet; //recuperar el conjunto de registros 
import java.util.ArrayList;
import java.util.Properties;
import modelo.Organo;
import modelo.SistemaAnatomico;


/**
 *
 * @author ollintzinrosas
 */
public class ConexionDB {

    //1. crear la conexion
    private Connection conn = null; 
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/anatomiabd?autoReconnect=true&useSSL=false";
    private static final String driver = "com.mysql.jdbc.Driver";
    
    public ConexionDB() {
          try {
            Class.forName( driver );
            Properties props = new Properties();
            props.put("user", user);
            props.put("password",password);
            
            conn = (Connection) DriverManager.getConnection( url, props );
              System.out.println("conectado");
        } catch (
                SQLException ex ) {
            System.out.println( "Error al conectar a MYSQL bd: " + ex.getMessage() );
        } catch ( ClassNotFoundException ex ) {
            System.out.println( "Error driver mysql :"+ex.getMessage() );
        } 
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    ///// ESTAS CONSULTAS VAN EN OTRO LADO VAN EN LOS DAO QUE SON LOS QUE SE ENCARGAN DE CONSUMIR LOS SERVICIOS DE 
    //LA BASE DE DATOS
    
    /*
    public void insertaSistema(SistemaAnatomico sa){
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            String sql = "INSERT INTO producto "+
            "(eweb_prod_nombre, eweb_prod_descripcion, eweb_prod_precio, eweb_prod_imagen)"+
            " VALUES ('"+p.getNombre()+"','"+p.getInformacion()+"',"+p.getQuiz()+",'"+p.getImagen()+"')";
            //getOrganos
            
            stmt.execute(sql);
            stmt.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo insertar el producto.");
            e.printStackTrace();
        }     
    }
    
    public void actualizaSistema(SistemaAnatomico sa){
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            String sql = "UPDATE producto SET eweb_prod_nombre = '"+p.getNombre()+
            "', eweb_prod_descripcion = '"+p.getDescripcion()+
            "', eweb_prod_precio = "+p.getPrecio()+
            ", eweb_prod_imagen = '"+p.getImagen()+"' WHERE eweb_prod_id = "+p.getIdProducto();
            
            stmt.execute(sql);
            stmt.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo insertar el producto.");
            e.printStackTrace();
        }     
    }
    
    public void borraSistema(SistemaAnatomico sa){
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            String sql = "DELETE FROM producto WHERE eweb_prod_id = "+p.getIdProducto();
            
            stmt.execute(sql);
            stmt.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo insertar el producto.");
            e.printStackTrace();
        }     
    }
    */
    
    public ArrayList getSistemas(){
        ArrayList sistemas = new ArrayList(); 
        ArrayList organos = new ArrayList(); 
        Statement stmt1 = null;
        //Statement stmt2 = null;       
        ResultSet rs1 = null; 
        //ResultSet rs2 = null;        
        
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
        }
        catch(SQLException e){
            System.out.println("No se pudo obtener la lista de productos.");
            e.printStackTrace();
        }     
        
        return sistemas;
    }
    
    public SistemaAnatomico getSistema(int idSistema){
        SistemaAnatomico sa = null;
        ArrayList organos = new ArrayList(); 
        Statement stmt1 = null;
        //Statement stmt2 = null;       
        ResultSet rs1 = null; 
        //ResultSet rs2 = null; 
        
        try{
            stmt1 = conn.createStatement();
            String sql = "SELECT * FROM sistemaanatomico WHERE sistema_id = "+idSistema;
            rs1 = stmt1.executeQuery(sql);
            if(rs1.next()){
                String nombreSistema = rs1.getString("sistema_nombre");
                String descripcionSistema = rs1.getString("sistema_descripcion");
                String imagenSistema = rs1.getString("sistema_imagen");
                int idQuizSistema = rs1.getInt("quiz_id");
                organos = getOrganos(idSistema);
                
                sa = new SistemaAnatomico(idSistema, nombreSistema, descripcionSistema, imagenSistema, idQuizSistema, organos);
            }
            stmt1.close();
            //stmt2.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo obtener el producto.");
            e.printStackTrace();
        }     
        
        return sa;
    }
    
    public ArrayList getOrganos(int idSistema){
        ArrayList organos = new ArrayList(); 
        Statement stmt = null;
        ResultSet rs = null; 
        
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
        }
        catch(SQLException e){
            System.out.println("No se pudo obtener la lista de productos.");
            e.printStackTrace();
        }     
        
        return organos;
    }
}
