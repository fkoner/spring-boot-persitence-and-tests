package com.microsip.training.models;

/**
 * Created by Carlos on 15/03/17.
 */
public class Moneda {

    private Long id;
    private String nombre;
    private TipoMoneda tipoMoneda;

    public Moneda() {
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

    public TipoMoneda getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(TipoMoneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moneda moneda = (Moneda) o;

        if (id != null ? !id.equals(moneda.id) : moneda.id != null) return false;
        if (nombre != null ? !nombre.equals(moneda.nombre) : moneda.nombre != null) return false;
        return tipoMoneda != null ? tipoMoneda.equals(moneda.tipoMoneda) : moneda.tipoMoneda == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (tipoMoneda != null ? tipoMoneda.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
