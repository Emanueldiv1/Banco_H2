package com.bancoh2.consumindo_banco_h2.Jogos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Jogos")
@Getter
@Setter
//cria constructor com todos as variaveis declaradas no model
@AllArgsConstructor
@NoArgsConstructor
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    ///Especifica que o valor da chave primária será gerado automaticamente pelo banco de dados
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "genero")
    private String genero;

    @Column(name = "lancamento")
    private Date lancamento;

    @Column(name = "plataforma")
    private String plataforma;
}
