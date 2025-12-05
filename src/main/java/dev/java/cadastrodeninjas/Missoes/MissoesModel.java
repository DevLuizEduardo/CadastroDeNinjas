package dev.java.cadastrodeninjas.Missoes;

import dev.java.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //Uma missão para muitos Ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
