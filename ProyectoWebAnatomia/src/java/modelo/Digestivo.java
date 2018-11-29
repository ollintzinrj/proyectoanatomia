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
public class Digestivo extends SistemaAnatomico{
    
    public String boca;
    public String faringe;
    public String esofago;
    public String iDelgado;
    public String iGrueso;
    public String recto;
    public String ano;
    public String vesicula;

    public Digestivo() {
    }

    public Digestivo(Integer id) {
        super(id);
    }

    public Digestivo(String boca, String faringe, String esofago, String iDelgado, String iGrueso, String recto, String ano, String vesicula) {
        this.boca = boca;
        this.faringe = faringe;
        this.esofago = esofago;
        this.iDelgado = iDelgado;
        this.iGrueso = iGrueso;
        this.recto = recto;
        this.ano = ano;
        this.vesicula = vesicula;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

    public String getFaringe() {
        return faringe;
    }

    public void setFaringe(String faringe) {
        this.faringe = faringe;
    }

    public String getEsofago() {
        return esofago;
    }

    public void setEsofago(String esofago) {
        this.esofago = esofago;
    }

    public String getiDelgado() {
        return iDelgado;
    }

    public void setiDelgado(String iDelgado) {
        this.iDelgado = iDelgado;
    }

    public String getiGrueso() {
        return iGrueso;
    }

    public void setiGrueso(String iGrueso) {
        this.iGrueso = iGrueso;
    }

    public String getRecto() {
        return recto;
    }

    public void setRecto(String recto) {
        this.recto = recto;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getVesicula() {
        return vesicula;
    }

    public void setVesicula(String vesicula) {
        this.vesicula = vesicula;
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
        return "Digestivo{" + "boca=" + boca + ", faringe=" + faringe + ", esofago=" + esofago + ", iDelgado=" + iDelgado + ", iGrueso=" + iGrueso + ", recto=" + recto + ", ano=" + ano + ", vesicula=" + vesicula + '}';
    }

       
}
