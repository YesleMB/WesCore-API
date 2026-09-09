package com.wescore.api.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.wescore.api.entity.visita.Visita;
import com.wescore.api.repository.VisitaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service 
public class VisitaService {
    private final VisitaRepository visitaRepository;
    
    public Visita buscarPorId(Long idVisita) {
        return visitaRepository.findById(idVisita).orElse(null);
    }

    public List<Visita> buscarPorIdPromotor(Long idPromotor) {
        return visitaRepository.findByIdPromotor(idPromotor);
    }

    

    
}
