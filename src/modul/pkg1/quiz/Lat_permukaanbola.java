/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.quiz;

import java.util.Scanner;

/**
 *
 * @author Panda PC
 */
public class Lat_permukaanbola {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola : ");
        int JariJari = masukan.nextInt();
        double phi = 3.14;
        double LuasPermukaan = 4*phi*JariJari*JariJari;
        System.out.println("Luas permukaan bola : "+LuasPermukaan);
    }
}

