package com.example.billingservice.Model;

import javax.persistence.Entity;

import com.example.billingservice.Model.pojo.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public
class Bill{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private long customerID;
    @Transient private Customer customer;
}
