package org.citas2902082.java;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.Cita;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.EstadoCita;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;



public class Main {
    public static void main(String[] args) {

        Medico m = new Medico( 1, "Alex", "Lopez", TipoIdentificacion.PPT, 1141315844L, 123456789L, Especialidad.PSICOLOGIA);
        Medico m1 = new Medico(2,"carlos", "martinez", TipoIdentificacion.TI, 713742L, 364738L, Especialidad.CARDIOLOGIA);
        

        Paciente p1 = new Paciente(3, "édro", "Lopez", TipoIdentificacion.CC,
        6541581L, TipoSangre.A, '+',
        1.75, 69.0, LocalDateTime.of(2024, 05, 15, 07, 34, 23), "edlopez@gmail.com");
        
        Paciente p2 = new Paciente(4, "Angela", "Castaño", TipoIdentificacion.CC,
        4684354L, TipoSangre.B, '-',
        1.55, 39.0, LocalDateTime.of(2024, 12, 15, 07, 12, 01), "Angtaño@hotmail.com");
        
        Paciente p3 = new Paciente(5, "Luigi", "Ortega", TipoIdentificacion.CC,
        98654645L, TipoSangre.A, '+',
        2.05, 109.0, LocalDateTime.of(2023, 12, 25, 11, 45, 59), "luigi@gmail.com");
        
        Paciente p4 = new Paciente(6, "Jorge", "Castro", TipoIdentificacion.CC,
        234789L, TipoSangre.AB, '-',
        1.60, 65.8, LocalDateTime.of(2024, 04, 12, 03, 34, 23), "JorgeCas@gmail.com");
        
        Paciente p5 = new Paciente(7, "Carlos", "Castellanos", TipoIdentificacion.CC,
        995446865L, TipoSangre.O, '+',
        1.83, 87.0, LocalDateTime.of(2022, 01, 05, 11, 23, 42), "Carrelos06@gmail.com");

        
        
        Enfermero e1 = new Enfermero(8, "Mario", "Perez", TipoIdentificacion.PPT, 684135156L);
        Enfermero e2 = new Enfermero(9, "Luis", "Peña", TipoIdentificacion.CC, 475465489L);
        Enfermero e3 = new Enfermero(10, "Cristian", "Ortega", TipoIdentificacion.CM, 498465489L);

        CitaMedico cm1 = new CitaMedico(11, LocalDateTime.of(2024, 01, 19, 01, 43, 45),
         p5, new Consultorio("wer", 344), "gripa", m, EstadoCita.agendar);

         CitaMedico cm2 = new CitaMedico(12, LocalDateTime.of(2023, 11, 03, 11, 12, 30),
         p2, new Consultorio("mar", 1369), "escopolamina", m, EstadoCita.agendar);
        
         CitaMedico cm3 = new CitaMedico(13, LocalDateTime.of(2024, 12, 03, 04, 15, 19), p3, 
         new Consultorio("soy", 648), "gripa", m, EstadoCita.cancelar);



        System.out.println("--------------------------------Medicos--------------------------------");
        System.out.println(m.toString());
        System.out.println(m1.toString());
        System.out.println("--------------------------------Pacientes--------------------------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println("--------------------------------Enfermeros--------------------------------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println("--------------------------------CitaMedico--------------------------------");
        System.out.println(cm1.toString());
        System.out.println(cm2.toString());
        System.out.println(cm3.toString());

    }
    
}