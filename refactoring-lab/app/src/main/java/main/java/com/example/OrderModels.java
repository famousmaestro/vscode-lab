package main.java.com.example;

import java.util.List;

class Order {
    private Customer customer;
    private List<Item> items;
    private Payment payment;

    public Order(Customer customer, List<Item> items, Payment payment) {
        this.customer = customer;
        this.items = items;
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(i -> i.getPrice() * i.getQuantity()).sum();
    }
}

class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class Customer {
    private String name;
    private boolean isMember;
    private boolean isPremium;

    public Customer(String name, boolean isMember, boolean isPremium) {
        this.name = name;
        this.isMember = isMember;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return isMember;
    }

    public boolean isPremium() {
        return isPremium;
    }
}

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
