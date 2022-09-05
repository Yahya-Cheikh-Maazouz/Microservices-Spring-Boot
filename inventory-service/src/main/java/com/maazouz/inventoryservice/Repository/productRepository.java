package com.maazouz.inventoryservice.Repository;

import com.maazouz.inventoryservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface productRepository extends JpaRepository<Product,Long> {
}
