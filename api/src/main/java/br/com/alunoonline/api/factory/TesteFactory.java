package br.com.alunoonline.api.factory;

public class TesteFactory {

    public static void main(String[] args) {

        Usuario usuario =
                UsuarioFactory.criarUsuario("PROFESSOR");

        System.out.println(usuario.getTipo());
    }
}