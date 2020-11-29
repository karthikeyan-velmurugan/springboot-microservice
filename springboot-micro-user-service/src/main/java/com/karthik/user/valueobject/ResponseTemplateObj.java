/**
 * 
 */
package com.karthik.user.valueobject;

import com.karthik.user.entity.User;

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
public class ResponseTemplateObj {
	
	private User user;
	private Product product;

}
