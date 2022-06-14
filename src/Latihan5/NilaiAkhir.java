/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class NilaiAkhir {
    public static void main(String[] args) {
       //Soal Latihan 5
       Scanner input = new Scanner(System.in);
       int Nilai;
        System.out.print("Masukkan Nilai Akhir PBO : ");
        Nilai=input.nextInt();
        if (Nilai < 70 )
        System.out.println("Siswa TIDAK LULUS");
         
        if (Nilai > 70 ) 
        System.out.println("Siswa LULUS");
}
}
