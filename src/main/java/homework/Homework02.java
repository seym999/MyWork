package homework;

public class Homework02 {
    public static void main(String[] args) {

        /*
        1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
        2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
         */
        int alanSonucu=alanHesapla(5,10);
        System.out.println(alanSonucu);
        int cevreSonucu=cevreHesapla(5,10);
        System.out.println(cevreSonucu);

    }

    public static int  alanHesapla(int kenar1,int kenar2){
        return kenar1*kenar2;
    }
    public static int cevreHesapla(int kenar1,int kenar2){
        return 2*(kenar1+kenar2);
    }

}
