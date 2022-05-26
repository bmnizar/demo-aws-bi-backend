package com.neoxiontechnologies.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neoxiontechnologies.demo.entities.Product;

/**
 ** @BMN 2021
 **
 **/
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("Select c from Product c    ")
	Page<Product> findByPageProducts(PageRequest pageable);

}
