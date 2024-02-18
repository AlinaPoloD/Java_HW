package Sem3.Task3;
/*
* Задание 3.2
        * Создайте класс исключения, которое будет возникать при попытке
        * открыть несуществующий файл.
        * Исключение должно отображать понятное для пользователя сообщение об ошибке.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class NonExistedFileException extends FileNotFoundException {


    public NonExistedFileException(String s ) {
        super(s);
    }

}
