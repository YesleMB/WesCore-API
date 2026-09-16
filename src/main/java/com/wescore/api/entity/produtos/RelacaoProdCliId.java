package com.wescore.api.entity.produtos;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class RelacaoProdCliId implements Serializable {
    
    private Integer codprod;
    private Integer codcli;
}