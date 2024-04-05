package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.EstadoCita;

public class CitaMedico extends Cita implements IAgendable{

    private String motivo;
    private Medico medico;
    private EstadoCita estado;
    public CitaMedico(Integer id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivo,
            Medico medico, EstadoCita estado) {
        super(id, fecha, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
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



    public EstadoCita getEstado() {
        return estado;
    }



    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }



    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public void cancelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }
    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }



    @Override
    public String toString() {
        return "CitaMedico [id=" + id + ", fecha=" + fecha    + ", Consultorio= "+ consultorio.getDireccion() + ", Motivo="
                + getMotivo() + ", Estado=" + getEstado() + "]";
    }
    
    

}
