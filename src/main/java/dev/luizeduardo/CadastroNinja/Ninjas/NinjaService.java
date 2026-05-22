package dev.luizeduardo.CadastroNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

   private NinjaRepository ninjaRepository;
   private NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas

    public List<NinjaModel> listarNinjas(){

        return ninjaRepository.findAll();

    }

    //Listar Ninjas por ID
    public NinjaModel listarNinjasPorId(Long id){

        Optional<NinjaModel>ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);

    }

    //Criar um novo Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){

        NinjaModel ninja =  ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);


    }

    //Alterar Ninja
    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualizado){

        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }else{
            return null;
        }
    }

    //Deletar Ninja por ID

    public void deletarNinjaPorId(Long id){
          ninjaRepository.deleteById(id);
    }
}
