package com.flatman.service.users;

import com.flatman.entity.User;

public interface UserService {
	/**
	 * 用户登陆
	 * @param user
	 * @return
	 */
	public String userLogin(User user);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public String addUser(User user);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public String deleteUser(User user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public String updateUser(User user);
}
