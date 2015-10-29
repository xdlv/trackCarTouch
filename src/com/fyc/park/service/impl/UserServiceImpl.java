package com.fyc.park.service.impl;

import java.util.List;

import com.fyc.park.bean.Mod;
import com.fyc.park.bean.ModMapper;
import com.fyc.park.bean.User;
import com.fyc.park.bean.UserMapper;
import com.fyc.park.service.UserService;

public class UserServiceImpl extends BaseServiceImpl implements UserService {

	UserMapper userMapper;
	ModMapper modMapper;

	@Override
	public User userLogin(String name, String pwd) {
		return userMapper.selecUserByNameAndPwd(name, pwd);
	}
	@Override
	public void saveUser(User user) {
		user.setId(getPrimaryKey("t_user"));
		userMapper.insert(user);
	}

	@Override
	public List<Mod> getUserMods(int userId) {
		return modMapper.getUserMods(userId);
	}
	
	@Override
	public List<User> getUsers(int start, int end) {
		return userMapper.selectUsers(start, end);
	}
	@Override
	public int getUsersCount() {
		return userMapper.selectUserCount();
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public void setModMapper(ModMapper modMapper) {
		this.modMapper = modMapper;
	}
}
