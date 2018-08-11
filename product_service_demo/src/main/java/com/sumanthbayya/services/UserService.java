package com.sumanthbayya.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanthbayya.entities.User_Profiles;
import com.sumanthbayya.repositories.UserDAO;
import com.sumanthbayya.vo.UserVo;

@Service
public class UserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserDAO userDao;
	
	public List<UserVo> getUsersList(){
		LOG.info("fetching all user data.");
		Iterable<User_Profiles> locationList = userDao.findAll();
		List<UserVo> userVOList = new ArrayList<UserVo>();
		for (User_Profiles userDbObj : locationList) {
			UserVo userObj = new UserVo();
			userObj.setUsername(userDbObj.getUserName());
			userObj.setPassword(userDbObj.getPassword());
			userObj.setActiveflag(userDbObj.getUserActiveFlag());
			userVOList.add(userObj);
		}
		return userVOList;
	}
	
	
	public boolean singupUser(UserVo signupUser){
		
		User_Profiles userObj = new User_Profiles();
		userObj.setUserName(signupUser.getUsername());
		userObj.setPassword(signupUser.getPassword());
		userObj.setUserActiveFlag("y");
		List<UserVo> allUsersList= getUsersList();
		for (UserVo userVo : allUsersList) {
			if(userVo.getUsername().equals(signupUser.getUsername())){
				return false;
			}
		}
		userDao.save(userObj);
		return true;
		
	}
	
	public boolean userSigninCheck(UserVo signinUser){
		List<UserVo> allUsersList= getUsersList();
		for (UserVo userVo : allUsersList) {
			if(userVo.getUsername().equals(signinUser.getUsername()) && userVo.getPassword().equals(signinUser.getPassword())){
				return true;
			}
		}
		
		return false;
		
	}
	
	
	

}
