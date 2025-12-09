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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){

        return ninjaService.criarNinja(ninja);
    }
    //Mostrar todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){

        return  ninjaService.listarNinjas();
    }

    //Mostrar Ninja por ID
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable int id){
        return ninjaService.listarNinjasPorId(id);

    }

    //Alterar dados dos Ninjas
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Ninja Alterado";
    }

    //Deletar Ninja
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable long id){

        ninjaService.deletarNinjaPorId(id);
    }

}
