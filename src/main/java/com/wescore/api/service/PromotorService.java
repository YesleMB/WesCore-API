package com.wescore.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wescore.api.entity.Promotor;
import com.wescore.api.repository.PromotorRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class PromotorService {
    
    private final PromotorRepository promotorRepository;
    public List<Promotor> findAll() {
        return promotorRepository.findAll();
    }

    public Promotor buscarPorId(Long id) {
        return promotorRepository.findById(id).orElse(null);
    }
	
    
 

}
