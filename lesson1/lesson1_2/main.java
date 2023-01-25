package lesson1_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int g = in.nextInt();
        System.out.println(((g % 4 == 0 && g % 100 > 0) || (g % 100 == 0 && g % 400 == 0)));
    }
}