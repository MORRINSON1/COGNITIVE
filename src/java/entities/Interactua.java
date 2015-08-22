/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author r_mor_000
 */

@Entity
@Table (name = "interactua")
public class Interactua implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer idInteractua;
    
    @Column (name = "nivel")
    private int nivel;
    
    @Column (name = "puntos")
    private int puntos;
    
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)   
    private Modulo modulo;
    
    
    @ManyToOne(cascade = CascadeType.ALL)    
    private Usuario usuario;

    public Interactua() {
    }

    public Interactua(Integer idInteractua, int nivel, int puntos, Modulo modulo, Usuario usuario) {
        this.idInteractua = idInteractua;
        this.nivel = nivel;
        this.puntos = puntos;
        this.modulo = modulo;
        this.usuario = usuario;
    }

    /**
     * @return the idInteractua
     */
    public Integer getIdInteractua() {
        return idInteractua;
    }

    /**
     * @param idInteractua the idInteractua to set
     */
    public void setIdInteractua(Integer idInteractua) {
        this.idInteractua = idInteractua;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the modulo
     */
    public Modulo getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
