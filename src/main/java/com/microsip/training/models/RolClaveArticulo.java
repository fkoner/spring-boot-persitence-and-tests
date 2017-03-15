package com.microsip.training.models;

/**
 * Created by Carlos on 15/03/17.
 */
public class RolClaveArticulo {

    private Long id;
    private String nombre;

    public RolClaveArticulo() {
    }

    public RolClaveArticulo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolClaveArticulo that = (RolClaveArticulo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return nombre != null ? nombre.equals(that.nombre) : that.nombre == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RolClaveArticulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
