package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService proser;
	@PostMapping(value="/insertproduct")
	public String setProduct(@RequestBody Product p) {
		return proser.setProduct(p);
	}
	@PostMapping(value="/insertallproduct")
	public String setAllProduct(@RequestBody List<Product> p) {
		return proser.setAllProduct(p);
	}
	@GetMapping(value="/getproduct/{id}")
	public Product getProductById(@PathVariable int id) {
		return proser.getProductById(id);
	}
	@GetMapping(value="/getallproduct")
	public List<Product> getAllProduct(){
		return proser.getAllProduct();
	}

}
