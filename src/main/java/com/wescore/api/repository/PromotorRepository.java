package com.wescore.api.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.wescore.api.entity.Promotor;

@Repository
public interface PromotorRepository extends JpaRepository<Promotor, Long> {
}