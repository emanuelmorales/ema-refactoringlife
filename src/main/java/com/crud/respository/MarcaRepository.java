package com.crud.respository;

import com.crud.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

    List<Marca> findByFechabajaIsNull();

}
