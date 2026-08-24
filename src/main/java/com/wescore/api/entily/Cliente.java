package com.wescore.api.entily;

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

@Table(name = "promo_clientes")
public class Cliente {
         @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE) 
    @Column(nullable = false,name = "codcli")
    private Long id;

        @Column(nullable = false,length = 1,name = "tipopessoa")
        private String tipoPessoa;

        @Column(nullable = false,length = 14,name = "cgc")
        private String cgc;

        @Column(nullable = false,length = 255,name = "cliente")
        private String cliente;

        @Column(nullable = false,length = 255,name = "fantasia")
        private String fantasia;

        @Column(nullable = false,length = 2,name = "uf")
        private String uf;

        @Column(nullable = false,length = 255,name = "municipio")
        private String municipio;

        @Column(nullable = false,length = 255,name = "endereco")
        private String endereco;

        @Column(nullable = false,length = 10,name = "numero")
        private int numero;

        @Column(nullable = false,length = 255,name = "bairro")
        private String bairro;




        

    
}
