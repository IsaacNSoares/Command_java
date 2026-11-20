package org.example;

public class FechamentoCaixaOperacao implements OperacaoCaixa {

    private CaixaPDV caixa;

    public FechamentoCaixaOperacao(CaixaPDV caixa) {
        this.caixa = caixa;
    }

    @Override
    public void executar() {
        this.caixa.fecharCaixa();
    }

    @Override
    public void cancelar() {
        this.caixa.abrirCaixa();
    }
}