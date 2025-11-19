/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizjava;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Matrizjava {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [][] m = new int [4][4];
      int somapares = 0, qtdpares = 0;
      
      for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
         System.out.print("Digite m[" + i + "][" + j + "]: ");
         m[i][j] = sc.nextInt();
         
         if (m[i][j] % 2 == 0) {
         somapares += m[i][j];
         qtdpares++;
          
      }
      }   
      }
      
      double media = (qtdpares > 0) ? (double)somapares / qtdpares: 0;
      
      System.out.println("soma dos pares =" + somapares);
      System.out.println("media dos pares =" + media);
     
    }
}
