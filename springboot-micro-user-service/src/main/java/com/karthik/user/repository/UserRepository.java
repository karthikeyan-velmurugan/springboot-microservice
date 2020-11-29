/**
 * 
 */
package com.karthik.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.user.entity.User;

/**
 * @author karthik
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long id);

}
