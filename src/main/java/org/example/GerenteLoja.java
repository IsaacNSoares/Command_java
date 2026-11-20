package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenteLoja {

    private List<OperacaoCaixa> operacoes = new ArrayList<OperacaoCaixa>();

    public void executarOperacao(OperacaoCaixa operacao) {
        this.operacoes.add(operacao);
        operacao.executar();
    }

    public void cancelarUltimaOperacao() {
        if (operacoes.size() != 0) {
            OperacaoCaixa operacao = this.operacoes.get(this.operacoes.size() - 1);
            operacao.cancelar();
            this.operacoes.remove(this.operacoes.size() - 1);
        }
    }

}