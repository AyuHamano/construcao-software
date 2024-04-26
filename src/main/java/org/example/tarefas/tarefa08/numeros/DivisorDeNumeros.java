package org.example.tarefas.tarefa08.numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorDeNumeros {
    public static void divideDoisNumeros() {
        try {
            System.out.println("Digite um número e um denominador para dividir ele:");

            Scanner scanner = new Scanner(System.in);
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            int divisao =  numero1/numero2;

            System.out.println("A divisão entre o primeiro e o segundo número é: " + divisao);

        } catch (ArithmeticException erro) {
            System.out.println("Não é possível dividir um número por 0!");
        } catch (InputMismatchException erro){
            System.out.println("Digite um número!");
        }
    }
}
