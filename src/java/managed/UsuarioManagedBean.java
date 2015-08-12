/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import Comprobaciones.ComprobarUsuario;
import Pojo.Tusuario;
import conector.ConnectionFact;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author E302
 */
@ManagedBean
@ViewScoped
public class UsuarioManagedBean implements Serializable{

    private Tusuario usuario;
    private short flag = 2;
    private ConnectionFact cf;
    private List<Tusuario> lista;
    private List<Tusuario> listaFiltrada;
    
    public UsuarioManagedBean() {    
        cf=new ConnectionFact();
        this.usuario=new Tusuario();
        this.usuario.setSexo("M");
    }

    public Tusuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Tusuario usuario) {
        this.usuario = usuario;
    }

    public List<Tusuario> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Tusuario> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    
    public void mostrarDatos(){
        
        flag = ComprobarUsuario.contraseña(usuario);

        if(ComprobarUsuario.camposVacios(usuario)){
                
                if(flag == 0){
                    ComprobarUsuario.encryptar(usuario);
                try {
                    System.out.println("Insertando datos de usuario...");
                    cf.insertarUsuario(usuario);
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informacion", "Registro exitoso"));
                    this.usuario = new Tusuario();
                    this.usuario.setSexo("M");
                    
                }catch (SQLException ex) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", ex.getMessage()));
                }
                }else{
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Contraseñas no Coinciden"));
                } 
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se Permiten Campos Vacios"));
        }
    }
    
    public List<Tusuario> listarDatos(){
        
        try{
            lista = cf.listar();
        }catch(SQLException ex){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", ex.getMessage()));
        }   
        return lista;
    }
    
    
}
