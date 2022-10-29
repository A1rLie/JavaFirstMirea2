package ru.mirea.task13.Task2;

public class Main {

    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person();
        Person pers3 = new Person();

        System.out.println("Имя pers1: " + pers1.getLFF());

        pers2.setFirstName("Даниил");
        System.out.println("Имя pers2: " + pers2.getLFF());

        pers3.setFirstName("Николай");
        pers3.setLastName("Дамарад");
        System.out.println("Имя pers3: " + pers3.getLFF());
    }
}
