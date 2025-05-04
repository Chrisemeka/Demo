package com.example.auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository repository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Only add users if the repository is empty
            if (repository.count() == 0) {
                // Create an admin user
                User admin = new User(
                        "admin",
                        passwordEncoder.encode("admin123"),
                        Role.ADMIN
                );
                
                // Create a regular user
                User user = new User(
                        "user",
                        passwordEncoder.encode("user123"),
                        Role.USER
                );
                
                // Save users to database
                repository.save(admin);
                repository.save(user);
            }
        };
    }
}