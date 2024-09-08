package com.helloshop.service;

import com.helloshop.order.Order;
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Service {
    public static void main(String[] args) {
        User user = new User("fish5478", "요섭");
        System.out.println(user.userId);



        Product product = new Product();
        Order oder = new Order(user,product);
    }
}
