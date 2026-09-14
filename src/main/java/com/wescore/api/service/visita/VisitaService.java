package com.wescore.api.service.visita;

import org.springframework.stereotype.Service;

import java.util.List;
import com.wescore.api.entity.visita.Visita;
import com.wescore.api.repository.visitas.VisitaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.transaction.annotation.Transactional;
import com.wescore.api.dto.VisitaRequestDTO;
import com.wescore.api.entity.visita.VisitaItens;
import com.wescore.api.repository.visitas.VisitasItensRepository;

@RequiredArgsConstructor
@Service 
public class VisitaService {
    private final VisitaRepository visitaRepository;
    private final VisitasItensRepository visitasItensRepository;
    
    public Visita buscarPorId(Long idVisita) {
        return visitaRepository.findById(idVisita).orElse(null);
    }

    public List<Visita> buscarPorIdPromotor(Long idPromotor) {
        return visitaRepository.findByIdPromotor(idPromotor);
    }

    public Visita salvarVisita(Visita visita) {
        return visitaRepository.save(visita);
    }

    @Transactional
    public Visita salvarVisitaComItens(VisitaRequestDTO dto) {
        Visita visita = new Visita();
        visita.setIdPromotor(dto.idPromotor());
        visita.setCodcli(dto.codcli());
        visita.setDataVisita(dto.dataVisita());
        visita.setUf(dto.uf());
        visita.setMunicipio(dto.municipio());
        visita.setBairro(dto.bairro());
        visita.setEndereco(dto.endereco());
        visita.setNumero(dto.numero());
        visita.setObservacao(dto.observacao());
        visita.setLatitude(dto.latitude());
        visita.setLongitude(dto.longitude());

        Visita visitaSalva = visitaRepository.save(visita);

        if (dto.itens() != null && !dto.itens().isEmpty()) {
            java.util.List<VisitaItens> entidadesItens = new java.util.ArrayList<>();
            for (com.wescore.api.dto.VisitaItensDTO itemDto : dto.itens()) {
                VisitaItens itemEntity = new VisitaItens();
                itemEntity.setIdVisita(visitaSalva.getIdVisita());
                itemEntity.setIdItem(itemDto.idItem());
                itemEntity.setRespostaTexto(itemDto.respostaTexto());
                itemEntity.setRespostaBoolean(itemDto.respostaBoolean());
                itemEntity.setIdOpcaoEscolhida(itemDto.idOpcaoEscolhida());
                itemEntity.setIdCheck(itemDto.idCheck());
                
                entidadesItens.add(itemEntity);
            }
            visitasItensRepository.saveAll(entidadesItens);
        }

        return visitaSalva;
    }
}
