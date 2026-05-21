package dev.luizeduardo.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }
    //Mostrar todos os Ninjas(READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){

        return ninjaService.listarNinjasPorId(id);
    }

    //Alterar dados dos Ninjas(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "Alterar Ninja por ID";
    }
    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjasPorId(){
        return "Ninja deletado por ID";
    }

}
