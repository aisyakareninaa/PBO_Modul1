/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan8;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class NilaiTPA {
    public static void main(String[] args) {
      //soal nomor 8 
      Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nilai TPA ");
        int TPA = masukan.nextInt();
        System.out.print("Masukannilai Bahasa Inggris ");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa ");
        else 
            System.out.println("Siswa tidak dapat Beasiswa");
}
}

