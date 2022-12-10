package ru.mirea.task21.task4;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Object> list = new LinkedList<>();
    public static void main(String[] args) {
        File file = new File("C:\\Users\\defox\\OneDrive\\Рабочий стол");
        Collections.addAll(list, file.listFiles());
        for(int i=0;i<5;++i) {
            System.out.println(list.get(i));
        }
    }
}
