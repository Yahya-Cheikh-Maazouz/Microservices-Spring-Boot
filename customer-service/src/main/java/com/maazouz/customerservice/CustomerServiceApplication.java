package com.maazouz.customerservice;

import com.maazouz.customerservice.Model.Customer;
import com.maazouz.customerservice.Repository.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(customerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null,"yahya","test@test.com"));
            customerRepository.save(new Customer(null,"diallo","test@test.com"));
            customerRepository.save(new Customer(null,"ilyass","test@test.com"));
            customerRepository.save(new Customer(null,"mehdi","test@test.com"));

            customerRepository.findAll().forEach(customer->{
                System.out.println(customer.getName());
                System.out.println(customer.getId());
            });
        };
    }
}
