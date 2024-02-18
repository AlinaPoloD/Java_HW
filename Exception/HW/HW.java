package HW;


import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HW {
    static  boolean isCorrect = true;

    public static void main(String[] args) throws ParseException, IOException {
        try {
            inputData();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void inputData() throws IOException, IllegalArgumentException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные, они должны быть разделены пробелом, порядок должен быть строго соблюден:\n" +
                "Фамилия Имя Отчество дата рождения(формат dd.mm.yyyy) номер телефона(от 7 до 11  цифр) пол(f или m)");

        String next = scanner.nextLine();

        String[] data = next.split(" ");

        if (data.length == 6) {
            data = checked(data);

            if (!HW.isCorrect()) {
                throw new IOException("Файл не записан");
            } else {

                fileWriter(data);


            }
        }
        else throw new IllegalArgumentException("Неверное количество введенных данных, введите все данные через пробел");


    }






    public static String [] checked(String [] arr)  {



        try {
            arr[0] = checkedName(arr[0]);

        }
        catch (NameException e) {
            System.out.println(e.getMessage() + "фамилии");
            HW.setCorrect(false);

        }
        try {
            arr [1] = checkedName(arr[1]);

        }
        catch ( NameException e) {
            System.out.println(e.getMessage() + "имени");
            HW.setCorrect(false);
        }




        try {
           arr[2] = checkedName(arr[2]);

        }

        catch ( NameException e) {
            System.out.println(e.getMessage()+"отчества");
            HW.setCorrect(false);





        }
        try  {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                // formatter.setLenient(false); // <== Added this line
        formatter.parse(arr[3]);


        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            HW.setCorrect(false);





        }

        if ((arr[4].length() > 11) || arr[4].length() <7  || !arr[4].matches("[-+]?\\d+")){
            System.out.println("Неверный формат номера телефона, должны быть только цифры, от 7 до 11 цифр");
            HW.setCorrect(false);





        }
        if (!arr[5].equals("f") && !arr[5].equals("m")) {
            System.out.println("Неверный формат пола");
            HW.setCorrect(false);



        }



        return arr;

    }



    public static String checkedName(String s) {

            if (s.length() < 3 || !s.matches("[\\p{L}| ]+")){
                throw new NameException("Неверный формат ");
            }
            return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();



    }

    public static void fileWriter(String [] data) throws IOException {
        // <Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>

        Person person = new Person(data[0],data[1],data[2],data[3],data[4],data[5]);


        try (FileWriter fw = new FileWriter(person.getSurname(),true))
                {
            fw.write(person.toString());
                    System.out.println("Файл успешно записан");

        }



        }

    public static boolean isCorrect() {
        return isCorrect;
    }

    public static void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}


