package Laptop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Asus", "A571", 150000, "black", 8);
        Laptop lap2 = new Laptop("Apple", "F514", 200000, "black", 16);
        Laptop lap3 = new Laptop("MI", "G465", 78999.99, "white", 4);
        Laptop lap4 = new Laptop("Apple", "F45", 180000, "black", 18);
        Laptop lap5 = new Laptop("Asus", "E44", 130000, "white", 4);
        Laptop lap6 = new Laptop("Samsung", "F445", 210000, "red", 8);
        Set<Laptop> allLaptop = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5, lap6));
        Filter filter = new Filter();
        filter.scan();
        Set<Laptop> filtrLap = filter.filterLap(allLaptop);
        System.out.println(filtrLap.toString());


    }
}
