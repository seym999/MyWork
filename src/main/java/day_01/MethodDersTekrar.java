package day_01;

public class MethodDersTekrar {

    public static void main(String[] args) {

        //verilen bir ondalık sayının küpünü hesaplayan method
double sonuc=kupBul(2);
        System.out.println("kup bul sonuc = " + sonuc);
        yazdır();
        String str ="java dersindeyiz";
        yazdır1(str);

        int a=5;
        int b=4;
        carp(a,b);
         int x=4;
         int sonuc2 = karesi(x);
        System.out.println(sonuc2);
    }

    public static int karesi(int x) {
        return x*x;
    }

    public static void carp(int a, int b) {
        System.out.println("carpma = " + a*b);
    }

    public static void yazdır1(String str) {
        System.out.println("kısayol method= " + str);
    }


    public static double kupBul(double a){
        return a*a*a;
    }
public static void yazdır(){
    System.out.println("hello");
}



}
