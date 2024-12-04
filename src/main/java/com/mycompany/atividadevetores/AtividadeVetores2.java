/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadevetores;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeVetores2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("O nome \"" + nomeBusca + "\" foi encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome \"" + nomeBusca + "\" não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
