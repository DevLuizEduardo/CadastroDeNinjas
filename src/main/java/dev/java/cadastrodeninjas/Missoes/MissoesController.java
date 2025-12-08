package dev.java.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Lista de Missoes";
    }

    @PostMapping("/criar")
    public String criarMissoes(){

        return "Missao criada.";

    }

    @PutMapping("/alterar")
    public String alterarMissoes(){
        return "Missao alterada.";
    }

    @DeleteMapping("/deletar")
    public String deletarMissoes(){
        return "Missao deletada.";
    }


}
