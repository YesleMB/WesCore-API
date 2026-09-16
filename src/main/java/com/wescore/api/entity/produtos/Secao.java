package com.wescore.api.entity.produtos;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "promo_secao")
public class Secao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dep", nullable = false)
    private Departamento departamento;

    @Column(nullable = false)
    private Integer codsec;

    @Column(nullable = false, length = 225)
    private String secao;

    @Column(nullable = false)
    private Boolean ativo = true;
}