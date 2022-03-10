package java_Practices;


import java.util.Scanner;

public class C02_Bankamatik {
    /*
    Bakıye (basalngic: 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {

        System.out.println("   ****    ");
        System.out.println("   ATM'ye hos geldiniz :)    ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bakiye sorgulama: 1 \nPara Cekme : 2\nPara Yatirma : 3\nCikis : 4\nyapacaginiz islemi seciniz.");
        int islem = scan.nextInt();
        int bakiye = 1000;

        switch (islem) {
            case 1:
                System.out.println("Mevsut bakiyeniz : " + bakiye);
                break;
            case 2:
                System.out.println("Cekeceginiz miktari giriniz : ");
                int cekilenMiktar = scan.nextInt();
                if (cekilenMiktar > bakiye) {
                    System.out.println("Bakiye yetersiz");
                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println("Bakiyenizin guncel hali : " + bakiye);
                }
                break;
            case 3:
                System.out.println("Yatiracaginiz miktari giriniz : ");
                int yatirilanMiktar = scan.nextInt();
                bakiye += yatirilanMiktar;
                System.out.println("Bakiyenizin guncel hali : " + bakiye);
                break;
            case 4:
                System.out.println("Cikis yapilmistir. Yine bekleriz");
                break;
        }
    }
}
