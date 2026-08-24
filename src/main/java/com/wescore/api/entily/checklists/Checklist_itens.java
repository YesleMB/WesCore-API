package com.wescore.api.entily.checklists;

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
public class Checklist_itens {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_item")
    private Long id_item;   

    @Column(nullable = false,name = "id_check")
    private Long id_check;

    @Column(nullable = false,name = "pergunta_ordem")
    private Integer pergunta_ordem;

    @Column(nullable = false,name = "pergunta_texto")
    private String pergunta_texto;

    @Column(nullable = false,name = "tipo_pergunta")
    private String tipo_pergunta;
}
