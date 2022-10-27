package ru.mirea.task11;

import java.util.*;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        var list = new LinkedList<Integer>();
        var array = new ArrayList<Integer>();

        System.out.println("Операция добавления в конец");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            array.add(i);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            list.add(i);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");

        System.out.println("--------------------------------------------");

        System.out.println("Операция удаления с начала");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_00; i++){
            array.remove(0);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");
        array.clear();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_00; i++){
            list.remove(0);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");
        list.clear();

        System.out.println("--------------------------------------------");

        System.out.println("Операция вставки в начало");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            array.add(0, i);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            list.add(0, i);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");

        System.out.println("--------------------------------------------");

        System.out.println("Операция поиска последнего элемента");
        startTime = System.currentTimeMillis();
        array.indexOf(0);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        array.indexOf(0);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");
    }
}
