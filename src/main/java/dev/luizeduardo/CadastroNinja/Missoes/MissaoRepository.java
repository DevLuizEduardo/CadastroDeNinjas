package dev.luizeduardo.CadastroNinja.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissaoRepository extends JpaRepository<MissoesModel,Long> {
}
