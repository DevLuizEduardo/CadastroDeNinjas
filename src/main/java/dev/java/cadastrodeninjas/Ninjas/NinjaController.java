package dev.java.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){

        return "Boas vindas";
    }


    //Adicionar Ninja
    @PostMapping("/criar")
    public String criarNinja(){

        return "Ninja Criado";
    }
    //Mostrar todos os Ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){

        return "Todos";
    }

    //Mostrar Ninja por ID
    @GetMapping("/id")
    public String mostrarNinjaPorId(){
        return "Ninja";

    }

    //Alterar dados dos Ninjas
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Ninja Alterado";
    }

    //Deletar Ninja
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Ninja Deletado";
    }

}
