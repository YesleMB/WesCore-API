package com.wescore.api.controller;


import org.springframework.web.bind.annotation.RestController;

import com.wescore.api.entity.Cliente;
import com.wescore.api.service.ClientesService;

import lombok.RequiredArgsConstructor;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClientesController {
    private final ClientesService clientesService;
    @GetMapping("/clientes")
    public ResponseEntity<?> findClientesByIdPromotor(@RequestParam("promotor") Long idPromotor) {       
     return ResponseEntity.ok(clientesService.findClientesByIdPromotor(idPromotor));

    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
        Cliente clienteSalvo = clientesService.cadastrar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
}
}
