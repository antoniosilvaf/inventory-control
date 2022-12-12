package com.antoniosilva.inventorycontrol.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.antoniosilva.inventorycontrol.model.Order;
import com.antoniosilva.inventorycontrol.model.User;
import com.antoniosilva.inventorycontrol.model.enums.OrderStatus;
import com.antoniosilva.inventorycontrol.repository.UserRepository;
import com.antoniosilva.inventorycontrol.service.OrderRepository;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        orderRepository.deleteAll();

        User user1 = new User(null, "Raffaello Sanzio", "11111111111", "rafaello@gmail.com", "rafaello1483");
        User user2 = new User(null, "Vincent van Gohg", "222222222222", "vincent@gmail.com", "gohg1853");
        User user3 = new User(null, "Pablo Picasso", "33333333333", "pablo@gmail.com", "pablo1881");

        userRepository.saveAll(Arrays.asList(user1, user2, user3));

        Order order1 = new Order(null, Instant.parse("2022-10-11T12:12:17Z"), user1, OrderStatus.PAID);
        Order order2 = new Order(null, Instant.parse("2022-10-12T16:54:31Z"), user1, OrderStatus.SHIPPED);
        Order order3 = new Order(null, Instant.parse("2022-10-16T13:23:34Z"), user2, OrderStatus.WAITING_FOR_PAYMENT);
        Order order4 = new Order(null, Instant.parse("2022-10-16T09:53:21Z"), user3, OrderStatus.DELIVERED);
        Order order5 = new Order(null, Instant.parse("2022-10-25T23:31:11Z"), user3, OrderStatus.CANCELED);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5));

    }
    
}
