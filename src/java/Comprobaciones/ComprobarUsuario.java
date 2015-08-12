/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprobaciones;

import Encriptar.EncriptarUsuario;
import Pojo.Tusuario;
import Validar.ValidarCamposVacios;
import Validar.ValidarContraseña;
import Validar.ValidarCorreosIguales;

/**
 *
 * @author r_mor_000
 */
public class ComprobarUsuario {
    
    public static short contraseña(Tusuario usuario){
        return ValidarContraseña.validarContraseña(usuario);
    }
    
    public static void encryptar(Tusuario usuario){
        usuario.setContrasenha(EncriptarUsuario.sha512(usuario.getContrasenha())); 
    }
    
    public static boolean contraseñaInicioSesion(Tusuario usuario, String contraseña){
        return ValidarCorreosIguales.verificacion(usuario, contraseña);
    }
    
    public static boolean camposVacios(Tusuario usuario){
        return ValidarCamposVacios.validate(usuario);
    }
}


