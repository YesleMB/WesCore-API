package com.wescore.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;


@Getter             
@Setter              
@NoArgsConstructor   
@AllArgsConstructor 
@ToString           

@Entity

@Table(name = "promo_funcionarios")

public class Promotor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "id")
    private Long id;

    @Column(nullable = false, length = 150,name = "nome")
    private String nome;
    
    @Column(nullable = false, length = 150,name = "sobrenome")
    private String sobrenome;
    
    @Column(nullable = false, length = 9,name = "cep")
    private String cep;
   
    @Column(nullable = false, length = 250,name = "endereco")
    private String endereco;
    
    @Column(nullable = false, length = 20,name = "numero")
    private String numero;
    
    @Column(nullable = false, length = 100,name = "bairro")
    private String bairro;
    
    @Column(nullable = false, length = 255,name = "municipio")
    private String municipio;
    
    @Column(nullable = false, length = 2,name = "uf")
    private String uf;
    
    @Column(length = 2,name = "tipoFunc")
    private String tipoFunc;

    @Column(nullable = false, length = 255,name = "email")
    private String email;

    @Column(nullable = false, length = 11,name = "senha")
    private String senha;
}
