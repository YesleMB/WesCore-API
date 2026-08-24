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

@Table(name = "promo_visita_itens")
public class Visita_itens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_visita_item")
    private Long idvisita_item;   

    @Column(nullable = false,name = "id_visita")
    private Long id_visita;

    @Column(nullable = false,name = "id_item")
    private Long id_item;

    @Column(nullable = false,name = "resposta_texto")
    private String resposta_texto;

    @Column(nullable = false,length = 1,name = "resposta_boolean")
    private Boolean resposta_boolean;

    @Column(nullable = false,name = "id_opcao_escolhida")
    private int id_opcao_escolhida;

    @Column(nullable = false,name = "id_check")
    private long id_check;

}
