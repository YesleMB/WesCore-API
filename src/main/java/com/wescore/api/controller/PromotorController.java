package com.wescore.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.wescore.api.entity.Promotor;
import com.wescore.api.service.PromotorService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PromotorController {
    private final PromotorService promotorService;
@GetMapping("/promotor/{id}")
public ResponseEntity<Promotor> buscarPorId(@PathVariable Long id) {
    Promotor promotor = promotorService.buscarPorId(id);
    
    if (promotor != null) {
        return ResponseEntity.ok(promotor); 
    }
    
    return ResponseEntity.notFound().build(); 
}
}