import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        printTask(1);
        int checkingYear = 2022;
        boolean isThisALeapYear = checkIfYearIsLeap(checkingYear);
        printIsYearALeap(checkingYear, isThisALeapYear);

        printTask(2);
        byte clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        suggestCorrectVersion(clientOS, currentYear);

        printTask(3);
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryTime(deliveryDistance));
    }

    private static int calculateDeliveryTime(int distance) {
        int deliveryDays;
        int oneMoreDay = (distance - 20) % 40;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (oneMoreDay == 0) {
            deliveryDays = 1 + ((distance - 20) / 40);
        } else {
            deliveryDays = 2 + ((distance - 20) / 40);
        }
        return deliveryDays;
    }

    private static void suggestCorrectVersion(byte OS, int year) {
        if (OS == 0) {
            if (year < 2015) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (OS == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("В этой задаче только две ОС, не балуйся");
        }
    }

    public static boolean checkIfYearIsLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void printIsYearALeap(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void printTask(int taskNumber) {
        System.out.println("\n***********");
        System.out.println("Задание " + taskNumber);
    }
}