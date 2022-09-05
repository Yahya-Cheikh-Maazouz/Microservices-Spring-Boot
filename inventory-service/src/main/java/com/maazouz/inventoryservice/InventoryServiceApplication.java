package com.maazouz.inventoryservice;

import com.maazouz.inventoryservice.Model.Product;
import com.maazouz.inventoryservice.Repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(productRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null,"iphone 1",5000));
            productRepository.save(new Product(null,"clavier",878));
            productRepository.save(new Product(null,"souris",379));

            productRepository.findAll().forEach(product->{
                System.out.println(product.getName()+" : "+product.getPrice());
            });
        };
    }
}
