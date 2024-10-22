package com.prowings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {

    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
    public class DisplayDuplicatesOrders{

        public static void main(String[] args) {

            List<Order> orderList = new ArrayList<>();
            orderList.add(new Order(101, "Laptop"));
            orderList.add(new Order(101, "Mobile"));
            orderList.add(new Order(101, "Laptop"));
            orderList.add(new Order(104, "SmartTV"));
            orderList.add(new Order(102, "Tablet"));
            orderList.add(new Order(103, "Mobile"));
            orderList.add(new Order(102, "Tablet"));
            orderList.add(new Order(101, "Laptop"));

            // Count occurrences of each order by their ID
            Map<Integer, Long> orderCount = orderList.stream()
                    .collect(Collectors.groupingBy(Order::getId, Collectors.counting()));

            // Filter out duplicate orders based on ID count
            List<Order> duplicateOrders = orderList.stream()
                    .filter(order -> orderCount.get(order.getId()) > 1)
                    .collect(Collectors.toList());

            // Print the duplicate orders
            System.out.println("List of Duplicates:");
            duplicateOrders.forEach(System.out::println);
        }
    }