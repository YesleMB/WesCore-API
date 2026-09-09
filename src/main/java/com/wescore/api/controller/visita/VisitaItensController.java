package com.wescore.api.controller.visita;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wescore.api.service.visita.VisitaItensService;
import com.wescore.api.entity.visita.VisitaItens;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class VisitaItensController {
    private final VisitaItensService visitaItensService;
    
    @GetMapping("/visita-itens/{idVisita}")
    public ResponseEntity<List<VisitaItens>> buscarPorIdVisita(@PathVariable Long idVisita) {
        List<VisitaItens> visitaItens = visitaItensService.buscarPorIdVisita(idVisita);
        return ResponseEntity.ok(visitaItens);  
    }
}