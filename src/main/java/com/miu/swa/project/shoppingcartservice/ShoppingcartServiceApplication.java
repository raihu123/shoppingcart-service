package com.miu.swa.project.shoppingcartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingcartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingcartServiceApplication.class, args);
    }

}
