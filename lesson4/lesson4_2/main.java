package lesson4_2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Изначальный список: " + list);

        int len = list.size();
        int avar = 0;
        for (int i = 0; i <= len/2; i++) {
            avar = list.get(i);
            list.set(i, list.get(len - i-1));
            list.set((len - i-1), avar);
        }

        System.out.println("Перевернутый список: " + list);
    }
}
