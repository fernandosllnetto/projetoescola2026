package br.com.alunoonline.api.factory;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.model.Professor;

public class UsuarioFactory {

    public static Usuario criarUsuario(String tipo) {

        if (tipo.equalsIgnoreCase("ALUNO")) {
            return new Aluno();
        }

        if (tipo.equalsIgnoreCase("PROFESSOR")) {
            return new Professor();
        }

        throw new IllegalArgumentException("Tipo inválido");
    }
}