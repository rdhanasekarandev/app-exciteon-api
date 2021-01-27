package com.exciteon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ExciteonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExciteonApplication.class, args);
    }
}
