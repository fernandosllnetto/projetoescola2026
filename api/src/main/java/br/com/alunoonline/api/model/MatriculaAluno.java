package br.com.alunoonline.api.model;

import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "matricula_aluno")
@Entity
public class MatriculaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;          // FK -> aluno

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;  // FK -> disciplina

    private Double nota1;
    private Double nota2;

    @Enumerated(EnumType.STRING)  // Salva "MATRICULADO" como texto no banco
    private MatriculaAlunoStatusEnum status;
}