package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(
                1, "Katherin",
                "Villota",
                TipoIdentificacion.PPT,
                1141315844L,
                123456789L,
                Especialidad.PSICOLOGIA);

        System.out.println(m.toString());

    }
}