/**
 * 
 */
package com.karthik.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.product.entity.Product;
import com.karthik.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author karthik
 *
 */
@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody Product product) {
		log.info ("Inside saveProduct controller..");

		return productService.saveProduct(product);
	}

	@GetMapping("/findProd/{id}")
	public Product findProductByID(@PathVariable("id") Long id) {
		log.info ("Inside findProductById controller..");

		return productService.findByProdId(id);
	}

}
