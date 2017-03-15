package com.microsip.training.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by paco_technogi on 14/03/17.
 */
@Entity(name = "LineaDeArticulo")
@Table(name = "lineasdearticulos")
public class LineaDeArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "lineaDeArticulo", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Articulo> articulos;

    public LineaDeArticulo() {
    }

    public LineaDeArticulo(String nombre) {
        this.nombre = nombre;
    }

    public LineaDeArticulo(Long id, String nombre) {
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

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineaDeArticulo that = (LineaDeArticulo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        return articulos != null ? articulos.equals(that.articulos) : that.articulos == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (articulos != null ? articulos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LineaDeArticulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
