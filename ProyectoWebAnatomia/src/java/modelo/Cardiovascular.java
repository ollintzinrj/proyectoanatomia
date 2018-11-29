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
public class Cardiovascular extends SistemaAnatomico{
    
    public String venas;
    public String arterias; 
    public String capilares;
    public String celBlancas;
    public String celRojas;
    public String plaquetas;
    public Integer sistemaId;

    public Cardiovascular() {
    }

    public Cardiovascular(Integer id) {
        super(id);
    }

    public Cardiovascular(String venas, String arterias, String capilares, String celBlancas, String celRojas, String plaquetas, Integer sistemaId) {
        this.venas = venas;
        this.arterias = arterias;
        this.capilares = capilares;
        this.celBlancas = celBlancas;
        this.celRojas = celRojas;
        this.plaquetas = plaquetas;
        this.sistemaId = sistemaId;
    }

    public String getVenas() {
        return venas;
    }

    public void setVenas(String venas) {
        this.venas = venas;
    }

    public String getArterias() {
        return arterias;
    }

    public void setArterias(String arterias) {
        this.arterias = arterias;
    }

    public String getCapilares() {
        return capilares;
    }

    public void setCapilares(String capilares) {
        this.capilares = capilares;
    }

    public String getCelBlancas() {
        return celBlancas;
    }

    public void setCelBlancas(String celBlancas) {
        this.celBlancas = celBlancas;
    }

    public String getCelRojas() {
        return celRojas;
    }

    public void setCelRojas(String celRojas) {
        this.celRojas = celRojas;
    }

    public String getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(String plaquetas) {
        this.plaquetas = plaquetas;
    }

    public Integer getSistemaId() {
        return sistemaId;
    }

    public void setSistemaId(Integer sistemaId) {
        this.sistemaId = sistemaId;
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
        return "Cardiovascular{" + "venas=" + venas + ", arterias=" + arterias + ", capilares=" + capilares + ", celBlancas=" + celBlancas + ", celRojas=" + celRojas + ", plaquetas=" + plaquetas + ", sistemaId=" + sistemaId + '}';
    }
    
    
}
