package com.wescore.api.entity.produtos;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "promo_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_produto;

    @Column(nullable = false)
    private Integer codprod;

    @Column(nullable = false, length = 225)
    private String descricao;

    @Column(nullable = false, length = 10)
    private String embalagem;

    @Column(nullable = false, length = 2)
    private String unidade;

    // Relacionamentos desnormalizados baseados no diagrama fornecido
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento", nullable = false)
    private Departamento departamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "secao", nullable = false)
    private Secao secao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca", nullable = false)
    private Marca marca;

    @Column(columnDefinition = "TEXT")
    private String dadotec;

    @Column(columnDefinition = "TEXT")
    private String dadosadc;

    @Column(columnDefinition = "TEXT")
    private String urlimg;

    @Column(nullable = false)
    private Boolean ativo = true;
}