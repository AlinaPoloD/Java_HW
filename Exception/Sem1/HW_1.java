package Sem1;

class Answer {
//    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//    Метод divisionByZero - Деление на 0
//
//    Метод numberFormatException - Ошибка преобразования строки в число
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        throw new ArrayIndexOutOfBoundsException();

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        throw new ArithmeticException();

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        throw new NumberFormatException();

    }
}

public class HW_1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}