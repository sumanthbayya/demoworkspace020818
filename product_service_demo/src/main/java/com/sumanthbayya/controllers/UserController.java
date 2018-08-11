package com.sumanthbayya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sumanthbayya.services.UserService;
import com.sumanthbayya.vo.UserVo;

@RestController
@RequestMapping(value = "v1/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserVo> getAllUsers(){
		return userService.getUsersList();
		
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public boolean signupUser(@RequestBody UserVo userVo){
		
		return userService.singupUser(userVo);
	}
	
	
	@RequestMapping(value="/signin", method = RequestMethod.POST)
	public boolean signInUser(@RequestBody UserVo userVo){
		
		return userService.userSigninCheck(userVo);
	}
	
	
}
