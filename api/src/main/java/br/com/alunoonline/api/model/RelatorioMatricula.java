package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "vw_relatorio_matriculas")
public class RelatorioMatricula {

    @Id
    @Column(name = "matricula_id")
    private Long matriculaId;

    private String aluno;

    private String disciplina;

    private Double nota1;

    private Double nota2;

    private Double media;

    private String status;
}