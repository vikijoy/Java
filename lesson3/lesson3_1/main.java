package lesson3_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import static java.util.stream.Collectors.*;

public class main {
    public static void main(String[] args) {
        // Создаём список
        List<Integer> arr  = Arrays.asList(3, 1, 6, 5, 2, 8, 4);
        // Показываем исходный список
        System.out.println(arr);
        // Удаляем чётные
        arr = get(arr);
        // Показываем новый список
        System.out.println(arr);
    }

    public static List<Integer> get(List<Integer> integers){
        Map<Boolean, List<Integer>> map = integers.stream()
                .collect(partitioningBy(x -> x % 2 != 0, toList()));
        return map.get(true);
    }
}