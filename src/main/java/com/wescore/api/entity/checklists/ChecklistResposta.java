package com.wescore.api.entity.checklists;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "promo_checklist_resposta")
public class ChecklistResposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE)
    @Column(nullable = false,name = "id_resposta")
    private Long id_resposta;

    @Column(nullable = false,name = "id_item")
    private Long idItem;

    @Column(nullable = false,name = "resposta_texto")
    private String respostaTexto;

    @Column(nullable = false,name = "resposta_booleana")
    private Boolean respostaBooleana;

    @Column(nullable = false,name = "id_opcao_escolhida")
    private int idOpcaoEscolhida;

    @Column(nullable = false,name = "data_respondido")
    private LocalDate dataRespondido;
}
