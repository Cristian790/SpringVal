package com.springVal.service;

import java.util.List;

import com.springVal.model.User;

public interface UserService {

	public List<User> findAll();
	
	public void add(User user);
	
	public void delete(int id);
	
	public void update(User user);
	
	public User findUser(int id);
}
