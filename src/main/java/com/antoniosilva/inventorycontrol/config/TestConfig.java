package com.antoniosilva.inventorycontrol.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        
        
    }
    
}
