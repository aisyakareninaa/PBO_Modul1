/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan7;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class PilihAngka {
    public static void main(String[] args) {
      //soal nomor 7
      Scanner masukan = new Scanner(System.in);
        System.out.println("Silahkan pilih angka 1-3 :");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1 : System.out.println("Satu");
                break;
            case 2 : System.out.println("Dua");
                break;
            case 3 : System.out.println("Tiga");
}
    }
}
