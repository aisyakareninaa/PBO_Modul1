/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan10;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class BatasBilangan {
      public static void main(String[] args) {
      //soal nomor 10
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan batas bilangan ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i=1; i<=batas; i++)
        hasil += 2; 
        System.out.println("Total jumlahnya adalah : " + hasil);
      }
}
