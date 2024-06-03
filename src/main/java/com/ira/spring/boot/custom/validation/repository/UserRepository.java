/**
 * 
 */
package com.ira.spring.boot.custom.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ira.spring.boot.custom.validation.entity.User;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);

}
