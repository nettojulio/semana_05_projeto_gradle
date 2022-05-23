package br.com.julioneto.semana_05_projeto_gradle.services;

import br.com.julioneto.semana_05_projeto_gradle.dto.ColaboradorDTO;
import br.com.julioneto.semana_05_projeto_gradle.model.Colaborador;

import java.util.List;

public interface IColaboradorService {
    public List<ColaboradorDTO> recuperarTodos();
    public Colaborador incluirColaborador(Colaborador novo);
}
