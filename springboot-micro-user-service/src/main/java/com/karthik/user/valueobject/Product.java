/**
 * 
 */
package com.karthik.user.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author karthik
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Long prodId;
	private String prodName;
	private String prodDescription;
	private String prodCode;

}
