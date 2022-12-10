package ru.mirea.task29;

import java.util.Arrays;
public class RestaurantTester {
    public static void main(String[] args) {
        System.out.println("\n" + "Заказ в ресторане: ");
        Order restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Dish(600, "Безе", "Хрустящее"));
        try {
            restaurantOrder.add(new Dish(-1, "Фетучини", "Очень вкусные"));
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString());
        }
        restaurantOrder.add(new Drink(190, "Лаймон фреш", "Газированный"));

        System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        OrderManager orderManager = new OrderManager();
        try{
            orderManager.add(restaurantOrder, 1);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }
        try{
            orderManager.add(restaurantOrder, 1);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n" + "Заказ через Интернет: ");
        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish(800, "Брауни", "Нежнейший"));
        internetOrder.add(new Drink(160, "Компот", "Яблочный"));
        String address = "3-я сокольническая, 36";

        try {
            orderManager.add(internetOrder, address);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderManager.add(internetOrder, address);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(Arrays.toString(internetOrder.getMenu()));
    }
}
