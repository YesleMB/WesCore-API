package com.wescore.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.wescore.api.entity.RelacaoId;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "promo_relacao")

public class Relacao {
    
    @EmbeddedId
    private RelacaoId id;

    @Column(name = "qt_visitas")
    private Long qtVisitas;
}
