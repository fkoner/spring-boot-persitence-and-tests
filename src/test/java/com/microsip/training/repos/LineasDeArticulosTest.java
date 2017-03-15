package com.microsip.training.repos;

import com.microsip.training.models.LineaDeArticulo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Carlos on 15/03/17.
 */

@RunWith(SpringRunner.class)
@DataMongoTest
public class LineasDeArticulosTest {

    @Autowired
    private LineasDeArticulos lineasDeArticulos;

    @Test
    public void buscarLinea() {
        Page<LineaDeArticulo> lineas = lineasDeArticulos.findByNombre("Linea", new PageRequest(1, 10));
    }

}
