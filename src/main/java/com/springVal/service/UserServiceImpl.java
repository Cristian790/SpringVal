package com.springVal.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springVal.dao.UserRepository;
import com.springVal.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		List<User> users=new ArrayList<>();
		for(User user:userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
	
	public void add(User user) {
		userRepository.save(user);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public User findUser(int id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}
}
