package br.com.alunoonline.api.model;

import br.com.alunoonline.api.factory.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "professor")
@Entity
public class Professor implements Usuario {

    @Id                          // "Este campo é a chave primária"
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    @Override
    public String getTipo() {
        return "PROFESSOR";
    }
}

