import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculationYear(20010);
        installationOS(2030);
        deliveryTime();
        deliveryTime2(99);

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
        ;
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
        System.out.println("Задача №3");
    }

    public static int deliveryDistance() {
        System.out.println(" Введите ,плиз, дистанцию до адреса доставки");
        Scanner inputDistance = new Scanner(System.in);
        int deliveryDistance = inputDistance.nextInt();
        return deliveryDistance;
    }


    public static void deliveryTime() {
        int a = deliveryDistance();
        if (a <= 100) {
            if (a <= 20) {
                System.out.println(" Доставка 1 сутки");
            } else if (a <= 60) {
                System.out.println(" Доставка 2  суток");
            } else if (a <= 100) {
                System.out.println(" Доставкиа 3 суток");
            }

        } else {
            System.out.println(" Доставки свыше 100 км нет");
        }
    }

    public static void deliveryTime2(int deliveryDistance) {
        int time = 1;

        if (deliveryDistance >= 20) {
            time++;
        }
        if (deliveryDistance >= 60) {
            time++;
        }
        if (deliveryDistance > 100) {
            System.out.println(" Нет доставки");
        } else {
            System.out.println(" Доставка " + time + " Дней");
        }

    }
}





















