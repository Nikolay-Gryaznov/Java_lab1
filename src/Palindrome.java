//Проверка на палиндром

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

    //Метод переворачивающий строку
    public static String reverseString(String firstString){
        String secondString ="";
        for (int i = firstString.length()-1; i >=0; i--) {
            secondString+=firstString.charAt(i);
        }
        return secondString;
    }
    //Метод осуществляющий проверку на палиндром
    public static boolean isPolindrome (String string){
        String checkString = reverseString(string);
        if (string.equals(checkString)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (isPolindrome(strings[i])) System.out.println(strings[i]+" - палиндром");
            else System.out.println(strings[i]+" - не палиндром");
        }
    }
}
