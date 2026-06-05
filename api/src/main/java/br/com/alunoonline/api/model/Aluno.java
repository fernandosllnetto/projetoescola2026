package br.com.alunoonline.api.model;

import br.com.alunoonline.api.factory.Usuario;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor  // Gera construtor vazio
@AllArgsConstructor // Gera construtor com todos os campos
@Data                // Gera getters, setters, toString, equals
@Table(name = "aluno")   // Nome da tabela no banco
@Entity              // "Esta classe é uma tabela!"
public class Aluno implements Usuario {

    @Id                          // "Este campo é a chave primária"
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
