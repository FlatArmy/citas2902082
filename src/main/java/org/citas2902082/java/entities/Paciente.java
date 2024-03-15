package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoSangre;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import java.time.LocalDateTime;

public class Paciente {
    public Integer id;

    public String nombres;

    public String apellidos;

    public TipoIdentificacion tipoIdentificacion;

    public Integer numeroIdentificacion;

    public TipoSangre tipoSangre;

    public char factorRH;

    public Double altura;

    public Double peso;

    public LocalDateTime fechaNacimiento;

    public String email;

    public Paciente(String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,

            Integer numeroIdentificacion,
            TipoSangre tipoSangre,
            char factorRH,
            Double altura,
            Double peso,

            LocalDateTime fechaNacimiento,
            String email) {

        this.nombres = nombres;

        this.apellidos = apellidos;

        this.tipoIdentificacion = tipoIdentificacion;

        this.numeroIdentificacion = numeroIdentificacion;

        this.tipoSangre = tipoSangre;

        this.factorRH = factorRH;

        this.altura = altura;

        this.peso = peso;

        this.fechaNacimiento = fechaNacimiento;

        this.email = email;

        
    }

    public Paciente() {
    }
    

}