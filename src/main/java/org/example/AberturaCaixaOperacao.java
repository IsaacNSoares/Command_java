package org.example;

public class AberturaCaixaOperacao implements OperacaoCaixa {

    private CaixaPDV caixa;

    public AberturaCaixaOperacao(CaixaPDV caixa) {
        this.caixa = caixa;
    }

    @Override
    public void executar() {
        this.caixa.abrirCaixa();
    }

    @Override
    public void cancelar() {
        this.caixa.fecharCaixa();
    }
}