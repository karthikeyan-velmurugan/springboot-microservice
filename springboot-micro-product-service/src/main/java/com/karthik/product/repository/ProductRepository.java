/**
 * 
 */
package com.karthik.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.product.entity.Product;

/**
 * @author karthik
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findByProdId(Long id);

}
