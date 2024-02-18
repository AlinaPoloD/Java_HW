package Sem3;

import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable{
    int count = 0;
    boolean closed = false;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Ресурс закрыт");
        }
        count++;


    }
    public void close() throws Exception {
        if (!closed) {
            closed=true;
        }

    }

    @Override
    public String toString() {
        return "count=" + count;
    }
}
class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
            counter.add();
            System.out.println(counter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //     Counter counter = new Counter();
//        try {
//            counter.add();
//            System.out.println(counter);
//            try {
//                counter.close();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            counter.add();
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//
//        }

    }
}