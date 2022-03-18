package java_Practices;

import java.util.Scanner;

public class C07_TersPiramit {
    /*
     Kullaniciden yuksekligini alarak ters piramit oluşturabileceğiniz bir kod yazınız.
     Ornek: yukseklik=5 icin sonuc asagidaki gibi olmalidir;

      * * * * *
       * * * *
        * * *
         * *
          *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("olusturulacak ters piramidin yuksekligini girin : ");
        int yukseklik = scan.nextInt();

        for (int i = yukseklik; i >= 1; i--) {

            for (int j = i; j <= yukseklik; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}
