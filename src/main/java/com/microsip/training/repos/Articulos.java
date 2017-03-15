package com.microsip.training.repos;

import com.microsip.training.models.Articulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Carlos on 14/03/17.
 */
@Repository
public interface Articulos extends PagingAndSortingRepository<Articulo, Long> {

    //@Query(value = "SELECT linea.articulos FROM LineaDeArticulo linea WHERE linea.id = ?1", nativeQuery = true)
    @Query("SELECT linea.articulos FROM LineaDeArticulo linea WHERE linea.id = ?1")
    Page<Articulo> findByParent(Long id, Pageable pageable);
}
