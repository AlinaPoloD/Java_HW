package Sem1;

public class Task2 {
//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//            1. если длина массива меньше некоторого заданного минимума, метод возвращает -1,
//            в качестве кода ошибки.
//            2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//            3. если вместо массива пришел null, метод вернет -3
//            4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
//    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//    обработает возвращенное значение и покажет читаемый результат пользователю.
//    Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.


    public static void main(String[] args) {

        System.out.println(checkIndex(new int [] {1,2,3,4,5,6},8,6));


    }

    public static int checkIndex(int [] arr, int value, int min){

        if (arr==null) {
            System.out.println("Массив не может быть null");
            return -3;
        }
        else if (arr.length < min) {
            System.out.println("Длина массива не может быть меньше минимума");

            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                System.out.println("Индекс значения");

                return i;
            }

        }

        System.out.println("Такого значения нет");
        return -2;
    }

}
