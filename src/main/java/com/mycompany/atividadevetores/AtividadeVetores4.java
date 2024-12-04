/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadevetores;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeVetores4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite as 5 notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }

        double media = soma / notas.length;

        int acimaMedia = 0;
        int abaixoMedia = 0;
        int naMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        System.out.println("\nMédia das notas: " + media);
        System.out.println("Quantidade de alunos acima da média: " + acimaMedia);
        System.out.println("Quantidade de alunos abaixo da média: " + abaixoMedia);
        System.out.println("Quantidade de alunos na média: " + naMedia);

        scanner.close();
    }
}
