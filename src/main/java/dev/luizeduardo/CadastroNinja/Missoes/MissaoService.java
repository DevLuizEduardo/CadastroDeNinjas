package dev.luizeduardo.CadastroNinja.Missoes;

import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissaoService {
    private final MissaoRepository missaoRepository;

    private final MissaoMapper missaoMapper;

    public MissaoService(MissaoRepository missaoRepository, MissaoMapper missaoMapper) {
        this.missaoRepository = missaoRepository;
        this.missaoMapper = missaoMapper;
    }

    public MissaoDTO criarMissao (MissaoDTO missaoDTO){
        MissoesModel missoesModel = missaoMapper.map(missaoDTO);
        missoesModel = missaoRepository.save(missoesModel);

        return missaoMapper.map(missoesModel);

    }

    public List<MissaoDTO> listarMissoes(){
        List<MissoesModel> missoes = missaoRepository.findAll();

        return missoes.stream()
                .map(missaoMapper::map)
                .collect(Collectors.toList());

    }

    public MissaoDTO listarMissaoPorId(Long id){

        Optional<MissoesModel>missao = missaoRepository.findById(id);

        return missao.map(missaoMapper::map).orElse(null);


    }
    public MissaoDTO atualizarMissao(Long id,MissaoDTO missaoDTO){
        Optional<MissoesModel> missao = missaoRepository.findById(id);
        if (missao.isPresent()){
            MissoesModel missoesModel = missaoMapper.map(missaoDTO);
            missoesModel.setId(id);
            MissoesModel missaoSalva = missaoRepository.save(missoesModel);

            return missaoMapper.map(missaoSalva);
        }
            return null;

    }

    public void deletarMissao(Long id){

        missaoRepository.deleteById(id);
    }



}
