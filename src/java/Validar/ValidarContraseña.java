/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validar;

import Pojo.Tusuario;


/**
 *
 * @author r_mor_000
 */
public class ValidarContraseña {
    
    public static short validarContraseña(Tusuario usuario){
        
        System.out.println("Validando Contraseña...");
        
        if(usuario.getContrasenha().equals(usuario.getTxtConfirmarContraseña())){
            return 0;
        }else{
            return 1;
        }
    }
    
}
