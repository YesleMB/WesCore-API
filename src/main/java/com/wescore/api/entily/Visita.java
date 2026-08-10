package com.wescore.api.entily;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Table(name = "promo_visita")
public class Visita {

    @Id
    @Column(name = "id_visita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisita;

    @Column(name = "codcli")
    private Long codcli;

    @Column(name = "id_promotor")
    private Long idPromotor;

    @Column(name = "dtvisita")
    private LocalDateTime dtvisita;

    @Column(name = "uf")
    private String uf;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private String numero;



}
