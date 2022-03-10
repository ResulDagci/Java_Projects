package java_Practices;

import java.util.Scanner;

public class C01_KokBulma {
    public static void main(String[] args) {
        // katsayıları alinan 2.dereceden 1 bilinmeyenli denklemin kökleriniz bulma

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen x^2 nin katsayisini giriniz");
            double a = scan.nextDouble();
            System.out.println("Lütfen x^1 in katsayisini giriniz");
            double b = scan.nextDouble();
            System.out.println("Lütfen x^0 in katsayisini giriniz");
            double c = scan.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                System.out.println("Iki kök vardir ve " +
                        "x1: " + ((-b + Math.sqrt(delta)) / 2 * a) +
                        " x2: " + ((-b + Math.sqrt(delta)) / 2 * a));
            } else if (delta == 0) {
                System.out.println("Bir kök vardir ve " + "x1,x2: " + (-b / 2 * a));
            } else {
                System.out.println("Denklemin kökü yoktur");
            }
        }
    }
