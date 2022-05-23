package br.com.julioneto.semana_05_projeto_gradle.services;

import br.com.julioneto.semana_05_projeto_gradle.dao.ColaboradorDAO;
import br.com.julioneto.semana_05_projeto_gradle.dto.ColaboradorDTO;
import br.com.julioneto.semana_05_projeto_gradle.model.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ColaboradorServiceImpl implements IColaboradorService {
    @Autowired
    private ColaboradorDAO dao;

    @Override
    public List<ColaboradorDTO> recuperarTodos() {
        return dao.recuperarTodos();
    }

    @Override
    public Colaborador incluirColaborador(Colaborador novo) {
        return dao.save(novo);
    }


}
