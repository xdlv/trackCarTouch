package com.fyc.park.service;

import java.util.List;

import com.fyc.park.bean.Mod;
import com.fyc.park.bean.User;

public interface UserService extends BaseService {

	User userLogin(String name, String pwd);
	
	List<Mod> getUserMods(int userId);
}
