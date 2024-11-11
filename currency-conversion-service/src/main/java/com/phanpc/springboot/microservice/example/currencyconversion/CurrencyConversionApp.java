package com.phanpc.springboot.microservice.example.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.phanpc.springboot.microservice.example.currencyconversion")
@EnableDiscoveryClient
public class CurrencyConversionApp {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionApp.class, args);
    }
}
