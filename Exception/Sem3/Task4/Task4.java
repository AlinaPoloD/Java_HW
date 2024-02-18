package Sem3.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][] {
            {"1", "1.5", "1.5"},
            {"1", "hf", "1.5"},
            {"huhj", "1.5", "d"}
    };

    public static void main(String[] args) {
        System.out.println(sum2d(arr));

    }

    public static double sum2d(String[][] arr) {

        List<Point2D> listPoint = new ArrayList<>();
        double sum =0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=arr.length){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (!isNumber(arr[i][j])) {
                    listPoint.add(new Point2D(i, j));

                } else {
                    sum += Double.parseDouble(arr[i][j]);
                }
            }

            }
            if (!listPoint.isEmpty()) {
                throw new MyArrayDataException(listPoint);
            }





        return sum;
    }

    public static boolean isNumber(String s){
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }





    }



}