package br.com.alunoonline.api.model;

import br.com.alunoonline.api.factory.Usuario;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "aluno")
@Entity
public class Aluno implements Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    @Override
    public String getTipo() {
        return "ALUNO";
    }
}
