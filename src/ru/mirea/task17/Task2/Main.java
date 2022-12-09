package ru.mirea.task17.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        System.out.println("Введите данные сотрудника");
        System.out.print("Имя: ");
        controller.setEmployeeName(scanner.next());
        System.out.print("Дней отработано: ");
        controller.setEmployeeDaysWorked(scanner.nextInt());
        System.out.print("Дневная зарплата: ");
        controller.setEmployeePayForDay(scanner.nextInt());
        System.out.println("Обновление данных...");
        controller.updateView();
    }
    private static Employee
    retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Игорь");
        employee.setDaysWorked(369);
        employee.setPayForDay(1337);
        return employee;
    }

}
