/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamatriz3;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class Javamatriz3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        int somaImpares = 0;

        int[] somaColuna = new int[5];
        int[] somaLinha = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();

                if (m[i][j] % 2 != 0) somaImpares++;

                somaLinha[i] += m[i][j];
                somaColuna[j] += m[i][j];
            }
        }

        System.out.println("Soma dos ímpares: " + somaImpares);

        System.out.println("\nSoma de cada coluna:");
        for (int i = 0; i < 5; i++) System.out.println("Coluna " + i + ": " + somaColuna[i]);

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) System.out.println("Linha " + i + ": " + somaLinha[i]);
    }
}
    

