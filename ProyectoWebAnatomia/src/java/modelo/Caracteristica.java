/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ollintzinrosas
 */
public class Caracteristica {
    
    public Integer id;
    public String texto;
    public Integer idOrgano;

    public Caracteristica() {
    }

    public Caracteristica(Integer idOrgano) {
        this.idOrgano = idOrgano;
    }

    public Caracteristica(Integer id, String texto, Integer idOrgano) {
        this.id = id;
        this.texto = texto;
        this.idOrgano = idOrgano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getIdOrgano() {
        return idOrgano;
    }

    public void setIdOrgano(Integer idOrgano) {
        this.idOrgano = idOrgano;
    }

    @Override
    public String toString() {
        return "Caracteristica{" + "id=" + id + ", texto=" + texto + ", idOrgano=" + idOrgano + '}';
    }
    
    
}
