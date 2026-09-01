package com.wescore.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wescore.api.entity.Relacao;
import com.wescore.api.entity.RelacaoId;
import com.wescore.api.repository.RelacaoRepository;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@Service
public class RelacaoService {
    private final RelacaoRepository relacaoRepository;
    public List<Relacao> findAll() {
        return relacaoRepository.findAll();
    }
     public Relacao buscarPorId(Long codcli, Long idPromotor) {
        RelacaoId idComposto = new RelacaoId(codcli, idPromotor);
    
        return relacaoRepository.findById(idComposto).orElse(null);
        }
}