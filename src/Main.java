import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        calculateYear(2010);
        installOS(2024);
        calculateDeliveryTime();
        calculateDeliveryTime(99);
    }

    public static void calculateYear(int year) {
        System.out.println("Задача 1");
        int countingStart = 1584;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print(year + "год — високосный год");
        } else {
            System.out.print(year + "год — не високосный год");
        }
    }

    public static int definitionOS() {
        System.out.println("Задача №2");
        System.out.println("введите тип вашей OS, если IOS то введите 0 , а если Android введите 1");
        Scanner console = new Scanner(System.in);
        int os = console.nextInt();
        return os;
    }

    public static void installOS(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        System.out.println("Год выпуска Вашего телефона " + clientDeviceYear + " года ");
        System.out.println("У вас версия OS " + currentYear + " года");
        label:
        for (int os = definitionOS(); true ; os = definitionOS()) {
            if (clientDeviceYear < currentYear) {
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

    public static int deliveryDistance() {
        System.out.println("Задача №3");
        System.out.println(" Введите ,плиз, дистанцию до адреса доставки");
        Scanner inputDistance = new Scanner(System.in);
        int deliveryDistance = inputDistance.nextInt();
        return deliveryDistance;
    }


    public static void calculateDeliveryTime() {
        int a = deliveryDistance();
        if (a <= 100) {
            if (a <= 20) {
                System.out.println(" Доставка 1 сутки");
            } else if (a <= 60) {
                System.out.println(" Доставка 2  суток");
            } else {
                System.out.println(" Доставка 3 суток");
            }

        } else {
            System.out.println(" Доставки свыше 100 км нет");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        int time = 1;

        if (deliveryDistance >= 20) {
            time++;
        }
        if (deliveryDistance >= 60) {
            time++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Нет доставки");
        } else {
            System.out.println("Доставка " + time + " суток ");
        }

    }
}