package dev.luizeduardo.CadastroNinja.Missoes;

import org.springframework.stereotype.Component;

@Component
public class MissaoMapper {

    public  MissoesModel map(MissaoDTO missaoDTO){
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missaoDTO.getId());
        missoesModel.setNome(missaoDTO.getNome());
        missoesModel.setDificuldade(missaoDTO.getDificuldade());
        return missoesModel;

    }

    public MissaoDTO map (MissoesModel missoesModel){
        MissaoDTO missaoDTO = new MissaoDTO();
        missaoDTO.setId(missoesModel.getId());
        missaoDTO.setNome(missoesModel.getNome());
        missaoDTO.setDificuldade(missoesModel.getDificuldade());

        return missaoDTO;
    }
}
