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
@Table (name = "recordatorio")
public class Recordatorio implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer recordatorio;
    
    @Column (name = "fecha")
    private String fecha;
    
    @Column (name = "nota")
    private String nota;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Actividad actividad;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    public Recordatorio() {
    }

    public Recordatorio(Integer recordatorio, String fecha, String nota, Actividad actividad, Usuario usuario) {
        this.recordatorio = recordatorio;
        this.fecha = fecha;
        this.nota = nota;
        this.actividad = actividad;
        this.usuario = usuario;
    }

    /**
     * @return the recordatorio
     */
    public Integer getRecordatorio() {
        return recordatorio;
    }

    /**
     * @param recordatorio the recordatorio to set
     */
    public void setRecordatorio(Integer recordatorio) {
        this.recordatorio = recordatorio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the actividad
     */
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
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
