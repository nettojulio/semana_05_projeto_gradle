package br.com.julioneto.semana_05_projeto_gradle.controllers;

import br.com.julioneto.semana_05_projeto_gradle.dto.ColaboradorDTO;
import br.com.julioneto.semana_05_projeto_gradle.model.Colaborador;
import br.com.julioneto.semana_05_projeto_gradle.services.IColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private IColaboradorService service;

    @GetMapping("/")
    public ResponseEntity<List<ColaboradorDTO>> sayHello() {
        return ResponseEntity.ok(service.recuperarTodos());
    }

    @PostMapping("/")
    public Colaborador adicionarColaborador(@RequestBody Colaborador novo) {
        return service.incluirColaborador(novo);
    }

}
