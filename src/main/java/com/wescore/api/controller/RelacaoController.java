package com.wescore.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.wescore.api.entity.Relacao;
import com.wescore.api.service.RelacaoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RelacaoController {
    private final RelacaoService relacaoService;
    @GetMapping("/relacao/{codcli}/{idPromotor}")
    public ResponseEntity<Relacao> buscarPorId(@PathVariable Long codcli, @PathVariable Long idPromotor) {
        Relacao relacao = relacaoService.buscarPorId(codcli, idPromotor);
        
        if (relacao != null) {
            return ResponseEntity.ok(relacao); 
        }
        
        return ResponseEntity.notFound().build(); 
    }



    
}
