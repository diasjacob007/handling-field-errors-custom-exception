/**
 * 
 */
package com.ira.spring.boot.custom.validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ira.spring.boot.custom.validation.dto.UserRequest;
import com.ira.spring.boot.custom.validation.entity.User;
import com.ira.spring.boot.custom.validation.exception.UserNotFoundException;
import com.ira.spring.boot.custom.validation.repository.UserRepository;

/**
 * 
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(UserRequest request) {
        User user = new User(0, request.getName(), request.getAge(), request.getEmail(), request.getMobile(),
                request.getGender(), request.getNationality(), request.getEmployeeType());
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUser(int id) throws UserNotFoundException {
        User user = repository.findByUserId(id);
        if (user!=null)
        	return user;
        throw new UserNotFoundException("No user exists with this id: " +id);
    }

}
