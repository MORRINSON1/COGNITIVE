package Pojo;
// Generated 19/07/2015 07:01:41 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tactividadparticipante generated by hbm2java
 */
public class Tactividadparticipante  implements java.io.Serializable {

     private String codigoActividadParticipante;
     private Tactividad tactividad;
     private Tusuarioamigo tusuarioamigo;
     private Date fechaRegistro;
     private Date fechaModificacion;

    public Tactividadparticipante() {
    }

    public Tactividadparticipante(String codigoActividadParticipante, Tactividad tactividad, Tusuarioamigo tusuarioamigo, Date fechaRegistro, Date fechaModificacion) {
       this.codigoActividadParticipante = codigoActividadParticipante;
       this.tactividad = tactividad;
       this.tusuarioamigo = tusuarioamigo;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
    }
   
    public String getCodigoActividadParticipante() {
        return this.codigoActividadParticipante;
    }
    
    public void setCodigoActividadParticipante(String codigoActividadParticipante) {
        this.codigoActividadParticipante = codigoActividadParticipante;
    }
    public Tactividad getTactividad() {
        return this.tactividad;
    }
    
    public void setTactividad(Tactividad tactividad) {
        this.tactividad = tactividad;
    }
    public Tusuarioamigo getTusuarioamigo() {
        return this.tusuarioamigo;
    }
    
    public void setTusuarioamigo(Tusuarioamigo tusuarioamigo) {
        this.tusuarioamigo = tusuarioamigo;
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




}


