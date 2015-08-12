/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author r_mor_000
 */

@FacesValidator("validarEmail")

public class ValidarEmail implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        
        System.out.println("Validando correo electrónico...");
        
        HtmlInputText hit = (HtmlInputText) uic;
        String label;
        
        if(hit.getLabel() == null || hit.getLabel().trim().equals("")){
            label = hit.getId();
        }else{
            label = hit.getLabel();
        }
        
        
        Pattern padre=Pattern.compile("([a-zA-Z0-9\\.\\/-_]+\\@[a-zA-Z-]+\\.[a-zA-Z]+)*");
 
        
        Matcher matcher=padre.matcher((CharSequence) o);
        
        if(!matcher.matches()){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", label +" invalido"));
            
        }
    }
    
}
