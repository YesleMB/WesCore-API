package com.wescore.api.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@Entity
@Table(name = "promo_cotacao")
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cotacao;

    @Column(nullable = false, unique = true, length = 50)
    private String numcotacao;

    @Column(nullable = false)
    private Integer id_promotor;

    @Column(nullable = false)
    private Integer codcli;

    @CreationTimestamp
    @Column(name = "data_cotacao", nullable = false, updatable = false)
    private LocalDateTime dataCotacao;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb", nullable = false)
    private Map<String, Object> cotacao; 
    
   
}