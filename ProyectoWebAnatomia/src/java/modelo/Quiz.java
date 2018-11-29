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
public class Quiz {
    
    public Integer id;
    public Integer idSistema;
    public ArrayList preguntas;

    public Quiz() {
    }

    public Quiz(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Quiz(Integer id, Integer idSistema, ArrayList preguntas) {
        this.id = id;
        this.idSistema = idSistema;
        this.preguntas = preguntas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Quiz{" + "id=" + id + ", idSistema=" + idSistema + ", preguntas=" + preguntas + '}';
    }
    
     
}
