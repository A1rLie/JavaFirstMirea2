package ru.mirea.task17.Task2;

public class EmployeeView {
    public void printCourseDetails(String EmployeeName, int EmployeeDaysWorked, int EmployeePayForDay){
        System.out.println("Характеристики: ");
        System.out.println("Имя: " + EmployeeName);
        System.out.println("Отработано: " + EmployeeDaysWorked);
        System.out.println("З/п в день: " + EmployeePayForDay);
        System.out.println("З/п в месяц: " + EmployeeDaysWorked*EmployeePayForDay);
    }
}
