package com.wescore.api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wescore.api.entily.Promotor;

@Repository
public interface PromotorRepository extends JpaRepository<Promotor, Integer> {
    List<Promotor> findByNome(String nome);
    List<Promotor> findByUf(String uf);
}