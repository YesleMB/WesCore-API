package com.wescore.api.service.visita;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wescore.api.repository.visitas.VisitasItensRepository;
import com.wescore.api.entity.visita.VisitaItens;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service 
public class VisitaItensService {
    
    private final VisitasItensRepository visitasItensRepository;
    public List<VisitaItens> buscarPorIdVisita(Long idVisita) {
        return visitasItensRepository.findByIdVisita(idVisita);
    }
}
