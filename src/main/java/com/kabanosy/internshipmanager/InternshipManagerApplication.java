package com.kabanosy.internshipmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class InternshipManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternshipManagerApplication.class, args);
    }

}
