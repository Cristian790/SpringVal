package com.springVal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springVal.model.User;
import com.springVal.service.UserService;

@Controller
@RequestMapping(path="/SpringVal")
public class MainController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/json",method=RequestMethod.GET)
	public @ResponseBody Iterable<User> getAllUser(){
		return userService.findAll();
	}
}
