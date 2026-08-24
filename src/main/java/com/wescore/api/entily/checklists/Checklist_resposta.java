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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "promo_checklist_resposta")
public class Checklist_resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE)
    @Column(nullable = false,name = "id_resposta")
    private Long id_resposta;

    @Column(nullable = false,name = "id_item")
    private Long id_item;

    @Column(nullable = false,name = "resposta_texto")
    private String resposta_texto;

    @Column(nullable = false,name = "resposta_booleana")
    private Boolean resposta_booleana;

    @Column(nullable = false,name = "id_opcao_escolhida")
    private int id_opcao_escolhida;

    @Column(nullable = false,name = "data_respondido")
    private java.util.Date data_respondido;
}
