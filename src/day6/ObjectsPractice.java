package day6;

import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void WorkingWithOrders() {
        Order firstOrder = new Order();  // - Создали копию обьекта Ордер
        // для того что б потом с ней работать и внесли её в переменную!
        firstOrder.setTotalPrice(12.34);
        firstOrder.getAddress ("Rigas str. 22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Lubanas str. 43-13");
        secondOrder.setItemCount(3);

        System.out.println("Hello World");
        System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order");
        System.out.println(secondOrder.getTotalPrice());
    }
}
