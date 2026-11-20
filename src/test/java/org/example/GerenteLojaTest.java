package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GerenteLojaTest {

    GerenteLoja gerente;
    CaixaPDV caixa;

    @BeforeEach
    void setUp() {
        gerente = new GerenteLoja();
        caixa = new CaixaPDV(1, 1);
    }

    @Test
    void deveAbrirCaixa() {
        OperacaoCaixa aberturaCaixa = new AberturaCaixaOperacao(caixa);
        gerente.executarOperacao(aberturaCaixa);

        assertEquals("Caixa aberto", caixa.getSituacao());
    }

    @Test
    void deveFecharCaixa() {
        OperacaoCaixa fechamentoCaixa = new FechamentoCaixaOperacao(caixa);
        gerente.executarOperacao(fechamentoCaixa);

        assertEquals("Caixa fechado", caixa.getSituacao());
    }

    @Test
    void deveCancelarFechamentoCaixa() {
        OperacaoCaixa aberturaCaixa = new AberturaCaixaOperacao(caixa);
        OperacaoCaixa fechamentoCaixa = new FechamentoCaixaOperacao(caixa);

        gerente.executarOperacao(aberturaCaixa);
        gerente.executarOperacao(fechamentoCaixa);

        gerente.cancelarUltimaOperacao();

        assertEquals("Caixa aberto", caixa.getSituacao());
    }

}