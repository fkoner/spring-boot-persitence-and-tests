package com.microsip.training.controller;

import com.microsip.training.models.Articulo;
import com.microsip.training.models.LineaDeArticulo;
import com.microsip.training.repos.Articulos;
import com.microsip.training.repos.LineasDeArticulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Carlos on 14/03/17.
 */
@RestController
@RequestMapping("/api/lineas")
public class LineaDeArticuloController {

    private final LineasDeArticulos lineasDeArticulos;
    private final Articulos articulos;

    @Autowired
    public LineaDeArticuloController(LineasDeArticulos lineasDeArticulos, Articulos articulos) {
        this.lineasDeArticulos = lineasDeArticulos;
        this.articulos = articulos;
    }


    /*
    @PostConstruct
    private void onInit() {
        if(null != lineasDeArticulos && lineasDeArticulos.count() == 0) {
            for (int i = 1; i <= 50; i++) {
                lineasDeArticulos.save(new LineaDeArticulo("Linea" + i));
            }
            Random r = new Random();

            lineasDeArticulos.findAll().forEach(linea -> {
                Articulo articulo = new Articulo("Articulo " + r.nextInt() + " de linea " + linea.getNombre(),
                        UUID.randomUUID().toString(), r.nextFloat(), linea);
                articulos.save(articulo);
            });
        }
    }*/

    @RequestMapping(method = RequestMethod.GET)
    Page<LineaDeArticulo> listLineas(@PageableDefault Pageable page) {
        return lineasDeArticulos.findAll(page);
    }

    /*
    @RequestMapping(value = "/{nombre}", method = RequestMethod.GET)
    Page<LineaDeArticulo> listLineasPorNombre(@PathVariable(name = "nombre") String nombre, @PageableDefault Pageable page) {
        return lineasDeArticulos.findByNombre(nombre, page);
    }
    */

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    LineaDeArticulo getLineaPorId(@PathVariable(name = "id") Long id) {
        return lineasDeArticulos.findOne(id);
    }

    @RequestMapping(value = "/articulos", method = RequestMethod.GET)
    Page<Articulo> listArticulos(@PageableDefault Pageable page) {
        return articulos.findAll(page);
    }
}
