package homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz

        Scanner input =  new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi giriniz ");
        double sayi1=input.nextDouble();
        System.out.println("Lütfen 2.sayiyi giriniz");
        double sayi2=input.nextDouble();
        System.out.println("Lütfen 3.sayiyi giriniz");
        double sayi3=input.nextDouble();

        double ortalama=(sayi1+sayi2+sayi3)/3;
        System.out.println("Girmiş oldugunuz 3 sayinin ortalamasi = " +ortalama + " dir..");





    }
}
