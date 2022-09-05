package com.maazouz.customerservice.Repository;

import com.maazouz.customerservice.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface customerRepository extends JpaRepository<Customer,Long> {
}
