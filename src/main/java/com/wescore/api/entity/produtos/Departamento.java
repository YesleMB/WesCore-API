package com.wescore.api.entity.produtos;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "promo_departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_dep;

    @Column(nullable = false)
    private Integer codepto;

    @Column(nullable = false, length = 225)
    private String departamento;

    @Column(nullable = false)
    private Boolean ativo = true;
}