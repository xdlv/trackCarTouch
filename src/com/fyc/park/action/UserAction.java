package com.fyc.park.action;

import java.util.ArrayList;
import java.util.List;

import com.fyc.park.bean.Mod;
import com.fyc.park.bean.User;
import com.fyc.park.service.UserService;

public class UserAction extends BaseAction {

	User user;
	List<User> users;
	UserService userService;
	List<Mod> mods;
	
	public String userLogin(){
		User userRecord = userService.userLogin(user.getName(), user.getPwd());
		if (userRecord != null){
			users = new ArrayList<User>();
			users.add(userRecord);
		}
		return SUCCESS;
	}
	
	public String obtainUsers(){
		total = userService.getUsersCount();
		users = userService.getUsers(start, start + limit);
		return SUCCESS;
	}
	
	public String saveUser(){
		userService.saveUser(user);
		return FINISH;
	}
	
	public String obtainMod(){
		mods = userService.getUserMods(getIntFilterValue());
		return SUCCESS;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<Mod> getMods() {
		return mods;
	}
}
