package com.wescore.api.dto;

import java.time.LocalDate;
import java.util.List;
import com.wescore.api.dto.VisitaItensDTO;
public record VisitaRequestDTO(
    Long idVisita,
    Long idPromotor,
    Long codcli,
    LocalDate dataVisita,
    String uf,
    String municipio,
    String bairro,
    String endereco,
    String numero,
    String observacao,
    String latitude,
    String longitude,
    List<VisitaItensDTO> itens

) {
}