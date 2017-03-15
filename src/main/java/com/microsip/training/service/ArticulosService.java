package com.microsip.training.service;

import com.microsip.training.models.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;

/**
 * Created by Carlos on 14/03/17.
 */
public class ArticulosService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ArticulosService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Articulo findById(Long id) {
        return jdbcTemplate.query("SELECT * FROM articulos WHERE id = ?1", new Object[]{id}, rs -> {
            if(rs.next()) {
                Articulo a = new Articulo();
                a.setId(rs.getLong("id"));
                a.setNombre(rs.getString("nombre"));
                return a;
            } else {
                throw new RuntimeException("Articulo " + id +" No encontrado!");
            }
        });
    }
}
