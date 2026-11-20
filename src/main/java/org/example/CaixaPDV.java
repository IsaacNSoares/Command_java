package org.example;

public class CaixaPDV {

    private int numeroTerminal;
    private int turno;
    private String situacao;

    public CaixaPDV(int numeroTerminal, int turno) {
        this.numeroTerminal = numeroTerminal;
        this.turno = turno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirCaixa() {
        this.situacao = "Caixa aberto";
    }

    public void fecharCaixa() {
        this.situacao = "Caixa fechado";
    }
}