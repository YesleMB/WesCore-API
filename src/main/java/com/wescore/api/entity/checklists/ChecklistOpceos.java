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

@Getter             
@Setter              
@NoArgsConstructor   
@AllArgsConstructor 
@ToString   

@Entity

@Table(name = "promo_checklist_opcoes")
public class ChecklistOpceos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id_opcao")
    private Long id;

    @Column(nullable = false,name = "id_item")
    private Long idItem;

    @Column(nullable = false,length = 255,name = "opcao_texto")
    private String opcao;
}