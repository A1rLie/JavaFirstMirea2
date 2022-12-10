package ru.mirea.task27.Task1;

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Третий");
        set.add("Второй");
        set.add("Первый");
        System.out.println("HashSet: " + set);
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Отсортированный HashSet: " + list);
        Set<String> tree_set = new TreeSet<String>(set);

        System.out.println("Отсортированный TreeSet: ");
        System.out.print("[");
        for(String element : tree_set){
            System.out.print(element+" ");
        }
        System.out.println("]");
    }
}
