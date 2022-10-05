package com.modulo7.cadastroUsuarios.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(length = 11, nullable = false)
    private String telefone;

    @Column(length = 12, nullable = false)
    private String login;

    @Column(length = 20, nullable = false)
    private String senha;

    public UsuarioModel(String nome, int idade, String telefone, String login, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }
}
