package com.wescore.api.entity.produtos;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "promo_relacao_prodcli")
public class RelacaoProdCli {

    @EmbeddedId
    private RelacaoProdCliId id;

    @Column(nullable = false)
    private Integer qt;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal pvenda;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal ptabela;

    @CreationTimestamp
    @Column(name = "data_registro", nullable = false, updatable = false)
    private LocalDateTime dataRegistro;
}