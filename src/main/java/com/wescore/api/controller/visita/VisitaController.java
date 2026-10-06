package com.wescore.api.controller.visita;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wescore.api.dto.VisitaRequestDTO;
import com.wescore.api.entity.visita.Visita;
import com.wescore.api.security.SecurityUtils;
import com.wescore.api.service.visita.VisitaService;

import java.security.Principal;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController 
@RequestMapping("/api")
public class VisitaController {
    private final VisitaService visitaService;
    
    @GetMapping("/visita/{idVisita}")
    public ResponseEntity<Visita> buscarPorId(@PathVariable Long idVisita) {
        return ResponseEntity.ok(visitaService.buscarPorId(idVisita));
    }

 @GetMapping("/visita/minhas-visitas") 
public ResponseEntity<List<Visita>> buscarMinhasVisitas(Principal principal) {
    
    
    Long idPromotorAutenticado = Long.valueOf(principal.getName());
    
    List<Visita> visitas = visitaService.buscarPorIdPromotor(idPromotorAutenticado);
    
    if (visitas.isEmpty()) {
        
        return ResponseEntity.noContent().build(); 
    }
    
    return ResponseEntity.ok(visitas);
}
   
    @PostMapping("/enviar-visita")
public ResponseEntity<Visita> cadastrarVisita(@RequestBody VisitaRequestDTO visitaRequest) {
    Long idRealDoPromotor = SecurityUtils.getUsuarioLogadoId();
    
    Visita visitaSalva = visitaService.salvarVisitaComItens(visitaRequest, idRealDoPromotor);
    return ResponseEntity.status(HttpStatus.CREATED).body(visitaSalva);
}
}


