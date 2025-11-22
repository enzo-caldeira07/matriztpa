/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamatriz2;

        
/**
 *
 * @author Vitor
 */
public class Javamatriz2 {

    public static void main(String[] args) {
 

    

        // -------- A) MATRIZ DE LETRAS --------
        System.out.println("Matriz A (letras):");
        char letra = 'a';
        char[][] ma = new char[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                ma[i][j] = letra++;
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // -------- B) MATRIZ DE INTEIROS --------
        System.out.println("Matriz B (inteiros):");
        int[][] mb = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };

        for (int i = 0; i < mb.length; i++) {
            for (int j = 0; j < mb[0].length; j++) {
                System.out.print(mb[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------\n");

        // -------- C) MATRIZ DE DECIMAIS --------
        System.out.println("Matriz C (decimais):");
        double[][] mc = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };

        for (int i = 0; i < mc.length; i++) {
            for (int j = 0; j < mc[0].length; j++) {
                System.out.print(mc[i][j] + " ");
            }
            System.out.println();
        }

    }
}

    

