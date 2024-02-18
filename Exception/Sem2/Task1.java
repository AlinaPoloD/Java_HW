package Sem2;

import java.util.InputMismatchException;
import java.util.Scanner;



    public class Task1 {
        public static void main(String[] args) {
            run();
        }

        public static void run() {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            int index =0;
            System.out.println(
                    "Укажите индекс элемента массива, " +
                            "в который хотите записать значение 1");
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
            }
            else {
                System.out.println("Неверный формат данных");
            }
            try {

                arr[index] = 1;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Указан индекс за пределами массива");
            }
//            catch (InputMismatchException e){
//                System.err.println("Неверный формат");
//            }
        }
    }
