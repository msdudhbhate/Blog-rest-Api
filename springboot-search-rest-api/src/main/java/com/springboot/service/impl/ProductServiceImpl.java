package com.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Product;
import com.springboot.repository.ProductRepository;
import com.springboot.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products = productRepository.searchProducts(query);
		return products;
	}
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
