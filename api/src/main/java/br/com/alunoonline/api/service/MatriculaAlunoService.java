package br.com.alunoonline.api.service;

import br.com.alunoonline.api.dtos.AtualizarNotasRequestDTO;
import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import br.com.alunoonline.api.strategy.AprovacaoMediaSeteStrategy;
import br.com.alunoonline.api.strategy.RegraAprovacaoStrategy;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaAlunoRepository;

    // ═══════════════ ATUALIZAR NOTAS ═══════════════
    public void atualizarNotas(Long id,
                               AtualizarNotasRequestDTO dto) {

        // 1) Buscar matrícula (mesmo padrão do trancar)
        MatriculaAluno matricula =
                matriculaAlunoRepository.findById(id)
                        .orElseThrow(() -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Matricula não encontrada"));

        // 2) Só atualiza o que veio preenchido (PATCH parcial!)
        if (dto.getNota1() != null)
            matricula.setNota1(dto.getNota1());
        if (dto.getNota2() != null)
            matricula.setNota2(dto.getNota2());

        // 3) Se as 2 notas existem, calcula média e define status
        if (matricula.getNota1() != null
                && matricula.getNota2() != null) {
            RegraAprovacaoStrategy estrategia =
                    new AprovacaoMediaSeteStrategy();

            boolean aprovado =
                    estrategia.aprovado(
                            matricula.getNota1(),
                            matricula.getNota2());

            matricula.setStatus(
                    aprovado
                            ? MatriculaAlunoStatusEnum.APROVADO
                            : MatriculaAlunoStatusEnum.REPROVADO);
        }

        // 4) Salvar a matrícula atualizada
        matriculaAlunoRepository.save(matricula);
    }

    // ═══════════════ CRIAR MATRÍCULA ═══════════════
    public void criarMatricula(MatriculaAluno matriculaAluno) {
        matriculaAluno.setStatus(
                MatriculaAlunoStatusEnum.MATRICULADO);  // Status automático!
        matriculaAlunoRepository.save(matriculaAluno);
    }
    public void trancarMatricula(Long id) {

        // 1) Buscar a matrícula — se não existir, 404
        MatriculaAluno matricula =
                matriculaAlunoRepository.findById(id)
                        .orElseThrow(() -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Matricula não encontrada"));

        // 2) Só pode trancar se estiver MATRICULADO
        if (matricula.getStatus()
                .equals(MatriculaAlunoStatusEnum.MATRICULADO)) {
            matricula.setStatus(
                    MatriculaAlunoStatusEnum.TRANCADO);
            matriculaAlunoRepository.save(matricula);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Só é possível trancar com status MATRICULADO");
        }
    }
}