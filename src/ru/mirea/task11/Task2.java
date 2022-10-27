package ru.mirea.task11;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userTime;
        System.out.print("Введите время в милисекундах >> ");
        userTime = scanner.nextLong();
        Date startDate = new Date(userTime);

        switch (startDate.compareTo(new Date())){
            case -1:
                System.out.println("Дата пользователя меньше системной");
                break;
            case 1:
                System.out.println("Дата пользователя больше системной");
                break;
            case 0:
                System.out.println("Дата пользователя равно системной");
                break;
        }
    }
}
