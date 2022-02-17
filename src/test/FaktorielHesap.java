package test;

import java.util.Scanner;

class FaktorielHesap {

    public static int FirstFactorial(int num) {
        int faktor=1, i;
        for (i=num; i>0; i--){
            faktor*=i;
        }
        return faktor;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        System.out.print(FirstFactorial(s.nextInt()));
    }

}