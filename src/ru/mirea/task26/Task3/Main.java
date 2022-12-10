package ru.mirea.task26.Task3;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hashtable table = new Hashtable(5,(float) 0.5);
        table.put(1,"Драйв");
        table.put(2,"Бойцовский клуб");
        table.put(3,"Американский психопат");

        System.out.println("Введите значение ключа, элемент которого следует вернуть");
        Scanner scanner = new Scanner(System.in);
        int key=scanner.nextInt();
        String flag= (String) table.get(key);
        if(flag!=null){
            System.out.println(key+" "+flag);
        }else {
            System.out.println("Введенный вами ключ отсутствует в таблице");
        }

        System.out.println("Введите значение ключа, элемент которого следует удалить");
        key=scanner.nextInt();
        flag= (String) table.get(key);
        if(flag!=null){
            table.remove(key);
            System.out.println(table);
        }else {
            System.out.println("Введенный вами ключ отсутствует в таблице");
        }

    }
}
