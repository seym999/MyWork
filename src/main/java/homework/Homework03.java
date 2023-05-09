package homework;

public class Homework03 {
    public static void main(String[] args) {
         /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alinini hesaplayan methodu olusturunuz ve kullaniniz
     */

        int yariCap1 = 10;
        double sonuc1 = cevreHesapla(10);
        System.out.println("yaricapi 10 olan cemberin cevresi = " + sonuc1);
        int yariCap2 = 20;
        double sonuc2 = alanHesapla(20);
        System.out.println("yaricapi 20 olan dairenin alanı = " + sonuc2);

    }

    public static double cevreHesapla(int yariCap1) {
        return 2 * 3.14 * yariCap1;
    }

    public static double alanHesapla(int yariCap2) {
        return 3.14 * yariCap2 * yariCap2;
    }


}
