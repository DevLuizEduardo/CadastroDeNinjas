package dev.java.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public List<NinjaModel> mostrarTodosOsNinjas(){

        return  ninjaService.listarNinjas();
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
