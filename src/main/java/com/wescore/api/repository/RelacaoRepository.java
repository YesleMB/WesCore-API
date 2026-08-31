package com.wescore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wescore.api.entity.Relacao;
import com.wescore.api.entity.RelacaoId;

@Repository
public interface  RelacaoRepository extends JpaRepository<Relacao, RelacaoId> {

    
}
