/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import recursos.EncriptarUsuario;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author r_mor_000
 */
public class ValidarCorreosIguales {
    
    
    public static boolean verificacion(Tusuario usuario, String contraseña){

            if(usuario.getContrasenha().equals(EncriptarUsuario.sha512(contraseña))){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos correctos:", "Inicio de sesión exitoso"));
                return true;
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", "Contraseña Incorrecta"));
                usuario.setCorreoElectronico(null);
                return false;
            }
    }
}
        
            
            
            

    
    
