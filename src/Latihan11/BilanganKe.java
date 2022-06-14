/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan11;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class BilanganKe {
    public static void main(String[] args) {
      //soal nomor 11 
        Scanner masukan = new Scanner(System.in);
        int a=0,total=0,bil=7;
        while (bil!=0){
        a++;
            System.out.print("Masukan bilangan ke-" +a+" :");
            bil = masukan.nextInt();
            total += bil;
    }
        System.out.print("Total jumlah "+(a-1)+" bilangan : ");
        System.out.println(total);
}
}
