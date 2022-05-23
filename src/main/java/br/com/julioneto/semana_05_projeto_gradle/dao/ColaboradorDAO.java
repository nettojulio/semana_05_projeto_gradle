package br.com.julioneto.semana_05_projeto_gradle.dao;

import br.com.julioneto.semana_05_projeto_gradle.dto.ColaboradorDTO;
import br.com.julioneto.semana_05_projeto_gradle.model.Colaborador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ColaboradorDAO extends CrudRepository<Colaborador, Integer> {

    @Query("    SELECT "
            + "new br.com.julioneto.semana_05_projeto_gradle.dto.ColaboradorDTO("
            + "  colaborador.matriculaRe,"
            + "  colaborador.nome,"
            + "  colaborador.departamento,"
            + "  colaborador.salario,"
            + "  colaborador.adicionais,"
            + "  colaborador.outrosDescontos) "
            + "FROM Colaborador as colaborador")
    public List<ColaboradorDTO> recuperarTodos();
}
