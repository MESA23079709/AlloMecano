package com.alloMecano.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = { "com.alloMecano.crud"})
public class AlloMecanoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlloMecanoBackendApplication.class, args);
    }



}

