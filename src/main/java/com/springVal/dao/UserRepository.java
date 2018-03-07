package com.springVal.dao;

import org.springframework.data.repository.CrudRepository;

import com.springVal.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
