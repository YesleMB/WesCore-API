package com.wescore.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wescore.api.entity.Cliente;
import com.wescore.api.repository.ClientesRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;
    public List<Cliente> findClientesByIdPromotor(Long idPromotor) {
        return clientesRepository.findClientesByIdPromotor(idPromotor);
    }



}
