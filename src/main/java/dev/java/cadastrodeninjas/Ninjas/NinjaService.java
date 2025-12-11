package dev.java.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Lista Todos os Ninjas Cadastrados
    public List<NinjaDTO> listarNinjas(){
         List<NinjaModel> ninjas = ninjaRepository.findAll();

        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    //Lista o Ninja pelo Id
    public NinjaDTO listarNinjasPorId(long id){

        Optional<NinjaModel>ninjaModel = ninjaRepository.findById(id);

        return ninjaModel.map(ninjaMapper::map).orElse(null);
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


    public NinjaDTO atualizarNinja(long id ,NinjaDTO ninjaDTO){

     Optional<NinjaModel>ninjasModel = ninjaRepository.findById(id);

     if (ninjasModel.isPresent()){
         NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
         ninjaAtualizado.setId(id);
        NinjaModel ninjaSalva = ninjaRepository.save(ninjaAtualizado);

        return ninjaMapper.map(ninjaSalva);

     }
     return null;
    }
}
