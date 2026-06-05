package br.com.alunoonline.api.strategy;

public class AprovacaoMediaSeteStrategy implements RegraAprovacaoStrategy {

    @Override
    public boolean aprovado(Double nota1, Double nota2) {

        Double media = (nota1 + nota2) / 2;

        return media >= 7.0;
    }
}