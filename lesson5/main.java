package lesson5;

import java.util.*;

public class main {

    static int[][] getMap() {
        return new int[][] {
                { 00, 00, 00, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, -1, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, -1, -1, -1, -1, -1, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, 00, 00 }
        };
    }

    static PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
    static int ex = 0;
    static int max = 0;

    static void pprint(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] == -1)
                    System.out.printf("%s", " @ ");
                else if (m[i][j] == 1)
                    System.out.printf("%s", " $ ");
                else if (m[i][j] == -3)
                    System.out.printf("%s", " # ");
                else if (m[i][j] == -4)
                    System.out.printf("%s", " 1 ");
                else if (m[i][j] == 0)
                    System.out.printf("%s", " - ");
                else
                    System.out.printf("%s", " "+ m[i][j] +" ");

                // System.out.printf("%4d", m[i][j]);в–€
            }
            System.out.println();
        }
    }

    static void pclear(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] > 1)
                    m[i][j] = 0;
            }
        }
    }

    static void pfind(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;
        while (!myPriorityQueue.isEmpty()){

            int number = myPriorityQueue.remove();
            //System.out.println(myPriorityQueue.peek());
            //int number = Integer.parseInt(sfg);
            int x = number / 10;
            int y = number % 10;

            if (x-1 >= 0)
                if (m[x-1][y] == -3)
                {
                    ex = (x-1)*10+y;
                    max = m[x][y];
                    myPriorityQueue.clear();;
                }
                else if (m[x-1][y] == 0)
                {
                    m[x-1][y] = m[x][y]+1;
                    myPriorityQueue.add((x-1)*10+y);
                }
            if (y+1 <= colums)
                if (m[x][y+1] == -3)
                {
                    ex = x*10+(y+1);
                    max = m[x][y];
                    myPriorityQueue.clear();;
                }
                else if (m[x][y+1] == 0)
                {
                    m[x][y+1] = m[x][y]+1;
                    myPriorityQueue.add(x*10+(y+1));
                }
            if (x+1 <= rows)
                if (m[x+1][y] == -3)
                {
                    ex = (x+1)*10+y;
                    max = m[x][y];
                    myPriorityQueue.clear();;
                }
                else if (m[x+1][y] == 0)
                {
                    m[x+1][y] = m[x][y]+1;
                    myPriorityQueue.add((x+1)*10+y);
                }
            if (y-1 >= 0)
                if (m[x][y-1] == -3)
                {
                    ex = x*10+(y-1);
                    max = m[x][y];
                    myPriorityQueue.clear();;
                }
                else if (m[x][y-1] == 0)
                {
                    m[x][y-1] = m[x][y]+1;
                    myPriorityQueue.add(x*10+(y-1));
                }

            //System.out.println(myPriorityQueue);
            //myPriorityQueue.remove();
        }
    }
    static void proad(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;
        int step = max;

        for (int i = 1; i < max; i++) {
            int x = ex / 10;
            int y = ex % 10;

            if (x-1 >= 0 & m[x-1][y] == step)
                {
                    m[x-1][y] = -4;
                    ex = (x-1)*10+y;
                }
            else if (y+1 <= colums & m[x][y+1] == step)
                {
                    m[x][y+1] = -4;
                    ex = x*10+(y+1);
                }
            else if (x+1 <= rows & m[x+1][y] == step)
                {
                    m[x+1][y] = -4;
                    ex = (x+1)*10+y;
                }
            else if (y-1 >= 0 & m[x][y-1] == step)
                {
                    m[x][y-1] = -4;
                    ex = x*10+(y-1);
                }

            step = step-1;
        }
    }

    static void start(int[][] map, int x, int y) {
        map[x][y] = 1;
        myPriorityQueue.add(x*10+y);
    }
    static void end(int[][] map, int x, int y) {
        map[x][y] = -3;
    }

    public static void main(String[] args) {
        int[][] map = getMap();
        start(map, 7, 4); // Задаём стартовую точку
        end(map, 5, 0); // Задаём первый выход
        end(map, 0, 6); // Задаём второй выход

        System.out.println("- проход");
        System.out.println("@ стена");
        System.out.println("$ начальная позиция");
        System.out.println("1 кратчайшая дорога");
        System.out.println();

        System.out.println("Исходный лабиринт");
        pprint(map); // Отрировываем исходную карту
        System.out.println();
        pfind(map); // ищем дорогу
        proad(map); // строим дорогу
        pclear(map); // чистим лишее (не обязательный шаг. можно было ограничиться условиями отрисовки)
        System.out.println("Лабиринт с кротчайшим выходом");
        pprint(map); // Отрисовываем конечную карту
    }
}