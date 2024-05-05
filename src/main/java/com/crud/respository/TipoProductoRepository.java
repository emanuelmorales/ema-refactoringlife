package com.crud.respository;

import com.crud.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {
}
