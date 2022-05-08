package java_Practices;

import java.util.*;

public class C15_kelimeSay {

    /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz  : ");
        kacKelime();
        String metin = scan.nextLine();
        System.out.println(kelimeSay(metin));
    }

    public static TreeMap<String, Integer> kelimeSay(String metin) {

        TreeMap<String, Integer> kelimeSayısı = new TreeMap<String, Integer>();
        String[] arrMetin = metin.split(" ");
        for (int i = 0; i < arrMetin.length; i++) {
            if (kelimeSayısı.containsKey(arrMetin[i])) {
                kelimeSayısı.put(arrMetin[i], kelimeSayısı.get(arrMetin[i]) + 1);
            } else kelimeSayısı.put(arrMetin[i], 1);
        }
        return kelimeSayısı;
    }

    public static void kacKelime() {
        String Str = "Ali came to school and and came Ayse came to school";
        String arr[] = Str.split(" ");

        System.out.println(Arrays.toString(arr));
        Map<String, Integer> map = new HashMap<>();

        int sayac = 1;
        for (String w : arr) {
            if (map.putIfAbsent(w, sayac) != null) {
                map.put(w, (map.putIfAbsent(w, sayac) + 1));
            } else {
                map.put(w, sayac);
            }
        }
    }
}