package week01;

import java.util.Scanner;

public class StringPractice01 {
    /**
     * 1.
     * Ask for a String input from user
     * Create a method that will return
     *  a string made of its first two chars in uppercase
     * so the String "Hello" yields “HE".
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(firstTwoChars(str));

        firstTwoChars2(str);
    }

    /*
    difference between void and String
     */

    public static String firstTwoChars(String str) {
//        str = str.toUpperCase();
//        str = str.substring(0,2);

 //       str= str.toUpperCase().substring(0,2); // you can chain your string methods

        return str.toUpperCase().substring(0,2);
    }

    public static void firstTwoChars2(String str){
        System.out.println(str.toUpperCase().substring(0,2));
    }
}
