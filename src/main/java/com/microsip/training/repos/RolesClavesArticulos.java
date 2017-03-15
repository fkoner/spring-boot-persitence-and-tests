package com.microsip.training.repos;

import com.microsip.training.models.RolClaveArticulo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Carlos on 15/03/17.
 */
@Repository
public interface RolesClavesArticulos {

    public List<RolClaveArticulo> findByNombre(String nombre);

    public RolClaveArticulo insertarRol(RolClaveArticulo rolClaveArticulo);
}
