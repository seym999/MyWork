package day_01;

public class Tekrar01 {
    public static void main(String[] args) {
        ilkMethodum();
        ikinciMethodum();
        ucuncuMethodum();
        ikiSayiToplami(10, 20);
       // ikiSayiToplayipDondur(3, 7);
        int top=ikiSayiToplayipDondur(3, 7);
        System.out.println(top);
        int alanSonuc=kareninAlani(5);//alan
        System.out.println("Karenin alanı = " + alanSonuc);
        int cevreSonuc=kareninCevresi(5);//çevre
        System.out.println("Karenin çevresi = " + cevreSonuc);
    }

    public static void ilkMethodum() {
        String yaz = "java ogreniyorum";//1.yol
        System.out.println(yaz);
        // System.out.println("java ogreniyorum111");//2.yol

    }

    //isim tanımlayalım. benm ismin..... tanımladgmzi yazdırack sekilde olusturalım
    public static void ikinciMethodum() {
        String isim = "Seyma";
        System.out.println(" benim ismim = " + isim);
    }

    //harf tanımlayalım. benm ismin ilk harfi..... tanımladgmzi yazdırack sekilde olusturalım
    public static void ucuncuMethodum() {
        char ilkHarf = 'S';
        System.out.println(" ismimim ilk harfi = " + ilkHarf);
    }

    //iki sayının toplamını bulan ve yazdıran bır method olusturunuz
    public static void ikiSayiToplami(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }
    //2...iki sayının toplamını bulan ve döndüren bır method olusturunuz
/*
    public static int ikiSayiToplayipDondur(int sayi3, int sayi4) {
        int toplam2 = sayi3 + sayi4;
        System.out.println(toplam2);
        return toplam2;

    }

*/
    public static int ikiSayiToplayipDondur(int sayi3, int sayi4){
        return sayi3+sayi4;
    }


//karenin alanı
    public  static  int kareninAlani(int kenar){
        return kenar*kenar;
    }
//karenin cevresi

    public static int kareninCevresi(int kenar1){
        return 4*kenar1;
    }


}
