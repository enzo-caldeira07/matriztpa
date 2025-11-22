/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamatriz5;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class Javamatriz5 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        double[][] m = new double[4][4];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextDouble();
            }

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++)
            System.out.print(m[i][i] + " ");

        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++)
            System.out.print(m[i][3 - i] + " ");
    }
}
    
