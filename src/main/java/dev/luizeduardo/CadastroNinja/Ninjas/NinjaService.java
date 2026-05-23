package dev.luizeduardo.CadastroNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

   private final NinjaRepository ninjaRepository;
   private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas

    public List<NinjaDTO> listarNinjas(){
           List<NinjaModel> ninjas = ninjaRepository.findAll();
           return ninjas.stream()
                   .map(ninjaMapper::map)
                   .collect(Collectors.toList());

    }

    //Listar Ninjas por ID
    public NinjaDTO listarNinjasPorId(Long id){

        Optional<NinjaModel>ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);

    }

    //Criar um novo Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){

        NinjaModel ninja =  ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);


    }

    //Alterar Ninja
    public NinjaDTO atualizarNinja(Long id,NinjaDTO ninjaDTO){

       Optional<NinjaModel>ninjaExistente = ninjaRepository.findById(id);
       if(ninjaExistente.isPresent()){
           NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
           ninjaAtualizado.setId(id);
           NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
           return ninjaMapper.map(ninjaSalvo);
       }
       return null;
    }

    //Deletar Ninja por ID

    public void deletarNinjaPorId(Long id){
          ninjaRepository.deleteById(id);

    }
}
