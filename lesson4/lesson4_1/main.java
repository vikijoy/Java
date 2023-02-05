package lesson4_1;

import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;

public class main {
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Введите новую строку и нажмите Enter для добавления");
        System.out.println("Введите print и нажмите Enter для вывода");
        System.out.println("Введите revert и нажмите Enter для удаления последней строки");
        System.out.println("Введите exit и нажмите Enter для выхода");
        System.out.println("");

        while (true)
        {
            String s = console.nextLine();
            if (s.equals("exit"))
                break;
            else if (s.equals("print"))
                System.out.println(list);
            else if (s.equals("revert"))
                list.removeFirst();
            else
                list.addFirst(s);
        }
    }
}
