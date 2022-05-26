package com.neoxiontechnologies.demo.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.neoxiontechnologies.demo.dao.ProductRepository;
import com.neoxiontechnologies.demo.entities.Product;
import com.neoxiontechnologies.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> loadAll() {

		return productRepository.findAll();

	}

	@Override
	public List<Product> loadUsersPerPage(Integer numberOfRows, Integer page) {
		PageRequest pageable = PageRequest.of(Integer.parseInt(page.toString()),
				Integer.parseInt(numberOfRows.toString()));
		Page<Product> findByPageProducts = productRepository.findByPageProducts(pageable);
		Stream<Product> stream = findByPageProducts.get();
		List<Product> collect = stream.collect(Collectors.toList());
		return collect;

	}

	@Override
	public UserDetails findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
