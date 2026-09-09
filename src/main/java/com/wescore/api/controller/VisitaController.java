package com.wescore.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wescore.api.entity.visita.Visita;
import com.wescore.api.service.VisitaService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RequiredArgsConstructor
@Controller 
@RequestMapping("/api")
public class VisitaController {
    private final VisitaService visitaService;
    @GetMapping("/visita/{idVisita}")
    public ResponseEntity<Visita> buscarPorId(@PathVariable Long idVisita) {
        return ResponseEntity.ok(visitaService.buscarPorId(idVisita));
    }

    @GetMapping("/visita/promotor/{idPromotor}")
    public ResponseEntity<java.util.List<Visita>> buscarPorIdPromotor(@PathVariable Long idPromotor) {
        java.util.List<Visita> visitas = visitaService.buscarPorIdPromotor(idPromotor);
        if (visitas.isEmpty()) {
            throw new RuntimeException("Nenhuma visita encontrada para o promotor com ID: " + idPromotor);
        }
        return ResponseEntity.ok(visitas);
    }


    
}
