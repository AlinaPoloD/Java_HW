package Sem3.Task4;

public class MyArraySizeException extends IllegalArgumentException{
    public MyArraySizeException() {
        super("Некорректный размер массива");
    }
}
