/**
 * 
 */
package com.karthik.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.product.entity.Product;
import com.karthik.product.repository.ProductRepository;

/**
 * @author karthik
 *
 */
@Service 
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Product findByProdId(Long id) {
		return productRepository.findByProdId(id);
	}

}
