package Sem2;

class Expr1 {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double res = 0;
        if (b == 0) {
            System.out.println("Делитель не должен быть равен нулю");

        }
        else  {
            res = (double)a/b;
            printSum(a,b);
        }

        return res;

    }

    public static void printSum(int a, int b) {
        // Введите свое решение
        System.out.println(a+b);


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer3 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr1.expr(a, b);
        System.out.println(result);
    }
}
