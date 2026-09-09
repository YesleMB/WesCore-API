package com.wescore.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wescore.api.entity.visita.Visita;


@Repository 
public interface  VisitaRepository extends JpaRepository <Visita, Long> {
    List<Visita> findByIdPromotor(Long idPromotor);
}
    

