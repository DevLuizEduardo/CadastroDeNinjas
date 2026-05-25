package dev.luizeduardo.CadastroNinja.Missoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    private final MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MissaoDTO>> listarMissao(){

        List<MissaoDTO> lista = missaoService.listarMissoes();

        return ResponseEntity.ok(lista);
    }
    @PostMapping("/criar")
    public ResponseEntity<String> criarMissao(@RequestBody MissaoDTO missaoDTO){
       missaoService.criarMissao(missaoDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Missao Criada com sucesso");
    }


    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarMissao(@PathVariable Long id,@RequestBody MissaoDTO missaoDTO){
        MissaoDTO missaoAtualizada = missaoService.atualizarMissao(id,missaoDTO);
        if(missaoAtualizada!=null){
            return ResponseEntity.ok(missaoAtualizada);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Missao nao encontrada");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissao(@PathVariable Long id){
        if(missaoService.listarMissaoPorId(id)!=null){
            missaoService.deletarMissao(id);
            return ResponseEntity.ok("Missao deletada com sucesso!!");

        }else {

            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Missao nao encontrada");
        }
    }
}
