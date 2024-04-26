package org.example.tarefas.tarefa08.numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorDeVetor {

    public static void lerVetorNumerico(){
        try{
            System.out.println("Digite 10 números inteiros:");
            Scanner scanner = new Scanner(System.in);
            int vetorNumerico[] = new int[10];
            int i = 0;

            int numero;
            do {
                 numero = scanner.nextInt();
                 vetorNumerico[i] = numero;
                 i++;
            } while(numero != 0);

            System.out.println("Vetor lido com sucesso!");

        } catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("O limite de 10 números foi atingido!");
        }
        catch (InputMismatchException erro){
            System.out.println("Digite um número!");
        }
    }
}
