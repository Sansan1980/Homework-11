import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculationYear(20010);
        installationOS(2030);


    }

    public static void calculationYear(int year) {
        System.out.println("Задача №1");
        int countingStart = 1584;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print(year + "год — високосный год");
        } else {
            System.out.print(year + "год — не високосный год");
        }
        System.out.println();
        System.out.println("Задача №2");
    }

    public static int definitionOS() {
        System.out.println("введите тип вашей OS, если IOS то введите 0 , а если Android введите 1");
        Scanner console = new Scanner(System.in);
        int os = console.nextInt();
        //  System.out.println(os);
        return os;
    }


    public static void installationOS(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        System.out.println("Год выпуска Вашего телефона " + clientDeviceYear + " года ");
        System.out.println("У вас версия OS " + currentYear + " года");
        label:
        for (int os = definitionOS(); os != 1 || os != 0; os = definitionOS()) {
            if (clientDeviceYear > currentYear) {
                switch (os) {
                    case 1:
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                        break label;
                    case 0:
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                        break label;
                    default:
                        System.out.println(" OS Нераспознана!!! Введены некоректные значения!!!");
                }
            } else {
                switch (os) {
                    case 1:
                        System.out.println("Установите  версию приложения для Android по ссылке");
                        break label;
                    case 0:
                        System.out.println("Установите  версию приложения для iOS по ссылке");
                        break label;
                    default:
                        System.out.println(" OS Нераспознана!!! Введены некоректные значения!!!");
                }
            }
        }


        }
    }





