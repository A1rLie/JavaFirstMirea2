package ru.mirea.task11;

import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String developerName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя разработчика >> ");
        developerName = scanner.next();

        long startTime, endTime;
        System.out.print("Дата начала работы в милисекундах >> ");
        startTime = scanner.nextLong();
        Date startDate = new Date(startTime);

        System.out.print("Дата сдачи работы в милисекундах >> ");
        endTime = scanner.nextLong();
        Date endDate = new Date(endTime);

        if (startDate.after(endDate)) System.out.println("Как разработчик мог так сдать работу?");
        else if (startDate.equals(endDate)) {
            System.out.println("Разработчик начал и сдал работу в " + startDate);
        }
        else {
            System.out.println("Разработчик начал работу в " + startDate + "\n" +
                    "Закончил работу в " + endDate);
        }
    }
}
