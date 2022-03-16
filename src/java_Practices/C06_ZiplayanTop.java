package java_Practices;

import java.util.Scanner;

public class C06_ZiplayanTop {
    /*
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    -Bu ana kadar aldigi toplam yolu ve
    -yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi yuksekligi giriniz: ");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0;
        int ziplamaSayisi = 0;

        do {
            toplamYol += yukseklik;
            ziplamaSayisi++;
            yukseklik *= 0.75;
            toplamYol += yukseklik;

        } while (yukseklik >= 1);
        System.out.println("Toplam ziplama ayisi = " + ziplamaSayisi);
        System.out.println("Topun katettigi toplam yol = " + toplamYol);
    }
}
