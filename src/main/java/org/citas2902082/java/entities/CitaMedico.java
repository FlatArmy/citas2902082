package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.EstadoCita;

public class CitaMedico extends Cita {

    private String motivo;
    private Medico medico;
    private EstadoCita estado;

    public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
