package com.neoxiontechnologies.demo.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.neoxiontechnologies.demo.entities.Product;

public interface UserService {

	UserDetails findByEmail(String email );

	List<Product> loadUsersPerPage(Integer numberOfRows, Integer page);

	List<Product> loadAll();

 

}
