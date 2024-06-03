/**
 * 
 */
package com.ira.spring.boot.custom.validation.service;

import java.util.List;

import com.ira.spring.boot.custom.validation.dto.UserRequest;
import com.ira.spring.boot.custom.validation.entity.User;
import com.ira.spring.boot.custom.validation.exception.UserNotFoundException;

/**
 * 
 */
public interface UserService {

    User saveUser(UserRequest request);

    List<User> getAllUsers();

    User getUser(int id) throws UserNotFoundException;

}
