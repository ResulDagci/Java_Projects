package java_Practices;

import java.util.Scanner;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        /*
     Kullanicidan alinan sifre asagidaki sartlari sagliyorsa; “Sifreniz basariliyla kaydedilmistir.”,
     sartlari saglamiyorsa; “Islem basarisiz. Lutfen gecerli bir sifre giriniz.” yazdirin.
    - Ilk harf buyuk harf olmali,
    - Son harf kucuk harf olmali,
    - Sifre bosluk icermemeli,
    - Sifre uzunlugu en az 8 karakter olmalidir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String sifre = scan.next();
        boolean ilkHarf = false;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmalidir.");
        }

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarf = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmalidir.");
        }

        boolean bosluk = false;
        if (!sifre.contains(" ")) {
            bosluk = true;
        } else {
            System.out.println("Sifre bosluk icermemelidir.");
        }

        boolean uzunluk = false;
        if (sifre.length() >= 8) {
            uzunluk = true;
        } else {
            System.out.println("Sifrenizin en az 8 karekter olmalidir");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("Sifreniz basariliyla kaydedilmistir.");
        } else {
            System.out.println("Islem basarisiz. Lutfen gecerli bir sifre giriniz.");
        }
    }
}
