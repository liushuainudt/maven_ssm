package com.hd.dao;

import com.hd.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao {

	public List<User> selectUserByName(User user);

	public User login(User user);

	public List<User> selectUserList();

	public List<User> selectUserListByPage(@Param("start")int start , @Param("end")int end);

	public int selectCount();

	public int selectSearchCount(User user);

}
