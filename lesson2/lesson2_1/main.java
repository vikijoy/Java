package lesson2_1;

import java.util.Scanner;

public class main {
    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String g = in.next();
        System.out.println(isPalindrome(g));
    }
}
