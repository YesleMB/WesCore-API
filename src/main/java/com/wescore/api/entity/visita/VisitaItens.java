package com.wescore.api.entity.visita;

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
public class VisitaItens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_visita_item")
    private Long idvisitaItem;   

    @Column(nullable = false,name = "id_visita")
    private Long idVisita;

    @Column(nullable = false,name = "id_item")
    private Long idItem;

    @Column(nullable = false,name = "resposta_texto")
    private String respostaTexto;

    @Column(nullable = false,length = 1,name = "resposta_boolean")
    private Boolean respostaBoolean;

    @Column(nullable = false,name = "id_opcao_escolhida")
    private int idOpcaoEscolhida;

    @Column(nullable = false,name = "id_check")
    private long idCheck;

}
