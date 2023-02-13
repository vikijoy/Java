package lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание множества
        ArrayList <Laptop> laptop = new ArrayList<>();
        laptop.add(new Laptop("hp_pailion_g6", 16, "4k",true, 500, "16", "Windows", "black"));
        laptop.add(new Laptop("hp_galaxy_x64", 14, "FullHD",true, 500, "8", "Windows", "white"));
        laptop.add(new Laptop("samsung_a52", 18, "FullHD",true, 300, "8", "Windows", "black"));
        laptop.add(new Laptop("samsung_m31s", 16, "4k",false, 1000, "16", "Linux", "black"));
        laptop.add(new Laptop("lenovo_gtx76", 16, "FullHD",true, 700, "8", "Windows", "white"));
        laptop.add(new Laptop("macbook_14pro", 17, "4k",false, 1000, "8", "ios", "white"));
        laptop.add(new Laptop("asus_x515", 17, "FullHD",true, 300, "4", "Windows", "black"));
        laptop.add(new Laptop("acer_air5", 19, "FullHD",true, 600, "8", "Windows", "black"));
        laptop.add(new Laptop("acer_air6" ,18, "4k",false, 500, "16", "Windows", "black"));
        laptop.add(new Laptop("acer_a313", 16, "FullHD",true, 500, "8", "Windows", "black"));
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}