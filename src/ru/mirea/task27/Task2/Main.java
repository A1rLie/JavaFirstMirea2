package ru.mirea.task27.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Иван", "Демин");
        map.put("Даниил", "Дамарад");
        map.put("Тимур", "Черняков");
        map.put("Иван", "Черняков");
        map.put("Даниил", "Демин");
        return map;
    }
    public static int getSameFirstNameCount(Map<String, String> map, String name)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (lastName.equals(key))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String,String> map=createMap();
        System.out.print("Введите имя >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSameFirstNameCount(map, scanner.next()));
        System.out.print("Введите фамилию >> ");
        System.out.println(getSameLastNameCount(map,scanner.next()));
    }
}
