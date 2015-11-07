package com.flatman.db.user;

import com.flatman.entity.User;

public interface UserDao {
	/**
	 * 根据id查找user
	 * @param id
	 * @return
	 */
	public User getUserById(Object id);
	
	/**
	 * 根据 username 查找user
	 * @param username
	 * @return
	 */
	public User getUserByUserName(String username);
}
