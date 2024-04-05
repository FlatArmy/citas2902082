package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoSangre;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import java.time.LocalDateTime;

public class Paciente {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Long numeroIdentificacion;
    public TipoSangre tipoSangre;
    public char factorRH;
    public Double altura;
    public Double peso;
    public LocalDateTime fechaNacimiento;
    public String email;
    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, TipoSangre tipoSangre, char factorRH, Double altura, Double peso,
            LocalDateTime fechaNacimiento, String email) {
        this.id = id;
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public char getFactorRH() {
        return factorRH;
    }
    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Paciente |id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion + ", tipoSangre=" + tipoSangre
                + ", factorRH=" + factorRH + ", altura=" + altura + ", peso=" + peso + ", fechaNacimiento="
                + fechaNacimiento + ", email=" + email + "|";
    }
    
    
}
