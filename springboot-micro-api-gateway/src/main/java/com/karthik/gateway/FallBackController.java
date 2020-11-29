/**
 * 
 */
package com.karthik.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author karthik
 *
 */
@RestController
public class FallBackController {

	@GetMapping("/userservicefallback")
	public String getUserServiceFallBack() {
		return "User Service is take longer then expected. Please check after sometime.";
	}

	@GetMapping("/productservicefallback")
	public String getProductServiceFallBack() {
		return "Product Service is take longer then expected. Please check after sometime.";
	}


}
