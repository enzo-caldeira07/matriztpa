/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamatriz4;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class Javamatriz4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][5];
        int pares = 0, impares = 0;
        boolean repetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }

        // Verificar repetidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int x = i; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (!(x == i && y <= j) && m[i][j] == m[x][y]) {
                            repetido = true;
                        }
                    }
                }

                if (m[i][j] % 2 == 0) pares++;
                else impares++;
            }
        }

        System.out.println("Possui repetidos? " + repetido);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
    
