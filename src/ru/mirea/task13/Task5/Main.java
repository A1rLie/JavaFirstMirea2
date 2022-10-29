package ru.mirea.task13.Task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона >> ");
        StringBuilder telephonNumber = new StringBuilder(scanner.next());
        if (!telephonNumber.toString().startsWith("+")){
            telephonNumber.insert(0, "+");
        }

        telephonNumber.insert(5, "-");
        telephonNumber.insert(9, "-");
        System.out.println(telephonNumber);
    }

}
