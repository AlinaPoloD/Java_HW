package Sem1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
//    Реализуйте метод checkArray(Integer[] arr), принимающий в
//    качестве аргумента целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что
//    он не равен null. Реализуйте следующую логику:
//            1. Если в какой-то ячейке встретился null,
//            то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    public static void main(String[] args) {
        Integer [] arr = {1,0,8,10,null,4,null};
        checkArray(arr);

    }
    public static void checkArray(Integer[] arr) {
        List<Integer> wrongIndexes = new ArrayList<>();
        for (int i = 0; i< arr.length;i++) {
            if (arr[i] == null){
                wrongIndexes.add(i);
            }


        }
        if (!wrongIndexes.isEmpty()){
        System.out.println("В массиве null по индексам: " + wrongIndexes);}
        else System.out.println("В массиве нет null");




    }

}
