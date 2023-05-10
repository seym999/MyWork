package homework;



import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz...");
        int sayi = input.nextInt();

        int birlerBasamagi = sayi % 10;
        sayi = sayi / 10;
        int onlarBasamagi = sayi % 10;
        sayi = sayi / 10;
        int yuzlerBasamagi = sayi % 10;

        sayi = input.nextInt();

        int basamakToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;

        System.out.println("Girmiş oldugunuz " + sayi + " sayisinin rakamlari tolami = " + basamakToplami + " dir...");
    }
}
