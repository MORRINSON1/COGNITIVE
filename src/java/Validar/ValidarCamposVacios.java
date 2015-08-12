/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validar;

import Pojo.Tusuario;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author r_mor_000
 */


public class ValidarCamposVacios{
    
    private static boolean valor = true;

    public static boolean validate(Tusuario usuario){
        
        System.out.println("Validando campos vacios...");
        
        if(usuario.getNombre().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Nombre es obligatorio"));
            valor = false;
        }
        if(usuario.getPrimerApellido().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Primer Apellido es obligatorio"));
            valor = false;
        }              
        if(usuario.getSegundoApellido().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Segundo Apellido es obligatorio")); 
            valor = false;
        }
        if(usuario.getCorreoElectronico().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Correo Electrónico es obligatorio"));
            valor = false;
        }
        if(usuario.getContrasenha().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Contraseña es obligatorio"));
            valor = false;
        }
        if(usuario.getTelefono().trim().equals("")){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Error", "Campo Teléfono es obligatorio"));
            valor = false;
        }
        return valor;
    }
} 
