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
public class SistemaAnatomico {
    
    public Integer id;
    public String nombre;
    public String descripcion; 
    public Integer idQuiz;
    public String imagen; 
    public ArrayList <Organo> organos; 

    public SistemaAnatomico() {
    }

    public SistemaAnatomico(Integer id) {
        this.id = id;
    }

    public SistemaAnatomico(Integer id, String nombre, String descripcion, String imagen, Integer idQuiz, ArrayList organos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idQuiz = idQuiz;
        this.imagen = imagen;
        this.organos = organos;
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

    public Integer getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(Integer idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList organos) {
        this.organos = organos;
    }

    @Override
    public String toString() {
        return "SistemaAnatomico{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", idQuiz=" + idQuiz + ", imagen=" + imagen + ", organos=" + organos + '}';
    }
    
    
}
