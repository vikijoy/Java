package lesson3_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class main {
    public static void main(String[] args) {
        // Создаём список
        List<Integer> arr  = Arrays.asList(3, 1, 6, 5, 2, 8, 4);
        // Показываем исходный список
        System.out.println(arr);
        // Показываем результаты
        System.out.println("Минимальный элемент: " + Collections.min(arr));
        System.out.println("Максимальный элемент: " + Collections.max(arr));
        System.out.println("Среднее арифметическое: " + arr.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}