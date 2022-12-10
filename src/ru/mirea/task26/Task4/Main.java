package ru.mirea.task26.Task4;

import java.util.HashSet;
import java.util.Iterator;

class Test
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("Первый");
        h.add("Второй");
        h.add("Третий");
        h.add("Второй");

        System.out.println(h);
        System.out.println("Список содержит contains India or not:" + h.contains("India"));

        h.remove("Второй");
        System.out.println("Измененный список: "+h);

        System.out.println("Перебор элементов:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
