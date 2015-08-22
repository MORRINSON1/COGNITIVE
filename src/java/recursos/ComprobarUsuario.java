/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import entities.Usuario;



/**
 *
 * @author r_mor_000
 */
public class ComprobarUsuario {
    
    public static short contraseña(Usuario usuario){
        return ValidarContraseña.validarContraseña(usuario);
    }
    
    public static void encryptar(Usuario usuario){
        usuario.setPassword(EncriptarUsuario.sha512(usuario.getPassword())); 
    }
    
    public static boolean contraseñaInicioSesion(Usuario usuario, String contraseña){
        return ValidarCorreosIguales.verificacion(usuario, contraseña);
    }
    
    public static boolean camposVacios(Usuario usuario){
        return ValidarCamposVacios.validate(usuario);
    }
}


