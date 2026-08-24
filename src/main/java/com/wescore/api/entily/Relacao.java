package com.wescore.api.entily;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "promo_relacao")

public class Relacao {
    
    @Column(name = "codcli")
    private Long codcli;

    @Column(name = "id_promotor")
    private Long id_promotor;

    @Column(name = "qt_visitas")
    private Long qt_visitas;
}
