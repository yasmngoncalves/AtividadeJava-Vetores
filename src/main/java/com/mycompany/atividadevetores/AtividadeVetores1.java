/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadevetores;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeVetores1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Acumulando a soma dos números
        }

        double media = (double) soma / numeros.length;

        System.out.println("\nA soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
