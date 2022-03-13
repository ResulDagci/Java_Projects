package java_Practices;

import java.util.Random;
import java.util.Scanner;

public class C04_SayiBulma {
    public static void main(String[] args) {
        //Bilgisayara 1-100 arasi rastgele bir sayi belirletin,
        //Kullanicidan sayiyi tahmin etmesini isteyin,
        //Yapilan tahmine gore kullanicidan daha kucuk/buyuk tahminde bulunmasini isteyin,
        //Sayiyi buldugunda kac tahminde buldugunu yazdirin.

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin) {
            System.out.print("Lutfen bir tahmininde bulunun : ");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("Daha kucuk bir sayi girin");
            } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi girin");
            }
            sayac++;
        }
        System.out.println("Tebrikler, dogru tahmin. "+ (sayac-1) + " giriste sayiyi buldunuz");
    }
}
