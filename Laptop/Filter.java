package Laptop;

import java.util.*;

public class Filter {
    HashMap<Integer, Object> valueFilter = new HashMap<>();

    public void printmenu() {
        System.out.println("Введите число\n1.Фильтр по бренду\n2.Фильтр по цене\n3.Фильтр по количеству ядер\n0 - выход из меню, все фильтры введены");
    }


    public void scan() {


        boolean ok = true;
        Scanner iScanner = new Scanner(System.in);


        while (ok) {

            printmenu();
            String num = iScanner.nextLine();

            switch (num) {

                case "1":
                    System.out.println("Введите какой фильтр для бренда");
                    valueFilter.put(1, iScanner.nextLine());


                    break;
                case "2":
                    System.out.println("Введите какой фильтр для цены");
                    valueFilter.put(2, iScanner.nextLine());

                    break;
                case "3":
                    System.out.println("Введите какой фильтр для количества ядер");
                    valueFilter.put(3, iScanner.nextLine());
                    printmenu();
                    break;
                case "0":
                    System.out.println("Вы вышли из меню фильтров");
                    ok = false;
                    break;
                default:
                    System.out.println("Вы ввели неверную цифру");
                    break;

            }

        }
    }

    public Set<Laptop> filterLap(Set<Laptop> allLaptop) {
        Set<Laptop> filtLap = new HashSet<>();


        if (valueFilter.isEmpty()) {
            System.out.println("Вы не ввели фильтры");
        } else {
            for (Laptop lap : allLaptop) {


                if (valueFilter.containsKey(1)) {
                    if (valueFilter.get(1).equals(lap.getBrand())) {

                        if (valueFilter.containsKey(2) || valueFilter.containsKey(3)) {
                            if (valueFilter.containsKey(2) && valueFilter.containsKey(3)) {
                                if (lap.getPrice() >= Double.parseDouble((String) valueFilter.get(2)) && lap.getNumberCores() >= Integer.parseInt((String) valueFilter.get(3))) {
                                    filtLap.add(lap);
                                }
                            } else {
                                if (valueFilter.containsKey(2)) {
                                    if (lap.getPrice() >= Double.parseDouble((String) valueFilter.get(2))) {
                                        filtLap.add(lap);
                                    }
                                } else {
                                    if (lap.getNumberCores() >= Integer.parseInt((String) valueFilter.get(3))) {
                                        filtLap.add(lap);
                                    }

                                }
                            }
                        } else filtLap.add(lap);


                    }
                } else if (valueFilter.containsKey(2)) {
                    if (lap.getPrice() >= Double.parseDouble((String) valueFilter.get(2))) {

                        if (valueFilter.containsKey(3)) {

                            if (lap.getNumberCores() >= Integer.parseInt((String) valueFilter.get(3))) {
                                filtLap.add(lap);
                            }
                        } else filtLap.add(lap);


                    }
                } else if (valueFilter.containsKey(3)) {
                    if (lap.getNumberCores() >= Integer.parseInt((String) valueFilter.get(3))) {
                        filtLap.add(lap);
                    }
                }


            }

        }
        return filtLap;
    }


}

