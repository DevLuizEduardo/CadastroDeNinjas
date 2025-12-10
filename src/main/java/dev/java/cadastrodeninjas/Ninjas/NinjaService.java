package dev.java.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
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
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
         return ninjaMapper.map(ninjaModel);
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
