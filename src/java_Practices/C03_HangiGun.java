package java_Practices;

import java.util.Scanner;

public class C03_HangiGun {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı gün ve istenilen gun sonrasina gore hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSali : 2\nCarsamba : 3\nPersembe : 4" +
                "\nCuma : 5\nCumartesi : 6\nPazar : 7\n" +
                "Haftanin kacinci gununde oldugunuzu giriniz");

        int kacinciGun = scan.nextInt();

        if (kacinciGun <= 0 || kacinciGun > 7) {
            System.out.println("Lütfen gecerli bir giris yapiniz");
        } else {
            System.out.println("Kac gun sonrasini merak ediyorsunuz");
            int kacGunSonrasi = scan.nextInt();
            int bulunanGun = (kacGunSonrasi + kacinciGun) % 7;
            switch (bulunanGun) {
                case 1:
                    System.out.print(kacGunSonrasi + " gun sonra pazartesi gunu olacaktir");
                    break;
                case 2:
                    System.out.print(kacGunSonrasi + " gun sonra sali gunu olacaktir");
                    break;
                case 3:
                    System.out.print(kacGunSonrasi + " gun sonra carsamba gunu olacaktir");
                    break;
                case 4:
                    System.out.print(kacGunSonrasi + " gun sonra persembe gunu olacaktir");
                    break;
                case 5:
                    System.out.print(kacGunSonrasi + " gun sonra cuma gunu olacaktir");
                    break;
                case 6:
                    System.out.print(kacGunSonrasi + " gun sonra cumartesi gunu olacaktir");
                    break;
                case 0:
                    System.out.print(kacGunSonrasi + " gun sonra pazar gunu olacaktir");
                    break;
                default:
                    System.out.println("Lütfen gecerli bir giris yapiniz");
            }
        }
    }
}
