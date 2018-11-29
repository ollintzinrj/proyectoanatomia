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
public class Pregunta {
    
    public Integer id;
    public Integer idQuiz;
    public String texto;

    public Pregunta() {
    }

    public Pregunta(Integer idQuiz) {
        this.idQuiz = idQuiz;
    }

    public Pregunta(Integer id, Integer idQuiz, String texto) {
        this.id = id;
        this.idQuiz = idQuiz;
        this.texto = texto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(Integer idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "id=" + id + ", idQuiz=" + idQuiz + ", texto=" + texto + '}';
    }
    
    
}
