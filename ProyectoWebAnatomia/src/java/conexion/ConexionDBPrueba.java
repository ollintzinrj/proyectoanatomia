/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import dao.DAOSistemas;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.SistemaAnatomico;

/**
 *
 * @author ollintzinrosas
 */
public class ConexionDBPrueba {
    public static void main(String[] args) {
        dao.DAOSistemas daoSis=new DAOSistemas();
        
        System.out.println("tam "+daoSis.getSistemas().size());



       // ConexionDB db = new ConexionDB();
        
        //Producto p = new Producto("Chocolate", "chocolate rojo", 12.50, "imagen.png");
        //db.insertaProducto(p);
        
        //Para actualizar el objeto debe tener todos los demás campos llenos
        //Producto p = new Producto(3, "Chocolate", "chocolate amarillo", 12.50, "imagen.png");
        //db.actualizaProducto(p); 
        
        //Producto p = new Producto(2);
        //db.borraProducto(p);
        
        /*
        //Prueba para obtener organos
        ArrayList organos = db.getOrganos(2);
        System.out.println(organos);
        */
        //Prueba para obtener una lista de productos
        
        /*ArrayList sistemas = db.getSistemas();
        Iterator iterador = sistemas.iterator();
        while(iterador.hasNext()){
            SistemaAnatomico sa = (SistemaAnatomico)iterador.next();
            //p.getNombre(); obtener un campo en particular
            System.out.println("Sistema: "+sa);
        }*/
        
        /*Producto p = db.getProducto(1);*/
        //System.out.println(sa);
    }
}
