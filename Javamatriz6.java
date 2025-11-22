/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamatriz6;

/**
 *
 * @author Vitor
 */
public class Javamatriz6 {

    public static void main(String[] args) {
    
        System.out.println("Figura A:");
        char[][] A = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = '*';
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------\n");


        System.out.println("Figura B:");
        char[][] B = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    B[i][j] = '*';
                } else {
                    B[i][j] = ' ';
                }

                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------\n");


       
        System.out.println("Figura C:");
        char[][] C = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                C[i][j] = '*';
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
    
