package com.wescore.api.entity.checklists;

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

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor


@Entity

@Table(name = "promo_checklist_itens")
public class ChecklistItens {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_item")
    private Long idItem;   

    @Column(nullable = false,name = "id_check")
    private Long idCheck;

    @Column(nullable = false,name = "pergunta_ordem")
    private Integer perguntaOrdem;

    @Column(nullable = false,name = "pergunta_texto")
    private String perguntaTexto;

    @Column(nullable = false,name = "tipo_pergunta")
    private String tipoPergunta;
}
