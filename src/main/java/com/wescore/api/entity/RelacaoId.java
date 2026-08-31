package com.wescore.api.entity; // Ajustado para 'entity'

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class RelacaoId implements Serializable {

    private Long codcli;

    @Column(name = "id_promotor")
    private Long idPromotor;
}