package dev.java.cadastrodeninjas;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }



}
