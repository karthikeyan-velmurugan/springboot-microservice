/**
 * 
 */
package com.karthik.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author karthik
 *
 */
@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prodId;
	private String prodName;
	private String prodDescription;
	private String prodCode;

}
