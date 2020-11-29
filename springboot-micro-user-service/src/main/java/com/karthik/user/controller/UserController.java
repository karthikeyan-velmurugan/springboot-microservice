/**
 * 
 */
package com.karthik.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.user.entity.User;
import com.karthik.user.service.UserService;
import com.karthik.user.valueobject.ResponseTemplateObj;

import lombok.extern.slf4j.Slf4j;

/**
 * @author karthik
 *
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser controller...");
		return userService.saveUser(user);
	} 

	@GetMapping("/getuser/{id}")
	public ResponseTemplateObj getUserProduct(@PathVariable("id") Long id) {
		return userService.getUserProduct(id);

	}
}
