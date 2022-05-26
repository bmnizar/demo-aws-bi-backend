package com.neoxiontechnologies.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neoxiontechnologies.demo.entities.Product;
import com.neoxiontechnologies.demo.services.UserService;

@Controller
@RequestMapping("DemoRest")
public class DemoRest {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/listAllProducts") //
	@ResponseBody
	public List<Product> listAllProducts() {

		return userService.loadAll();

	}
	@GetMapping(value = "/listPerPageProducts") //
	@ResponseBody
	public List<Product> listPerPageProducts() {

		return userService.loadUsersPerPage(5, 1);

	}
}
