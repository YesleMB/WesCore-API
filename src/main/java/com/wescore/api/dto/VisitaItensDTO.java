package com.wescore.api.dto;


public record VisitaItensDTO(
     Long idvisitaItem, 
     Long idVisita,
     Long idItem,
     String respostaTexto,
     Boolean respostaBoolean,
     int idOpcaoEscolhida,
     long idCheck
) {

}
