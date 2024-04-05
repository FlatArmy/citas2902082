package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public abstract class Usuario {
    
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected TipoIdentificacion tipoIdentificacion;
    protected Long numeroIdentificacion;
        public Usuario(Integer id, String nombre, String apellido, TipoIdentificacion tipoIdentificacion,
                Long numeroIdentificacion) {
            this.id = id;
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
        public String toString() {
            return "Usuario [nombre=" + nombre + ", apellido=" + apellido + "]";
        }
        
        //definir el metodo toString
        
}
