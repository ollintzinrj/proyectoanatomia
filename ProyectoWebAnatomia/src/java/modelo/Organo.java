/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ollintzinrosas
 */
public class Organo {
    
    public Integer id;
    public String nombre;
    public String descripcion;
    public String ubicacion;
    public String imagen;
    public Integer idSistema; 

    public Organo() {
    }

    public Organo(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Organo(Integer id, String nombre, String descripcion, String ubicacion, String imagen, Integer idSistema) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.idSistema = idSistema;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    
    @Override
    public String toString() {
        return "Organo{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", imagen=" + imagen + ", idSistema=" + idSistema + '}';
    }
    
    
}
