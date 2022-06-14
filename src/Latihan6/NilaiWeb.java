/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class NilaiWeb {
     public static void main(String[] args) {
      //Soal Latian 6
     Scanner input = new Scanner(System.in);
       int Nilai;
        System.out.print("Masukkan Nilai WEB : ");
        Nilai=input.nextInt();
        if (Nilai >= 90 )
            System.out.println("NIlai A");
        else if (Nilai >= 75 ) 
            System.out.println("NIlai B");
        else if (Nilai >= 50)
            System.out.println("Nilai C");
        else if (Nilai >= 35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai E");
}
}

