package Sem1;

public class Task1 {
//    Реализуйте метод, принимающий в качестве аргументов целочисленный массив
//    и некоторый допустимый минимум.
//    Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
//    в качестве кода ошибки, иначе - длину массива.


    public static void main(String[] args) {

        int [] arr = {1,5,8,5,4};
        System.out.println(lengthMassive(arr,2));

    }

    public static int lengthMassive(int [] arr, int min){
        if (arr.length < min) {
            return -1;
        }


        return arr.length;
    }

}
