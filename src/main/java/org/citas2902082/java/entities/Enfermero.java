package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Enfermero extends Usuario {

    public Integer id;
    public String nombre;
    public String apellido;
    public TipoIdentificacion tipoIdentificacion;
    public Long numeroIdentificacion;

    
    
    public Enfermero(Integer id, String nombre, String apellido, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdentificacion);
    }

    

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }



    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }



    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }



    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }



    @Override
    public String toString() {
        return "Enfermero [id=" + super.id + ", nombre=" + super.nombre + ", apellido=" + super.apellido + ", tipoIdentificacion="
                + super.tipoIdentificacion + ", numeroIdentificacion=" + super.numeroIdentificacion + "]";
    }

    

}
