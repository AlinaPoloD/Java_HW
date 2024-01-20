package Laptop;

//- Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
//хранить в Map. Например:…
//        - Далее нужно запросить минимальные значения для указанных критериев - сохранить
//параметры фильтрации можно также в Map.
//        - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
//условиям.


import java.util.*;

public class Laptop {

    String brand;
    String model;
    double price;
    String color;
    int numberCores;


    public Laptop(String brand, String model, double price, String color, int numberCores) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.numberCores = numberCores;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(price, laptop.price) == 0 && numberCores == laptop.numberCores && Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, color, numberCores);
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Model - %s,Цена - %.2f.,Цвет - %s,Количество ядер - %d\n", brand, model, price, color, numberCores);
    }
}


