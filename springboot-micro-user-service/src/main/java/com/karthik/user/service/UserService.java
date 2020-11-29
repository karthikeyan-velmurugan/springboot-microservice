/**
 * 
 */
package com.karthik.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.karthik.user.entity.User;
import com.karthik.user.repository.UserRepository;
import com.karthik.user.valueobject.Product;
import com.karthik.user.valueobject.ResponseTemplateObj;

/**
 * @author karthik
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateObj getUserProduct(Long id) {
		ResponseTemplateObj obj=new ResponseTemplateObj();
		User usr=userRepository.findByUserId(id);
		Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/products/findProd/"+usr.getProdId() , Product.class);
		obj.setUser(usr);
		obj.setProduct(product);
		return obj;
	}


}
