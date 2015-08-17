/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author r_mor_000
 */

@Entity
@Table(name = "personalizacion")
public class Personalizacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer idPersonalizacion;
    
    @Column (name = "colortheme")
    private String colorTheme;
    
    @Column (name = "portada")
    private String portada;
    
    @Column (name = "foto")
    private String foto;
    
    @JoinColumn
    @OneToOne
    private Usuario usuario;

    public Personalizacion() {
    }

    public Personalizacion(Integer idPersonalizacion, String colorTheme, String portada, String foto, Usuario usuario) {
        this.idPersonalizacion = idPersonalizacion;
        this.colorTheme = colorTheme;
        this.portada = portada;
        this.foto = foto;
        this.usuario = usuario;
    }

    /**
     * @return the idPersonalizacion
     */
    public Integer getIdPersonalizacion() {
        return idPersonalizacion;
    }

    /**
     * @param idPersonalizacion the idPersonalizacion to set
     */
    public void setIdPersonalizacion(Integer idPersonalizacion) {
        this.idPersonalizacion = idPersonalizacion;
    }

    /**
     * @return the colorTheme
     */
    public String getColorTheme() {
        return colorTheme;
    }

    /**
     * @param colorTheme the colorTheme to set
     */
    public void setColorTheme(String colorTheme) {
        this.colorTheme = colorTheme;
    }

    /**
     * @return the portada
     */
    public String getPortada() {
        return portada;
    }

    /**
     * @param portada the portada to set
     */
    public void setPortada(String portada) {
        this.portada = portada;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
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
