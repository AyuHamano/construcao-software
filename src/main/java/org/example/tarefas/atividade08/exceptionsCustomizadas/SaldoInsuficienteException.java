package org.example.tarefas.atividade08.exceptionsCustomizadas;

public class SaldoInsuficienteException extends Exception{
    @Override
    public String toString() {
        return "Não foi possível realizar o saque pois o saldo é insuficiente";
    }

}
