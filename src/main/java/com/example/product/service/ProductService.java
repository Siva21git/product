package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.dao.ProductDao;
import com.example.product.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao prodao;
	public String setProduct(Product p) {
		return prodao.setProduct(p);
	}
	public String setAllProduct(List<Product>p) {
		return prodao.setAllProduct(p);
	}
	public Product getProductById(int id) {
		return prodao.getProductById(id);
	}
	public List<Product> getAllProduct(){
		return prodao.getAllProduct();
	}

}
