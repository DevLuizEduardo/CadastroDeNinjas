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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){

        return ninjaService.criarNinja(ninja);
    }
    //Mostrar todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaDTO> mostrarTodosOsNinjas(){

        return  ninjaService.listarNinjas();
    }

    //Mostrar Ninja por ID
    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjaPorId(@PathVariable int id){
        return ninjaService.listarNinjasPorId(id);

    }

    //Alterar dados dos Ninjas
    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorId(@PathVariable long id, @RequestBody NinjaDTO ninja){
        return ninjaService.atualizarNinja(id, ninja);
    }

    //Deletar Ninja
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable long id){

        ninjaService.deletarNinjaPorId(id);
    }

}
