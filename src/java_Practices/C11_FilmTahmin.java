package java_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C11_FilmTahmin {

    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
        System.out.print("Film secmek icin 1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(filmler, secilenFilmIndex - 1);
    }

    private static void filmGetir(List<String> film, int index) {
        StringBuilder tahminEdilecekFilm = new StringBuilder(C11_FilmTahmin.filmler.get(index).replaceAll("\\w", "-"));
        System.out.println(tahminEdilecekFilm);
        System.out.println(film.get(index).length() + " harfli yabanci film sectiniz. Filmi tahmin etmek için " + 2 * film.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {
            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * film.get(index).length() + "\ntahmin ettiginiz harfi giriniz : ");
            harf = scan.next().toUpperCase().charAt(0);
            str += harf;

            if (!tahminEdilecekFilm.toString().contains(str)) {
                tahminSayısı++;
            }

            for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                if (film.get(index).charAt(i) == harf) {
                    if (!tahminEdilecekFilm.toString().contains(film.get(index).substring(i, i + 1))) {
                        dogruTahminSayısı++;
                    }
                    tahminEdilecekFilm.setCharAt(i, harf);
                }
            }
            if (tahminEdilecekFilm.toString().equalsIgnoreCase(film.get(index))) {
                System.out.println("tebrikler kazndınız");
                System.out.println("tahmin ettiğiniz film : " + tahminEdilecekFilm);
                break;
            }
            System.out.println(tahminEdilecekFilm);
        } while ((tahminSayısı - dogruTahminSayısı) != 2 * film.get(index).length());

        if ((tahminSayısı - dogruTahminSayısı) == 2 * film.get(index).length()) {
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println("oyunu kaybettiniz, yine bekleriz.... tahmin edemediginiz film : " + film.get(index));
        }
    }
}