package com.microsip.training.service;

import com.microsip.training.models.RolClaveArticulo;
import com.microsip.training.repos.RolesClavesArticulos;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;

/**
 * Created by Carlos on 15/03/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RolesClavesArticulosServiceTest {

    private Logger logger = LoggerFactory.getLogger(RolesClavesArticulosServiceTest.class);

    @MockBean
    private RolesClavesArticulos rolesClavesArticulos;

    @Autowired
    private RolesClavesArticulosService rolesClavesArticulosService;

    @Test
    public void findByNombreShouldReturnValues() {
        logger.info("Inicio Prueba!!!!!!!!!!!!");
        RolClaveArticulo rol = new RolClaveArticulo(1L, "Clave");
        given(this.rolesClavesArticulos.findByNombre(anyString())).willReturn(Arrays.asList(
                new RolClaveArticulo[]{
                        rol
                }
        ));
        List<RolClaveArticulo> roles = rolesClavesArticulosService.findByNombre("Clave");
        assertThat(roles).containsOnlyOnce(rol);
        logger.info("Fin Prueba!!!!!!!!!!!!");
    }

    @Test
    public void insertarRol() {
        logger.info("Inicio Prueba!!!!!!!!!!!!");

        RolClaveArticulo rol = new RolClaveArticulo(1L, "Clave");
        given(this.rolesClavesArticulos.insertarRol(anyObject())).willReturn(
                new RolClaveArticulo(1L, "Clave")
        );
        RolClaveArticulo nuevoRol = rolesClavesArticulosService.insertarRol(rol);
        assertThat(nuevoRol).isEqualTo(rol);
        logger.info("Fin Prueba!!!!!!!!!!!!");
    }
}
