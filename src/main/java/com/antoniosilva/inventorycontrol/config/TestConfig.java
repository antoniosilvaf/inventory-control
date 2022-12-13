package com.antoniosilva.inventorycontrol.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.antoniosilva.inventorycontrol.model.Category;
import com.antoniosilva.inventorycontrol.model.Order;
import com.antoniosilva.inventorycontrol.model.Product;
import com.antoniosilva.inventorycontrol.model.User;
import com.antoniosilva.inventorycontrol.model.enums.OrderStatus;
import com.antoniosilva.inventorycontrol.repository.CategoryRepository;
import com.antoniosilva.inventorycontrol.repository.OrderRepository;
import com.antoniosilva.inventorycontrol.repository.ProductRepository;
import com.antoniosilva.inventorycontrol.repository.UserRepository;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        orderRepository.deleteAll();
        categoryRepository.deleteAll();
        productRepository.deleteAll();

        Category cat1 = new Category(null, "Books");
		Category cat2 = new Category(null, "Clothes");
		Category cat3 = new Category(null, "Eletronics");
        Category cat4 = new Category(null, "Consumables");
        Category cat5 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Magician's Nephew", "The Magician's Nephew is a fantasy children's novel by C. S. Lewis, published in 1955 by The Bodley Head. It is the sixth published of seven novels in The Chronicles of Narnia.", 20.0);
		Product p2 = new Product(null, "Smart TV", "Smart TV 50'' Crystal UHD 4K.", 409.90);
		Product p3 = new Product(null, "Macbook Air", "MacBook Air with M1 is an incredibly portable laptop.", 999.0);
		Product p4 = new Product(null, "Doritos Nacho Cheese", "Doritos Flamin' Hot Variety Pack (36 Pack).", 21.86);
		Product p5 = new Product(null, "Rails for Dummies", "Quickly create Web sites with this poweful tool Use this free and easy programming language for e-commerce sites and blogs.", 31.99);
        Product p6 = new Product(null, "Linkin Park T-shirt", "Linkin Park 'Soldier' (White) T-Shirt.", 18.99);
		Product p7 = new Product(null, "Gaming Desktop", "AMD Ryzen 5 5600G - HyperX 8GB Memory - NVIDIA GeForce GTX 1660 SUPER - 512GB SSD - Ceramic White", 1049.99);

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

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
