import java.sql.SQLOutput;

public class Main {

    static int year = 2000;

    public static void main(String[] args) {
        checkYear();
    }


/*
 Задача 1
 Реализуйте метод, который получает в качестве параметра год, проверяет,
 является ли он високосным, и выводит результат в консоль.
 Эту проверку вы уже реализовывали в задании по условным операторам.
 Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
 Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
  «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
     */
    public static void printleapYear() {
        System.out.println(year + " год — високосный год");
    }
    public static void printYear() {
        System.out.println(year + " год — невисокосный год");
    }
    public static void checkYear() {
        int limitYear = 1584;
        if (year >= limitYear && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printleapYear();
        } else {
            printYear();
        }
    }


}
