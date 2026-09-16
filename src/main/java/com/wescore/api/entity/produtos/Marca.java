package com.wescore.api.entity.produtos;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "promo_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sec", nullable = false)
    private Secao secao;

    @Column(nullable = false)
    private Integer codmarca;

    @Column(nullable = false, length = 225)
    private String marca;

    @Column(nullable = false)
    private Boolean ativo = true;
}