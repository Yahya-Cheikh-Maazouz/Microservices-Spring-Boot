package com.example.billingservice.Repository;

import com.example.billingservice.Model.Bill;
import com.example.billingservice.Model.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

}

