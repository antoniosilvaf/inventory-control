package com.antoniosilva.inventorycontrol.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.antoniosilva.inventorycontrol.model.User;
import com.antoniosilva.inventorycontrol.repository.UserRepository;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        
        User user1 = new User(null, "Raffaello Sanzio", "11111111111", "rafaello@gmail.com", "rafaello1483");
        User user2 = new User(null, "Vincent van Gohg", "222222222222", "vincent@gmail.com", "gohg1853");
        User user3 = new User(null, "Pablo Picasso", "33333333333", "pablo@gmail.com", "pablo1881");
        
        userRepository.saveAll(Arrays.asList(user1, user2, user3));
    }
    
}
