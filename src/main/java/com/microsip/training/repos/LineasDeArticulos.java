package com.microsip.training.repos;

import com.microsip.training.models.LineaDeArticulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Carlos on 14/03/17.
 */
@Repository
public interface LineasDeArticulos extends PagingAndSortingRepository<LineaDeArticulo, Long> {

    public Page<LineaDeArticulo> findByNombre(String nombre, Pageable pageable);
}
