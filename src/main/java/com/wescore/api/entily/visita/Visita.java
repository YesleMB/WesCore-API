package com.wescore.api.entily.visita;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

@Table(name = "promo_visita")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_visita")
    private Long id_visita;

    @Column(nullable = false,name = "id_promotor")
    private Long id_promotor;

    @Column(nullable = false,name = "codcli")
    private Long codcli;

    @Column(nullable = false,name = "dtvisita")
    private java.util.Date data_visita;

    @Column(nullable = false,length = 2,name = "uf")
    private String uf;

    @Column(nullable = false,name = "municipio")
    private String municipio;

    @Column(nullable = false,name = "bairro")
    private String bairro;

    @Column(nullable = false,name = "endereco")
    private String endereco;

    @Column(nullable = false,name = "numero")
    private String numero;


    @Column(nullable = false,name = "observacao")
    private String observacao;

    @Column(nullable = false,name = "latitude")
    private String latitude;

    @Column(nullable = false,name = "longitude")
    private String longitude;


}
