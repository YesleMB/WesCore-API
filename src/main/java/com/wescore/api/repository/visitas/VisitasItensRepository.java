package com.wescore.api.repository.visitas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wescore.api.entity.visita.VisitaItens;

@Repository 
public interface VisitasItensRepository extends JpaRepository<VisitaItens, Long> {
    

    List<VisitaItens> findByIdVisita(Long idVisita);
    
}
