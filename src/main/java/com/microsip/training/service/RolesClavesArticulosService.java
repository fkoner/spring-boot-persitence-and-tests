package com.microsip.training.service;

import com.microsip.training.models.RolClaveArticulo;
import com.microsip.training.repos.RolesClavesArticulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Carlos on 15/03/17.
 */
@Service
public class RolesClavesArticulosService {

    private final RolesClavesArticulos rolesClavesArticulos;

    @Autowired
    public RolesClavesArticulosService(RolesClavesArticulos rolesClavesArticulos) {
        this.rolesClavesArticulos = rolesClavesArticulos;
    }

    public List<RolClaveArticulo> findByNombre(String nombre) {
        return rolesClavesArticulos.findByNombre(nombre);
    }

    public RolClaveArticulo insertarRol(RolClaveArticulo rolClaveArticulo) {
        return rolesClavesArticulos.insertarRol(rolClaveArticulo);
    }
}
