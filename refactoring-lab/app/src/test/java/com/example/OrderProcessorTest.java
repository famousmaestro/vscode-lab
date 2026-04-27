package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {
    @Test
    void testPrintOrderSummary() {
        Customer customer = new Customer("John Doe", true);
        Item item1 = new Item("Laptop", 1000.0, 1);
        Item item2 = new Item("Mouse", 50.0, 2);
        Order order = new Order(customer, Arrays.asList(item1, item2));
        
        OrderProcessor processor = new OrderProcessor();
        // Ensuring no exceptions are thrown for now
        assertDoesNotThrow(() -> processor.printOrderSummary(order));
    }
}
