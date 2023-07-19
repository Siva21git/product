package com.example.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository prorepo;
	public String setProduct(Product p) {
		prorepo.save(p);
		return "Successfully added";
	}
	public String setAllProduct(List<Product>p) {
		prorepo.saveAll(p);
		return "Successfully added all product";
	}
	public Product getProductById(int id) {
		return prorepo.findById(id).get();
	}
	public List<Product> getAllProduct(){
		return prorepo.findAll();
	}

}
