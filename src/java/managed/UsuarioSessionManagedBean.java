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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author r_mor_000
 */
@ManagedBean
@SessionScoped
public class UsuarioSessionManagedBean implements Serializable{
    
    private ConnectionFact cf;
    private Tusuario usuarios;
    private String correoElectronico;
    private String contraseña;
    private boolean sesion = false;

    /**
     * Creates a new instance of UsuarioSessionManagedBean
     */
    public UsuarioSessionManagedBean() {
        this.usuarios = new Tusuario();
        this.cf = new ConnectionFact();
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String mail) {
        this.correoElectronico = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Tusuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Tusuario usuarios) {
        this.usuarios = usuarios;
    }
    
    public String buscarUsuario() throws SQLException{  
        
        if(!sesion){
            
            this.usuarios = cf.buscar(correoElectronico);
            if( usuarios != null ){

                    if(!ComprobarUsuario.contraseñaInicioSesion(this.usuarios, this.contraseña)){
                        return "/index";
                    }else{
                        sesion = true;
                        return "/usuario/listarUsuario";
                    }
                }else
                {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario No Registrado"));
                    this.correoElectronico = null;
                    this.contraseña = null;
                }
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Ya se Encuentra una Sesión Abierta"));
        }
        return null;
    }
        
    public String cerrarSesion(){
  
            this.contraseña = null;
            this.correoElectronico = null;
            sesion = false;
            return "/index";
    }
}
