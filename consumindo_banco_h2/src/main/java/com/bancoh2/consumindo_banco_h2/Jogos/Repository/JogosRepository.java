package com.bancoh2.consumindo_banco_h2.Jogos.Repository;

import com.bancoh2.consumindo_banco_h2.Jogos.Entity.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface JogosRepository extends JpaRepository<Jogos, Integer> {
    }
