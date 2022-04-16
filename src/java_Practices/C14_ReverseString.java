package java_Practices;

import java.util.Arrays;

public class C14_ReverseString {

        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak

        String input = "All is well";

        StringBuilder str = new StringBuilder();
        str.append(input);

        String reverseInput = str.reverse().toString();
        System.out.println("1.yol :" + reverseInput);

        System.out.println("---------------------------------------");
        //2.Yol: String Classini kullanarak
        System.out.print("2.yol :");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        System.out.println("---------------------------------------");
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        System.out.print("3.yol :");
        inputTersArray(input);
    }

    private static void inputTersArray(String input) {
        char[] arr = input.toCharArray();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
