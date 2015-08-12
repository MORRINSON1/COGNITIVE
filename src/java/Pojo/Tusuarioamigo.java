package Pojo;
// Generated 19/07/2015 07:01:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tusuarioamigo generated by hbm2java
 */
public class Tusuarioamigo  implements java.io.Serializable {


     private String codigoUsuarioAmigo;
     private Tusuario tusuario;
     private String nombre;
     private String primerApellido;
     private String segundoApellido;
     private String correoElectronico;
     private String contrasenha;
     private Date fechaNacimiento;
     private boolean sexo;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set tactividadparticipantes = new HashSet(0);
     private Set tactividadcomentarios = new HashSet(0);
     private Set tusuarioamigotelefonos = new HashSet(0);

    public Tusuarioamigo() {
    }

	
    public Tusuarioamigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String primerApellido, String segundoApellido, String correoElectronico, String contrasenha, Date fechaNacimiento, boolean sexo, Date fechaRegistro, Date fechaModificacion) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
        this.tusuario = tusuario;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correoElectronico = correoElectronico;
        this.contrasenha = contrasenha;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public Tusuarioamigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String primerApellido, String segundoApellido, String correoElectronico, String contrasenha, Date fechaNacimiento, boolean sexo, Date fechaRegistro, Date fechaModificacion, Set tactividadparticipantes, Set tactividadcomentarios, Set tusuarioamigotelefonos) {
       this.codigoUsuarioAmigo = codigoUsuarioAmigo;
       this.tusuario = tusuario;
       this.nombre = nombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.correoElectronico = correoElectronico;
       this.contrasenha = contrasenha;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.tactividadparticipantes = tactividadparticipantes;
       this.tactividadcomentarios = tactividadcomentarios;
       this.tusuarioamigotelefonos = tusuarioamigotelefonos;
    }
   
    public String getCodigoUsuarioAmigo() {
        return this.codigoUsuarioAmigo;
    }
    
    public void setCodigoUsuarioAmigo(String codigoUsuarioAmigo) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
    }
    public Tusuario getTusuario() {
        return this.tusuario;
    }
    
    public void setTusuario(Tusuario tusuario) {
        this.tusuario = tusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getContrasenha() {
        return this.contrasenha;
    }
    
    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public boolean isSexo() {
        return this.sexo;
    }
    
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getTactividadparticipantes() {
        return this.tactividadparticipantes;
    }
    
    public void setTactividadparticipantes(Set tactividadparticipantes) {
        this.tactividadparticipantes = tactividadparticipantes;
    }
    public Set getTactividadcomentarios() {
        return this.tactividadcomentarios;
    }
    
    public void setTactividadcomentarios(Set tactividadcomentarios) {
        this.tactividadcomentarios = tactividadcomentarios;
    }
    public Set getTusuarioamigotelefonos() {
        return this.tusuarioamigotelefonos;
    }
    
    public void setTusuarioamigotelefonos(Set tusuarioamigotelefonos) {
        this.tusuarioamigotelefonos = tusuarioamigotelefonos;
    }




}

