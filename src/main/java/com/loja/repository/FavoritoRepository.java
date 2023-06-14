package com.loja.repository;

import com.loja.model.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

}
