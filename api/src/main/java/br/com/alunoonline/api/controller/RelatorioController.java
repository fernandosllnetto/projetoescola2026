package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.RelatorioMatricula;
import br.com.alunoonline.api.repository.RelatorioMatriculaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    private final RelatorioMatriculaRepository repository;

    public RelatorioController(RelatorioMatriculaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/matriculas")
    public List<RelatorioMatricula> listarMatriculas() {
        return repository.findAll();
    }
}