package Sem2;

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        double res = 0;
        if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        res = Float.NaN;

        } else {

            try {
                res = (double) intArray[8] / d;
                System.out.printf("intArray[8] / d = {%s} / {%s} = {%s}\n",intArray[8],d,res);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");

            }


            //  }


        }
        return res;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer1 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{ 1, 2,3,4,5,6,7,8,9};
            d = 10; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}