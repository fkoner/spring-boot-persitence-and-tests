package com.microsip.training.models;

import javax.persistence.*;

/**
 * Created by paco_technogi on 14/03/17.
 */
@Entity(name = "Articulo")
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "clave")
    private String clave;
    @Column(name = "precio")
    private Float precio;

    @ManyToOne()
    private LineaDeArticulo lineaDeArticulo;

    public Articulo() {
    }

    public Articulo(String nombre, String clave, Float precio, LineaDeArticulo lineaDeArticulo) {
        this.nombre = nombre;
        this.clave = clave;
        this.precio = precio;
        this.lineaDeArticulo = lineaDeArticulo;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public LineaDeArticulo getLineaDeArticulo() {
        return lineaDeArticulo;
    }

    public void setLineaDeArticulo(LineaDeArticulo lineaDeArticulo) {
        this.lineaDeArticulo = lineaDeArticulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Articulo articulo = (Articulo) o;

        if (id != null ? !id.equals(articulo.id) : articulo.id != null) return false;
        if (nombre != null ? !nombre.equals(articulo.nombre) : articulo.nombre != null) return false;
        if (clave != null ? !clave.equals(articulo.clave) : articulo.clave != null) return false;
        if (precio != null ? !precio.equals(articulo.precio) : articulo.precio != null) return false;
        return lineaDeArticulo != null ? lineaDeArticulo.equals(articulo.lineaDeArticulo) : articulo.lineaDeArticulo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (lineaDeArticulo != null ? lineaDeArticulo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", precio=" + precio +
                ", lineaDeArticulo=" + lineaDeArticulo +
                '}';
    }
}
