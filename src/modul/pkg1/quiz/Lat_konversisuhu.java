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
public class Lat_konversisuhu {
    public static void main (String[] args){
       double c,f,r,k;
       Scanner masukan = new Scanner (System.in);
       System.out.print("Masukkan suhu celcius: ");
       c = masukan.nextInt();
       f = (c*9/5)+32;
       r = c*4/5;
       k = c+273.15;
       System.out.println("");
       System.out.println("Celcius: "+c);
       System.out.println("Reamur: "+r);
       System.out.println("Fahrenheit: "+f);
       System.out.println("Kelvin: "+k);
   } 
}

