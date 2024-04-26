package org.example.tarefas.tarefa08.contaBancaria;

import org.example.tarefas.tarefa08.exceptionsCustomizadas.SaldoInsuficienteException;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        try {
            setSaldo(valor + getSaldo());
        } catch (Exception erro) {
            System.out.println(erro.toString());
        }
    }

    public void sacar(double valor) {
        try {
            if (valor > getSaldo()) {
                throw new SaldoInsuficienteException();

            }
            else setSaldo(getSaldo() - valor );
            System.out.println("Saque realizado com sucesso!\n");
        }catch (SaldoInsuficienteException erro) {
            System.out.println(erro.toString() + "\n");
        }

    }
}
