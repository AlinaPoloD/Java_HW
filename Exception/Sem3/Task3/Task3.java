package Sem3.Task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        try {

            System.out.println(divideByZero(10,0));

        }
        catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            fileNotFound("task.txt");
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }

    }

    public static int divideByZero(int a, int b) {
    if (b==0) {
        throw new DivideByZeroException("Делание на ноль");
    }
        return a/b;

    }

    public static void fileNotFound (String path) throws NonExistedFileException {
        try {
            FileReader fr = new FileReader(path);

        }
        catch (FileNotFoundException e ){
            throw new NonExistedFileException("Файл не найден");
        }

    }
}
