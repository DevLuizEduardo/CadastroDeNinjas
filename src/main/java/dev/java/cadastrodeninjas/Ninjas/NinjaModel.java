package dev.java.cadastrodeninjas.Ninjas;


import dev.java.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //Muitos Ninjas para uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;


}
