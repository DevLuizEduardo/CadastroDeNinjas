package dev.java.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    //Lista Todos os Ninjas Cadastrados
    public List<NinjaModel> listarNinjas(){

        return ninjaRepository.findAll();
    }

    //Lista o Ninja pelo Id
    public NinjaModel listarNinjasPorId(long id){

        Optional<NinjaModel>ninjaModel = ninjaRepository.findById(id);

        return ninjaModel.orElse(null);
    }

    //Criar um novo Ninja
    public NinjaModel criarNinja(NinjaModel ninja){

        return ninjaRepository.save(ninja);
    }

    //Deleta o Ninja da minha tb_cadastro
    public void deletarNinjaPorId(long id){

        ninjaRepository.deleteById(id);
    }


    public NinjaModel atualizarNinja(long id ,NinjaModel ninjaAtualizado){

        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }

        return null;

    }
}
