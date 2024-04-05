package org.citas2902082.java.entities;

import java.lang.invoke.StringConcatException;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class CitaEnfermero extends Cita implements IAgendable{
    
    
    public Integer id;
    public String nombre;
    public String apellido;
    public TipoIdentificacion tipoIdentificacion;
    public Long numeroIdentificacion;

    public CitaEnfermero(Integer id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, Integer id2,
            String nombre, String apellido, TipoIdentificacion tipoIdentificacion, Long numeroIdentificacion) {
        super(id, fecha, paciente, consultorio);
        id = id2;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
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
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        System.out.println("CITA DE ENFERMERIA CANCELADA");
    }

    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    

    

    

}